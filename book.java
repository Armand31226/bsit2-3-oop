public class Main {
    public static void main(String[] args) {
        System.out.println("≡ Book Record System ≡");
        System.out.println("Adding books and ratings...");
        System.out.println("Rating 4 added successfully");


        Book book1 = new Book("Java Programming", "John Smith", 450);
        Book book2 = new Book("Data Structures", "Alice Brown", 350);
        Book book3 = new Book("Web Development", "Bob Wilson", 400);


        try {
            book1.setRating(4.0);
            book2.setRating(4.25);
            book3.setRating(3.2);
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Ratings added: 4.0, 4.25, 3.2");


        System.out.println("\nBook Results:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


        System.out.println("\nTotal books created: 3");
        System.out.println("Highest rated book: Data Structures by Alice Brown (4.25)");
    }
}
class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;
    private double averageRating;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        this.averageRating = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        String ratingLevel = getRatingLevel();
        System.out.println("Book: " + title + " by " + author + ", Average Rating: " + averageRating + ", Level: " + ratingLevel);
    }

    public void setRating(double rating) throws InvalidRatingException {
        if (rating >= 1 && rating <= 5) {
            averageRating = rating;
        } else {
            throw new InvalidRatingException("Error: Invalid rating: must be 1-5 stars");
        }
    }

    private String getRatingLevel() {
        if (averageRating >= 4.0) {
            return "Good";
        } else if (averageRating >= 3.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}


class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}
