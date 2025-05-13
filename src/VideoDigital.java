public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel{
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }
    @Override
    public String descricao() {
        return "Ebook: " + titulo + " por: " + autor;
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando o video " + titulo + "...");
    }

}
