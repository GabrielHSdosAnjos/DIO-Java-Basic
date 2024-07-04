package canditatura;


public class case1 {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase=2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o canditato");
        }else if (salarioBase==salarioPretendido)
        System.out.println("Ligar para candidato com contra proposta");
        else{
            System.out.println("Arguardando o resultado dos demais candidatos");
        }
    }
}