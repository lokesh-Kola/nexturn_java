import java.util.*;

// Abstract User class
abstract class User {
    protected String name, userId;
    
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
    
    public abstract void displayDetails();
}
// Student class
class Student extends User {
    public Student(String name, String userId) {
        super(name, userId);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + " (ID: " + userId + ")");
    }
}
// Librarian class
class Librarian extends User {
    public Librarian(String name, String userId) {
        super(name, userId);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Librarian: " + name + " (ID: " + userId + ")");
    }
}

// Book class
class Book {
    String title, author, category;
    boolean isBorrowed;
    
    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isBorrowed = false;
    }
    
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Category: " + category + ", Borrowed: " + isBorrowed);
    }
}

// Singleton Library Management System
class Library {
    private static Library instance;
    private List<Book> books = new ArrayList<>();
    
    private Library() {}
    
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }
    
    public void listBooks() {
        for (Book book : books) {
            book.displayBook();
        }
    }
    
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && !book.isBorrowed) {
                book.isBorrowed = true;
                System.out.println("Book borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available");
    }
}

// Main class
public class SmartLibrarySystem {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        
        Book b1 = new Book("Harry Potter", "J.K. Rowling", "Fiction");
        Book b2 = new Book("Introduction to Java", "Herbert Schildt", "Programming");
        
        library.addBook(b1);
        library.addBook(b2);
        
        library.listBooks();
        
        library.borrowBook("Harry Potter");
        library.listBooks();
    }
}
