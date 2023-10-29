package org.sen;
import java.io.*;

public class InsecureDeserialization {
    public static void main(String[] args) {
        try {
            // Serialize an object
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(new Object());
            objectOutputStream.close();

            byte[] serializedData = byteArrayOutputStream.toByteArray();

            // Insecure deserialization
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object deserializedObject = objectInputStream.readObject();

            // Perform some action with the deserialized object (unsafe)
            System.out.println("Deserialized object: " + deserializedObject.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
