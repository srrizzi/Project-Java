package edu.AprendendoSintaxeJava.TerminalArgument;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your first name:");
        String name = scanner.next();

        System.out.println("Enter your last name:");
        String lastName = scanner.next();

        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.next());

        System.out.println("Enter your height:");
        double height = Double.parseDouble(scanner.next());

        System.out.println("============================================================");
        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("I'm " + age + " years old!");
        System.out.println("My height is " + height + " cm");
    }    
}
