package Main;
import Conta.ContaBanco;
import java.util.Scanner;

public class Main {

    private static Scanner read= new Scanner(System.in);
    private static ContaBanco conta;

    public static void main(String[] args) {

        int opcao=0;

        do{
            System.out.println("===================================");
        System.out.println("  Bem vindo ao seu Banco! \n  O que deseja realizar hoje?");
            System.out.println("""
                     1 - Criar conta
                     2 - Consultar conta
                     3 - Sair
                    """);
        opcao= read.nextInt();
        read.nextLine();
        switch(opcao){
            case 1: criarConta();
                    break;
            case 2: consultarConta();
                    break;
        }



        }while(opcao!=3);
    }

    private static void consultarConta() {
        System.out.println(conta);

    }

    private static void criarConta() {
        System.out.println("Informe o nome do usuário:" );
        String nome= read.nextLine();
        System.out.println("Informe a agencia do usuario:" );
        String agencia= read.nextLine();
        System.out.println("Informe o número da conta:" );
        int numero= read.nextInt();
        System.out.println("Informe o saldo da conta:");
        double saldo= read.nextDouble();

        conta = new ContaBanco(numero,agencia,nome,saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n", conta.getNomeCliente(),conta.getAgencia(),conta.getNumero(),conta.getSaldo());
    }


}