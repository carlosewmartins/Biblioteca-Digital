import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Clean Code", "Robert Cecil Martin");
        Ebook ebook2 = new Ebook("Java para Iniciantes", "Carlos Martins");

        VideoDigital video1 = new VideoDigital("Head First: Design Patterns", "Eric Freeman");
        VideoDigital video2 = new VideoDigital("Estruturas de Dados", "Prof. Neri");

        ItemBibliotecaDigital[] itens = { ebook1, ebook2, video1, video2 };

        for (ItemBibliotecaDigital item : itens) {
            System.out.println(item.descricao());

            if (item instanceof Baixavel) {
                ((Baixavel) item).baixar();
            }

            if (item instanceof Visualizavel) {
                ((Visualizavel) item).visualizar();
            }
            System.out.println();
        }
    }
}
