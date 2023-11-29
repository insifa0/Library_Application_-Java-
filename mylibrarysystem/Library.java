package mylibrarysystem;

import java.util.Vector;

public class Library {

  private Vector employes = new Vector();
  private Vector members = new Vector();
  private Vector books = new Vector();

  // private Employee[] employees = new Employee[50];
  // private Member[] members = new Member[1000];
  // private Book[] books = new Book[10000];
  private int book_count = 0;

  String name;
  String address;

  public int getBookcount() {
      return book_count;
  }

  public Book getBook(int i) {
      return (Book) books.elementAt(i); // type cast: Object to Book
  }

  public void addBook(Book b) {  
    // todo - isbn kontrolu ekle
    books.add(b);
    book_count++;
  }

  public void deleteBook(String s) {
    for (int i = 0; i < book_count; i++) {
      if (((Book) books.elementAt(i)).getIBSN().equals(s)) {
        // silme islemi
        books.remove(i);
        book_count--;
      }
    }
  }

  // attention: can return null
  public Book findBook(String t){
    for(int i=0; i<book_count; i++){
      if( (Book) books.elementAt(i).getTitle().equals(t)){
        return (Book) books.elementAt(i);
      }
    }
    return null;
  }

  public Book findBook2(Book b){
    int i = books.indexOf(b);
    if(i == -1) {
      retunr null;
    } else{
      return (Book) books.elementAt(i);
    }
  }
  
}