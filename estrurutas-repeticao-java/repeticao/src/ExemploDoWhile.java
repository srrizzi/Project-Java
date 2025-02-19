import java.util.Random;

public class ExemploDoWhile
{
    public static void main(String[] args)
    {
        System.out.println("Discando...");

        do
        {
            System.out.println("Telefone Tocando...");
        }while(Tocando());
    }

    private static boolean Tocando()
    {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        
        return !atendeu;
    }
}
