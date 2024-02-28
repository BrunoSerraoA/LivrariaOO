import entidade.Livro;
import entidade.LivroFisico;

public class RegraDeDesconto {


    public static void main(String[] args) {
        LivroFisico livro = new LivroFisico();
        livro.setValor(59.90);

        System.out.println("Valor atural:" + livro.getValor());

//        if (livro.aplicaDescontoDe(0.1)) {
//            System.out.println("Valor com desconto:" + livro.getValor());
//        } else {
//            System.out.println("Desconto não pode ser maior que 30%");
//        }

        if (!livro.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto:" + livro.getValor());
        }
    }
}

