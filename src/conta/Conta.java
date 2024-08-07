package conta;

public class Conta {


    public void message(int numberAccount, String agency, String clientName, double balance) {

        String formattedBalance = String.format("%.2f", balance);

        String message = "Olá " + clientName + ", obrigado por criar uma conta em nosso banco. sua agência é" + agency + ", conta " + numberAccount + " e seu saldo de R$ " + formattedBalance + " já está disponível";

        System.out.println(message);
    }

}
