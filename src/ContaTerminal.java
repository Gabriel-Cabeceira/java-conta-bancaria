import java.util.Scanner;

import conta.Conta;

import java.util.Random;

import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Cria uma instância do scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // cria uma instâncoa da conta
        Conta conta = new Conta();

        // Cria uma instância de Random, para geração de números aleatórios
        Random random = new Random();

        // Armazena um número aleatório de 4 dígitos no número da conta
        int numberAccount = random.nextInt(9000) + 1000;

        // Define a agencia
        String agency = "Bradesco";


        System.out.println("Por favor, informe seu nome:");
        String clientName = scanner.nextLine();

        System.out.println("Agora informe o valor do depósito inicial em sua conta: ");
        double balance = scanner.nextDouble();

        scanner.close();

        conta.message(numberAccount, agency, clientName, balance);
    }
}
