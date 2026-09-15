public class Demo52 {
    public static void main(String[] args) {

        
    /*
        Aggregation is a type of "has-a" relationship where one class contains a reference to another class, but the two objects can exist independently.

        In simple words:

        One object uses another object, but it does not own its entire life.

       Example:

      - A University has Students
      - A Car has an Engine
      - A Department has Teachers

       If the University is deleted, the Students can still exist.   
        
    */
        Book book1 = new Book("JuJutsu Kaisen", 600);
        Book book2 = new Book("Boruto", 777);

        Book[] books = {book1, book2};

        Library library = new Library ("L.N Public library", 2020, books);
        

        library.displayInfo();
    }
}
