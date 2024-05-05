package edu.kleyton;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as Msg para o usuario
        System.out.println("Por favor, digite o número da agência");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da numero da conta");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        // Exibir a msg final

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo " + saldo
                        + " já está disponível para saque");
    }
}
