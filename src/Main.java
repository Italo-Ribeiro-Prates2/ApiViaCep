import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        consultaCep consultaCep = new consultaCep();


        System.out.println("Digite o CEP que deseja consultar:");
        String cep = leitura.nextLine();


        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            geradorDeArquivo gerador = new geradorDeArquivo();
            gerador.SalvaArquivo(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}