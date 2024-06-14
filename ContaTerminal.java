import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        //Configurando a moeda brasileira
        Locale localBR = new Locale("pt", "BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localBR);

        //agora pegando a class scanner para usar no terminal 
        Scanner banco = new Scanner(System.in);

        //atributos a receber dados do usuario
        String nomeCliente;
        String agencia;
        int numero;
        BigDecimal saldo;

        //colocando oq o usuario vai ver para devolver o valor
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = banco.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = banco.nextLine();

        System.out.println("por favor digite o número da sua conta: ");
        numero  = banco.nextInt();

        System.out.println("Por favor, digite o valor do depósito: ");
        saldo = banco.nextBigDecimal();

        //fecha o scanner
        banco.close();

         System.out.printf("Olá   "+nomeCliente+"  , obrigado por criar uma conta em nosso banco, sua agência é   "+agencia+"  , conta   "+numero+"   e seu saldo  "+saldo+"  já está disponível para saque"
        );

    }
}
