package SistemaLivraria;

public class App {
    public static void main(String[] args) {

        Livro livro1 = new Livro(
                "American Gods",
                465,
                Livro.TiposGenero.Acao.toString(),
                "Neil Gaiman",
                "Intrínseca",
                128,
                2016
        );

        Autor autor1 = new Autor(
                "Neil",
                "Gaiman",
                "Contos e Romances",
                "Masculino",
                "Estados Unidos",
                "Menomonie",
                59
        );

        Editora editora1 = new Editora(
                "Intrínseca",
                "2003",
                "05.660.045/0001-06",
                "Rua Marquês de São Vicente, 99 / 3º andar Gávea",
                "Brasil",
                "Rio de Janeiro - RJ"
        );

        livro1.abrirLivro();
        livro1.folhear();

        System.out.println(livro1.ListarDadosLivro());


    }
}
