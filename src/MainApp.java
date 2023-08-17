public class MainApp implements AparelhoTelefonico, ReprodutorMusical{
    private AparelhoTelefonico iphone;
    private ReprodutorMusical reprodutorMusical;

    public MainApp(){
        iphone = new MainApp();
        reprodutorMusical = new MainApp();
    }

    @Override
    public void ligar() {
        System.out.println("Iphone Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Iphone desigado");
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void iniciar(){
        iphone.ligar();
        reprodutorMusical.play();
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.iniciar();
    }
}