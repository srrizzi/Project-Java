package edu.AprendendoSintaxeJava.Operadores;

public class Operators 
{
    public static void main(String[] args) 
    {
        double sum = 10.5 + 13.7;
        int sub = 10 - 7;
        int mult = 20 * 7;
        int div = 15 / 3;
        int mod = 18 % 3;
        double result = (sum * sub) + (mult / div) + mod;

        System.out.println(result);

        String fullName = "Sky" + "Net";

        System.out.println(fullName);

        String concatenation = "?";

        concatenation = 1 + 1 + 1 + "1";

        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + 1;

        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + "1";

        System.out.println(concatenation);

        concatenation = "1" + 1 + 1 + 1;

        System.out.println(concatenation);

        concatenation = "1" + (1 + 1 + 1);

        System.out.println(concatenation);

        String message = result > sum ? "Nice" : "Loser!";

        System.out.println(message);


    }    
}
