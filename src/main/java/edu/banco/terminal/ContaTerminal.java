package edu.banco.terminal;
import java.util.Scanner;
public class ContaTerminal {
    public static void main (String[] args) {
        System.out.print("-------------------------------------------------\n");
        System.out.print("-----------Bem vindo ao Banco Bradesco------------\n");
        System.out.print("-------------------------------------------------\n\n\n\n");

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta\n");
        int numeroConta = sc1.nextInt();
        System.out.print("Por favor, digite o número da agência\n");
        String numeroAgencia = sc1.next();
        System.out.print("Por favor, digite o nome do cliente\n");
        String nomeCliente = sc1.next();
        System.out.print("Por favor, digite o valor do saldo\n");
        Double saldo = sc1.nextDouble();

        System.out.print("Olá ".concat(nomeCliente).concat(",").concat("obrigado por criar uma conta em nosso banco, sua agência é ".concat(numeroAgencia)).concat(", ").concat("conta ").concat(String.valueOf(numeroConta)).concat("e seu saldo ").concat(String.valueOf(saldo)).concat("já está disponível"));

        sc1.close();

    }
}
