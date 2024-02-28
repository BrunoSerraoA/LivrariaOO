package entidade;

public class Autor {

    private String nome;
    private String email;
    private String cpf;
    private Autor autor;

    public Autor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhesDoAutor() {
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.cpf);
    }
}