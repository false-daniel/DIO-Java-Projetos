interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

class MeuAparelhoTelefonico implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }
}
