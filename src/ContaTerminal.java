import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {

        Scanner Dados = new Scanner(System.in);

        System.out.println("____________________________\n_________BANCO JC___________\n____________________________");
        System.out.println("Por favor, Digite o Número da Agência!\nNúmero: ");
        int Numero = Dados.nextInt();

        Dados.nextLine();  // Limpa o buffer

        System.out.println("Por favor, Digite a Agência!\nAgência: ");
        String Agecia = Dados.nextLine();

        System.out.println("Por favor, Digite o seu Nome!\nNome : ");
        String Nome  = Dados.nextLine();

            System.out.println("Por favor, Digite o seu Saldo!\nSaldo : ");
            String Saldo  = Dados.nextLine();

            System.out.println("Olá "+ Nome +"\nobrigado por criar uma conta em nosso banco!\nSua agência é: " + Agecia +"\nConta: " + Numero + "\nSaldo: " + Saldo+"\nJá está Disponível para Saque.");
    }
}
