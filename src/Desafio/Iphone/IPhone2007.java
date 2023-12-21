package Desafio.Iphone;
public class IPhone2007 implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone 2007...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone 2007...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música no iPhone 2007: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o iPhone 2007...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone 2007...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone 2007...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Safari do iPhone 2007: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari do iPhone 2007...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Safari do iPhone 2007...");
    }
}
