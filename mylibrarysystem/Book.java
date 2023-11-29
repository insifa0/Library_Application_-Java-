package mylibrarysystem;

public class Book {
  private String isbn;
  private String title;
  private String author;
  protected int publication_year;
  protected int page_count;
  protected String area;
  protected String location;

  // Constructor fumction tanimlayalim ve o title ile outhor bilgisini sart olarak belirle  
  public Book(String i, String t, String a) {
  // todo: kontrolden gecmediginde nesne olusumunu engelle
    isbn = i;
    title = t;
    author = a;
  }
  public Book(String i, String t) {
    isbn = i;
    title = t;
  }
  public Book(String i, String t, String a, int y, int c, String ar, String l){
    isbn = i;
    title = t;
    author = a;
    publication_year = y;
    page_count = c;
    area = ar;
    location = l;
  }

  public void setISBN(String s){
    if (is_isbn_correct(s) == true){
      isbn = s;
    }
  }

  public String getISBN(){
    return isbn;
  }
  public void setTitle(String s){
    if (s.length() >= 3){
      title = s;
    }
  }

  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  
  public static boolean is_isbn_correct(String isbn) {
    if (isbn.length() == 5) {
      boolean hata = false;
        for (int i = 0; i < 5; i++) {
            if (Character.isDigit(isbn.charAt(i)) == false ) {
                hata = true;
            }
        }
        if (hata == true){
          return false;
        } else {
          return true;
        }
      }
    return false; // 5 basamaklı değilse false döndür
  }


  // Overwrite
  public boolean equals(Object s){
    Book b = (Book) o;
      if (isbn.equals(b.isbn)){
        return true;
      }
    return false;
 }  
}