import java.util.Scanner;

class Main {
  
  Library l = new Library();
  
  public static void main(String[] args) {
  // Menu
    System.out.println("Choose an option:");
    System.out.println("1: add book");
    System.out.println("2: delete book");
    System.out.println("3: search book by title");
    
    System.out.println("4: add customer");
    System.out.println("5: delete customer");
    System.out.println("6: rent book to customer");

    
    Scanner sc = new Scanner(System.in); //Constructor (olusturucu) fonksiyonu. Scanner cinsinden bir şeyi oluşuturuyor.
    int o = sc.nextInt();
    sc.nextLine(); // bir hatadan dolayı bunu ekledik
    
    if (o == 1){
      System.out.println("Enter book name");
      String tt = sc.nextLine();

      System.out.println("Enter author name");
      String aa = sc.nextLine();

      Book b = new Book(tt,aa); //Constructor function

      System.out.println("Kitab bilgisi: " + b.title + ", " + b.author);

    } else if (o == 2){
      
    } else if (o == 3){

    } else if (o == 4){
      String name = "Max";
      String surname = "Mustermann";
      
      Customer c = new Customer();
      
    } else if (o == 5){

    } else if (o == 6){

    } else {
      System.out.println("unknown option");
    }

    System.out.println("____END____");    
  }
}
