public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void exibirPagina() {
        System.out.println("IPHONE.NavegadorInternet -> EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba() {
        System.out.println("IPHONE.NavegadorInternet  -> ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("IPHONE.NavegadorInternet -> ATUALIZANDO PÁGINA");
    }

    public void ligar() {
        System.out.println("IPHONE.AparelhoTelefonico -> LIGANDO");
    }

    public void atender() {
        System.out.println("IPHONE.AparelhoTelefonico -> ATENDENDO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("IPHONE.AparelhoTelefonico -> INICIANDO CORREIO DE VOZ");
    }

    public void tocar() {
        System.out.println("IPHONE.ReprodutoMusical -> TOCANDO");
    }

    public void pausar() {
        System.out.println("IPHONE.ReprodutoMusical -> PAUSANDO");
    }

    public void selecionarMusica() {
        System.out.println("IPHONE.ReprodutoMusical -> SELECIONANDO MÚSICA");
    }
    
}
