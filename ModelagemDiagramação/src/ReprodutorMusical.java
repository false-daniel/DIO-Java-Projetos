interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

class MeuReprodutorMusical implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Iniciando a reprodução da música...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}
