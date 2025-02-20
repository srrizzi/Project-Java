public class ProcessoSeletivo
{
    public static void main(String[] args)
    {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2100);   
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
}
