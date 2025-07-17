package Assignment3.Homework.task1;

public class Shelf {
    int capacity;
    int books;

    public void showDetails(){
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of Books:" + books);
    }
    public void addBooks(int numBooks){
        if (capacity == 0 ) {
            System.out.println("Zero Capacity. Cannot add books");
            
        }
        else if (books + numBooks < capacity) {
            books += numBooks;
            System.out.println(numBooks + " books added to the shelf.");
        } else {
            System.out.println("Exceeds Capacity");
        }
    }
}
