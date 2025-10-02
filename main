public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Create items (2 books, 2 magazines, 2 DVDs)
        Book book1 = new Book("B01", "Java Programming", "James Gosling", "978-0135166307", 850, "Programming");
        Book book2 = new Book("B02", "Clean Code", "Robert C. Martin", "978-0132350884", 464, "Software Engineering");

        Magazine mag1 = new Magazine("M01", "Tech Today", "Editor Smith", 45, "September", true);
        Magazine mag2 = new Magazine("M02", "Science Monthly", "Editor Jane", 12, "June", false);

        DVD dvd1 = new DVD("D01", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");
        DVD dvd2 = new DVD("D02", "Finding Nemo", "Andrew Stanton", 100, "G", "Animation");

        // Add to manager
        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        // Create users
        Student student = new Student("U01", "John Smith", "john@example.com", "S1001", "Computer Science");
        Faculty faculty = new Faculty("U02", "Dr. Smith", "smith@example.edu", "Engineering", "Professor");

        // Display all
        System.out.println("=== Displaying All Items ===");
        manager.displayAllItems();
        System.out.println();

        // Borrow items
        System.out.println("=== Testing Borrowing ===");
        if (manager.borrowItem("B01", student.getName())) {
            student.addBorrowedItem(book1);
            System.out.println("Student " + student.getName() + " borrowed: " + book1.getItemInfo());
        }
        if (manager.borrowItem("D01", faculty.getName())) {
            faculty.addBorrowedItem(dvd1);
            System.out.println("Faculty " + faculty.getName() + " borrowed: " + dvd1.getItemInfo());
        }
        System.out.println();

        // Display available items
        System.out.println("=== Displaying Available Items ===");
        manager.displayAvailableItems();
        System.out.println();

        // Late fees test
        System.out.println("=== Testing Late Fees ===");
        System.out.println(book1.getItemInfo() + " - 5 days late: $" + String.format("%.2f", book1.calculateLateFee(5)));
        System.out.println(dvd1.getItemInfo() + " - 3 days late: $" + String.format("%.2f", dvd1.calculateLateFee(3)));
        System.out.println();

        // User information
        System.out.println("=== Testing User Information ===");
        System.out.println("Student: " + student.getName() + " (" + student.getMajor() + ") - " + student.getBorrowedItemsCount() + " items borrowed");
        student.displayBorrowedItems();
        System.out.println("Faculty: " + faculty.getName() + " (" + faculty.getDepartment() + ") - " + faculty.getBorrowedItemsCount() + " items borrowed");
        faculty.displayBorrowedItems();
        System.out.println();

        // Return item
        System.out.println("=== Returning Items ===");
        if (manager.returnItem("B01")) {
            student.removeBorrowedItem(book1);
            System.out.println("Returned: " + book1.getItemInfo());
        }
        System.out.println();

        // Final available items
        System.out.println("=== Final Available Items ===");
        manager.displayAvailableItems();
        System.out.println();

        // Calculate total late fees for 3 days late across all items
        System.out.println("Total late fees for 3 days (all items): $" + String.format("%.2f", manager.calculateTotalLateFees(3)));
    }
}
