public class NavegadorInternet {

    private String paginaAtual;

    public void abrirPagina(String url){
        this.paginaAtual = url;
        System.out.println("Página aberta: " + url);
    }

    public void fecharPagina(){
        this.paginaAtual = null;
        System.out.println("Página fechada");
    }
}
