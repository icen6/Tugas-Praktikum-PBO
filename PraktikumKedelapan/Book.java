public class Book {
    private String title; 
    private String author; 
    private String isbn; 
    public static int totalBooks = 0; 
    public Book(String title, String author, String isbn) {
        this.title = title; 
        this.author = author; 
        this.isbn = isbn; 
        totalBooks++;
    }
    public static void displayTotalBooks() {
        System.out.println("Total buku: " + totalBooks);
    }

    public static void main(String[] args) {
        Book Buku = new Book("Pelangi", "Icen", "7999");
        Book Buku2 = new Book("Darah Penjaga", "Cibe", "8999"); 
        Book Buku3 = new Book("Makanan Anjing", "Cimeng", "6999");

        Book.displayTotalBooks();
    }
}
