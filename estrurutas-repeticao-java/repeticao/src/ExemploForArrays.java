public class ExemploForArrays
{
    public static void main(String[] args)
    {
        String alunos[] = {"Ana", "Bia", "Carla", "Duda", "Eva"};

        for ( int i = 0; i < alunos.length; i++)
        {
            System.out.println(i + " - " + "Aluno: " + alunos[i]);
        }

        for (String aluno : alunos)
        {
            System.out.println("Aluno: " + aluno);
        }
    }
}
