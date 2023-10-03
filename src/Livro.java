public class Livro {
    private String title;
    private String author;
    private int numberPages;

    public Livro(String titulo, String autor, int numero){
        this.title = titulo;
        this.author = autor;
        this.numberPages = numero;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String titulo){
        this.title = titulo;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String autor){
        this.author = autor;
    }

    public int getNumberPages(){
        return this.numberPages;
    }

    public void setNumberPages(int numero){
        this.numberPages = numero;
    }
}
