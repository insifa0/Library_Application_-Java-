import java.util.Scanner;
import mylibrarysystem.*;

class Main {
   
  public static void main(String[] args) {
    Library l = new Library();
    
    Book b1 = new Book("12345", "aaa", "bbb");
    Book b2 = new Book("12346", "ccc", "ddd");
    Book b3 = new Book("12347", "eee", "fff");
    l.addBook(b1);
    l.addBook(b2);
    l.addBook(b3);
    Book b4 = l.findBook(new Book("12346", "ccc", "ddd"));
    if(b4 == null) {
      System.out.println("bulamadim");
    } else {
      System.out.println(b4.getISBN() + " " + b4.getTitle() + " " + b4.getAuthor());
    }
    
    int o = -1;

    
  // Menu
    while(o != 100){
      System.out.println("___Welcome___");
      System.out.println("Choose an option:");
      System.out.println("0: see all books");
        
      System.out.println("1: add book");
      System.out.println("2: delete book");
      System.out.println("3: search book by title");
      
      System.out.println("4: add customer");
      System.out.println("5: delete customer");
      System.out.println("6: rent book to customer");

      System.out.println("7: add employee");
      System.out.println("8: delete employee");
  
      System.out.println("100: exit");
      
      Scanner sc = new Scanner(System.in); //Constructor (olusturucu) fonksiyonu. Scanner cinsinden bir şeyi oluşuturuyor.
      o = sc.nextInt();
      sc.nextLine(); // bir hatadan dolayı bunu ekledik
      if (o == 0){
          for (int i=0; i<l.getBookcount(); i++) {
            System.out.println(l.getBook(i).getISBN() + ", " + l.getBook(i).getTitle() + ", " + l.getBook(i).getAuthor());
        }
        
        System.out.println("***End of the books***");
        System.out.println("");
        
      } else if (o == 1) {
        System.out.println("Enter ISBM name");
        String isbn = sc.nextLine();
          if(Book.is_isbn_correct(isbn) == true) {
            System.out.println("Enter book title");
            String tt = sc.nextLine();

            System.out.println("Enter author name");
            String aa = sc.nextLine();

            // isbn 5 rakamdan olusmali
            Book b = new Book(isbn,tt,aa); //Constructor function
            
          } else {
            System.out.println("isbn must have consist of 5 digits");
        } 
      } else if (o == 2){
        
        System.out.println("enter isbn number");
        String isbn = sc.nextLine();
        l.deleteBook(isbn);
                
      } else if (o == 3){

        System.out.println("enter title you want to search");
        String t = sc.nextLine();
        Book b = l.findBook(t);
        if(b == null) {
          System.out.println("book does not exist in our library");
        } else {
          System.out.println(b.getISBN() + " " + b.getTitle() + " " + b.getAuthor());
        }
  
      } else if (o == 4){
        String name = "Max";
        String surname = "Mustermann";
        
        //Member c = new Member();
      } else if (o == 5){
  
      } else if (o == 6){
  
      } else if (o == 100){
        System.out.println("____END____");
      } else {
        System.out.println("unknown option");
      } // end of the While loop
    }
  }
}
