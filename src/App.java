import java.util.Scanner;
import java.io.IOException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        ConsultaCEP consultaCep = new ConsultaCEP();

        System.out.print("Digite o CEP que deseja consultar: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.gerarArquivo(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}