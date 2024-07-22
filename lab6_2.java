class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void display() {
        // Will be overridden by subclasses
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Publication:");
        System.out.println("Author: " + super.authorName);
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Paper Publication:");
        System.out.println("Author: " + super.authorName);
        System.out.println("Title: " + title);
    }
}

public class lab6_2 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java Main <author_name> <publication_type> <title>");
            return;
        }

        String authorName = args[0];
        String publicationType = args[1].toLowerCase();
        String title = args[2];

        Book publication;
        if (publicationType.equals("book")) {
            publication = new BookPublication(authorName, title);
        } else if (publicationType.equals("paper")) {
            publication = new PaperPublication(authorName, title);
        } else {
            System.out.println("Invalid publication type. Choose either 'book' or 'paper'.");
            return;
        }

        publication.display();
    }
}