public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
    public Iphone(){

    }
    @Override
    public void ligar() {
        System.out.println("Iniciando uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendento uma ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando um correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador de internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador de internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador de internet");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
