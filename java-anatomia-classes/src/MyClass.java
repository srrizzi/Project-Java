public class MyClass 
{
    public static void main (String[] args) 
    {
        // System.out.print("Hello class, welcome!");

        // final String BR = "Brazil!";
        // System.out.print(BR);

        // var
        // String myName = "Rizzi";
        // int yearManufacture = 1996;
        // boolean isTrue = true;

        // yearManufacture = 2025;

        String name = fullName("Carlos", "Rizzi");

        System.out.print(name);
        
    }

    public static String fullName (String FirstName, String SecondName)
    {
        return "Method result: ".concat(FirstName.concat(" ").concat(SecondName));
    }
}
