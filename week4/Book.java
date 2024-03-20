package week4;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public double calculateRentalFee(int daysRented) {
        return price * daysRented;
    }

    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("The Catcher in the Rye", "J.D. Salinger", 10.0);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 12.0);

        for (Book book : books) {
            book.displayDetails();
            System.out.println("Rental Fee: " + book.calculateRentalFee(5));
        }
    }
}