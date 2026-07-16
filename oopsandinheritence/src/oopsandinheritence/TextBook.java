package oopsandinheritence;



public class TextBook {

    public static void main(String[] args) {

        Author a = new Author("Chetan Bhagat", "chetan@gmail.com", 'M');

        Book b = new Book("Java Programming", a, 550.50, 20);

        System.out.println("Book Name : " + b.getName());
        System.out.println("Author Name : " + b.getAuthor().getName());
        System.out.println("Author Email : " + b.getAuthor().getEmail());
        System.out.println("Author Gender : " + b.getAuthor().getGender());
        System.out.println("Price : " + b.getPrice());
        System.out.println("Quantity : " + b.getQtyInStock());
    }
}