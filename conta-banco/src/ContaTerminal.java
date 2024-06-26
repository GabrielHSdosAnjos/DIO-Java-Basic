import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args){
        //Variaveis para armazenar os dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoConta;

        //Scanner para leitura de entrada do terminal
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        //Solicitando e armazenando o número da conta
        System.out.println("Please, digite o número da conta: ");
        numeroConta=scanner.nextInt();
        scanner.nextLine();

        //Solicitando e armazenando a agencia
        System.out.println("Please, digite o numero da agência: ");
        agencia=scanner.nextLine();

        //Solicitando e armazenando  o nome do cliente
        System.out.println("Please, digite o nome do cliente: ");
        nomeCliente=scanner.nextLine();

        //Solicitando o saldo inicial
        System.out.println("Please, digite o saldo incial: ");
        saldoConta=scanner.nextDouble();

        //Mensagem final com os dados da conta
        System.out.println("Olá " + nomeCliente + "Thank you, você é nosso cliente agora");
        System.out.println("Seu número da conta é: " + numeroConta);
        System.out.println("Seu número da agência é: " + agencia);
        System.out.println("Seu saldo disponivel é: " + saldoConta);
    }
}
