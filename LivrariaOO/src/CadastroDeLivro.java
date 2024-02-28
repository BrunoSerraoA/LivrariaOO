import entidade.Autor;
import entidade.Ebook;
import entidade.Livro;
import entidade.LivroFisico;

public class CadastroDeLivro {

    public static void main(String[] args) {

        Autor autor = new Autor("Bruno serrão", "brunoserrao@email", "111-111-111-11");
        LivroFisico livro = new LivroFisico ("Java 11 Prático", "aprenda Java 11",59.90, "989-85-66258-46-6");
        autor.mostrarDetalhesDoAutor();
        livro.mostrarDetalhes();

        Autor outroAutor = new Autor(
                "Ryan serrão",
                "ryanserrao@email",
                "000-000-000-00");


        LivroFisico outroLivro = new LivroFisico ("Lógica de Programação", "Aprenda lógica de Programação", 49.90, "989-85-66258-22-6");
        outroAutor.mostrarDetalhesDoAutor();
        outroLivro.mostrarDetalhes();

        Autor autorEbook = new Autor("Autor Ebook", "AutorEbook@email","333-333-333-33");

        Ebook ebook = new Ebook("java pratico", "aprenda java nesse Ebook",29.99,"77777", "marca dagua Ebook");
        ebook.setWaterMark("Marca dagua Ebook");
        ebook.mostrarDetalhes();
    }
}