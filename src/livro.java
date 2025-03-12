public class livro {
    String titulo, autor;
    int anodecriacao;

    public livro(String titulo, String autor, int anodecriacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anodecriacao = anodecriacao;
    }
    public String Apresentar(){
        return ("Titulo: " +titulo+"\nautor: " +autor+ "\nAno de criação: " +anodecriacao);
    }
}
