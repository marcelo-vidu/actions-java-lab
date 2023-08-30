package org.sen;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("I am your lab Java application!");

        DeepThought ourSuperComputer = new DeepThought();
        int ans = ourSuperComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();
        System.out.println(ans);
    }
}