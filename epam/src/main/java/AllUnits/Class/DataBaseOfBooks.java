package AllUnits.Class;

import java.util.ArrayList;

public class DataBaseOfBooks {
    public static void main(String[] args) {
        Action ruslit = new Action();
        ruslit.addBook(new Book("Каштанка", "Чехов", "БелДрук", 1997, 44, 25.60, "Твердый"));
        ruslit.addBook(new Book("Крыжовник", "Чехов", "РоссДрук", 1954, 22, 15.20, "Мягкий"));
        ruslit.addBook(new Book("Муму", "Тургенев", "БелДрук", 1990, 80, 13.90, "Твердый"));
        ruslit.addBook(new Book("Вишневый сад", "Чехов", "БелДрук", 1982, 97, 7.80, "Мягкий"));
        ruslit.addBook(new Book("Война и мир", "Толстой", "РоссДрук", 1974, 1225, 44.00, "Мягкий"));
        ruslit.addBook(new Book("Лолита", "Набоков", "Олимпия Пресс", 1955, 448, 28.30, "Твердый"));

        System.out.println("Все книги Чехова: ");
        ArrayList<Book> listAuthor = ruslit.getBookListByAuthor("Чехов");
        for (Book elem : listAuthor) {
            System.out.println(elem);
        }

        System.out.println("\nВсе книги РоссДрук: ");
        ArrayList<Book> listPublisher = ruslit.getBookListByPublisher("РоссДрук");
        for (Book elem : listPublisher) {
            System.out.println(elem);
        }
        System.out.println("\nВсе книги, выпущенные после 1980г: ");
        ArrayList<Book> listYear = ruslit.getBookListByYear(1980);
        for (Book elem : listYear) {
            System.out.println(elem);
        }
    }
}

class Action {
    private final ArrayList<Book> bookList = new ArrayList<>();

    void addBook(Book book) {
        bookList.add(book);
    }

    public ArrayList<Book> getBookListByAuthor(String Auth) {
        ArrayList<Book> sortlist = new ArrayList<>();
        for (Book elem : bookList) {
            if (elem.getAuthor().equals(Auth)) {
                sortlist.add(elem);
            }
        }
        return sortlist;
    }

    public ArrayList<Book> getBookListByPublisher(String Publish) {
        ArrayList<Book> sortlist = new ArrayList<>();
        for (Book elem : bookList) {
            if (elem.getPublisher().equals(Publish)) {
                sortlist.add(elem);
            }
        }
        return sortlist;
    }

    public ArrayList<Book> getBookListByYear(int y) {
        ArrayList<Book> sortlist = new ArrayList<>();
        for (Book elem : bookList) {
            if (elem.getYear() > y) {
                sortlist.add(elem);
            }
        }
        return sortlist;
    }
}

class Book {
    private static int counter = 0;
    private final int id = counter++;

    private final String name;
    private String author;
    private String publisher;
    private int year;
    private final int quantity_pages;
    private final double price;
    private final String book_binding;

    public Book(String name, String author, String publisher, int year, int quantity_pages, double price, String book_binding) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.quantity_pages = quantity_pages;
        this.price = price;
        this.book_binding = book_binding;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity_pages() {
        return quantity_pages;
    }

    public double getPrice() {
        return price;
    }

    public String getBook_binding() {
        return book_binding;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", quantity_pages=" + quantity_pages +
                ", price=" + price +
                ", book_binding='" + book_binding + '\'' +
                '}';
    }
}
