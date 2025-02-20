import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo
{
    public static void main(String[] args)
    {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        
        for(String candidato : candidatos)
        {
            entrandoEmContato(candidato);
        }
    }

    static void imprimirSelecionados()
    {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        System.out.println("Imprimindo a lista de candidatos selecionados");
        for (int i = 0; i < candidatos.length; i++)
        {
            System.out.println("O candidato com numero de indice " + (i+1) + " é o " + candidatos[i]);
        }
        
        for (String candidato : candidatos)
        {
            System.out.println("O candidato é o " + candidato);
        }
    }

    static void selecaoCandidatos()
    {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length)
        {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " pretende ganhar " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido)
            {
                System.out.println("O Candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPrendido)
    {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPrendido)
            System.out.println("Ligar para o Candidato");
        else if (salarioBase == salarioPrendido)
            System.out.println("Ligar para o Candidato com contra proposta");
        else
            System.out.println("Aguardando o Resultado dos demais Candidatos");
    }

    static boolean atender()
    {
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato)
    {
        int tentativas = 1;
        boolean continuar = true;
        boolean atendeu = false;
        do
        {
            atendeu = atender();
            continuar = !atendeu;
            if(continuar)
                tentativas++;
            else
                System.out.println("Contato Realizado com sucesso");

        }while (continuar && tentativas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativas + " tentativa");
        else
            System.out.println("Não conseguimos contato com o candidato " + candidato + " após " + tentativas + " tentativas");
    }
}
