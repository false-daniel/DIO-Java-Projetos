public class IPhone {
    public static void main(String[] args) {
        MeuReprodutorMusical reprodutor = new MeuReprodutorMusical();
        reprodutor.tocar();
        reprodutor.selecionarMusica("Música Preferida");
        
        MeuAparelhoTelefonico telefone = new MeuAparelhoTelefonico();
        telefone.ligar("+69 123456789");
        telefone.atender();
        
        MeuNavegadorInternet navegador = new MeuNavegadorInternet();
        navegador.exibirPagina("https://impomu.com/");
        navegador.adicionarNovaAba();
    }
}
