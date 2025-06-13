
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  // <- Aqui tem que ter ponto e vírgula
        // Aqui eu começo a pedir as informações da conta
        scanner.useLocale(new Locale("pt", "BR"));
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt(); // Aqui ele vai ler o número inteiro digitado

  
        scanner.nextLine(); // Isso é só pra não pular a próxima leitura (tem a ver com o Enter que o nextInt deixa pra trás)

        // Agora peço a agência
        System.out.println("Por favor, digite a Agência:");
        String agencia = scanner.nextLine(); // Aqui ele vai ler a agência como texto (pode ter traço, por isso não é número)

        // Agora peço o nome do cliente
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine(); // Lê o nome completo

        // Por fim, o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble(); // Lê o saldo como número decimal (com vírgula ou ponto)

        // Aqui é onde tudo se junta numa mensagem final
        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco.\nSua agência é " + agencia + 
            ", conta " + numero + " e seu saldo R$" + String.format("%.2f", saldo) + 
            " já está disponível para saque.");

        // E por fim, fecho o Scanner (boa prática)
        scanner.close();
    }
}
