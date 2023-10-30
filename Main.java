import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    Library l = new Library();
    int o = -1;

    
  // Menu
    while(o != 100){
      System.out.println("Choose an option:");
      System.out.println("0: see all books");
        
      System.out.println("1: add book");
      System.out.println("2: delete book");
      System.out.println("3: search book by title");
      
      System.out.println("4: add customer");
      System.out.println("5: delete customer");
      System.out.println("6: rent book to customer");
  
      System.out.println("100: exit");
      
      Scanner sc = new Scanner(System.in); //Constructor (olusturucu) fonksiyonu. Scanner cinsinden bir şeyi oluşuturuyor.
      o = sc.nextInt();
      sc.nextLine(); // bir hatadan dolayı bunu ekledik
      if (o == 0){
        for(int i=0; i<l.book_count; i++){
          System.out.println(l.books[i].title + ", " + l.books[i].author);
        }
        System.out.println("***End of the books***");
        System.out.println("");
      }else if(o == 1){
        System.out.println("Enter ISBM name");
        String isbn = sc.nextLine();
        
        System.out.println("Enter book name");
        String tt = sc.nextLine();
  
        System.out.println("Enter author name");
        String aa = sc.nextLine();
  
        Book b = new Book(isbn,tt,aa); //Constructor function
        l.books[l.book_count] = b;
        l.book_count++; //Kayıtlı kitap sayısını 1 artırdık
        
        //System.out.println("Kitab bilgisi: " + b.title + ", " + b.author);
        // Yukarıdaki satır oluşturduğumuz kitabların küçük bir çıktısını veriyor.
      } else if (o == 2){
        
      } else if (o == 3){
  
      } else if (o == 4){
        String name = "Max";
        String surname = "Mustermann";
        
        //Member c = new Member();
        
      } else if (o == 5){
  
      } else if (o == 6){
  
      } else if (o == 100){
        System.out.println("____END____");
      }
      else {
        System.out.println("unknown option");
      }
    } // end of the While loop
  }   
}
