package org.sen;

import java.io.IOException;

public class VulnerableCode {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Please provide a command-line argument.");
            return;
        }

        // Lack of Input Validation
        String userInput = args[0];

        // Insecure Deserialization
        try {
            // Simulate insecure deserialization (unsafe)
            byte[] serializedData = userInput.getBytes();
            Object deserializedObject = SerializationUtil.deserialize(serializedData);
            System.out.println("Deserialized object: " + deserializedObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SerializationUtil {
    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        // Simulate deserialization (unsafe)
        java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(data);
        java.io.ObjectInputStream is = new java.io.ObjectInputStream(in);
        return is.readObject();
    }
}

