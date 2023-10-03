public class Main {
    public static void main(String[] args) {
        Livro book1 = new Livro("rosa", "talento", 356);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getNumberPages());

        book1.setTitle("Azul");
        book1.setAuthor("Rosa");
        book1.setNumberPages(555);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getNumberPages());
    }
}