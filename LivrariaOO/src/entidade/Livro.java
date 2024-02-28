package entidade;

public abstract class Livro {

    private String nome;
    private String descricao;
    private Double valor;
    private String isbn;
    private Autor autor;

    public Livro() {
    }

    public Livro(String nome, String descricao, Double valor, String isbn) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }

    public Livro(Autor autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void mostrarDetalhes() {
        System.out.println("\n" + this.nome);
        System.out.println(this.descricao);
        System.out.println(this.valor);
        System.out.println(this.isbn);
        System.out.println("----------------------------------\n");
    }

//    public Boolean aplicaDescontoDe(Double porcentagem) {
//        if (porcentagem > 0.3)
//            return false;
//
//        this.valor -= this.valor * porcentagem;
//        return true;
//    }
}

