interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class MeuNavegadorInternet implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}
