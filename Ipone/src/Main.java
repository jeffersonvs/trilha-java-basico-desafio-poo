public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iPhone 12");

        // Testando funcionalidades de ReprodutorMusical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funcionalidades de AparelhoTelefonico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades de NavegadorInternet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}