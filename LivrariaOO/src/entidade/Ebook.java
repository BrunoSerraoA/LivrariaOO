package entidade;

public class Ebook extends Livro implements metodosLivro {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public Ebook(String nome, String descricao, Double valor, String isbn, String waterMark) {
        super(nome, descricao, valor, isbn);
        setWaterMark(waterMark);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\n" + this.getNome());
        System.out.println(this.getDescricao());
        System.out.println(this.getValor());
        System.out.println(this.getIsbn());
        System.out.println(this.getWaterMark());
        System.out.println("----------------------------------\n");
    }

    @Override
    public Boolean aplicaDescontoDe(Double porcentagem) {
       if (porcentagem > 0.15)
           return false;

       double desconto = this.getValor() * porcentagem;

        this.setValor(this.getValor() - desconto);
        return true;
    }

    @Override
    public void mostraDetalhes() {

    }
}
