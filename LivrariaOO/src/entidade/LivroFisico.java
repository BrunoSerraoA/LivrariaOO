package entidade;

public class LivroFisico extends Livro implements metodosLivro {

    public LivroFisico() {
    }

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public LivroFisico(String nome, String descricao, Double valor, String isbn) {
        super(nome, descricao, valor, isbn);
    }

//    public Double getTaxaImpressao(){
//        Double taxaImpressao = getValor() * 0.05;
//        return this.getValor() += taxaImpressao;
//    }


    @Override
    public Boolean aplicaDescontoDe(Double porcentagem) {
        if (porcentagem > 0.30)
            return false;

        double desconto = this.getValor() * porcentagem;

        this.setValor(this.getValor() - desconto);
        return true;
    }

    @Override
    public void mostraDetalhes() {

    }
}
