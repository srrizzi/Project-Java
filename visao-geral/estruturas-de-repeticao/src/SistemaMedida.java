public class SistemaMedida 
{
    public static void main(String[] args) 
    {
        String sigla = "m";
        sigla = sigla.toUpperCase();

        switch (sigla) {
            case "P":
            {
                System.out.println("Pequeno");
                break;
            }
            case "M":
            {
                System.out.println("Médio");                
                break;
            }
            case "G":
            {
                System.out.println("Grande");                
                break;
            }
            default:
                System.out.println("Tamanho desconhecido");
        }
    }    
}
