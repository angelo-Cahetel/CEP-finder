public class App {
    public static void main(String[] args) throws Exception {
        ConsultaCEP consultaCep = new ConsultaCEP();
        Endereco novoEndereco = consultaCep.buscaEndereco("94426380");
        System.out.println(novoEndereco);
    }
}