class Book {
  private String isbn;
  private String title;
  private String author;
  int publication_year;
  int page_count;
  String area;
  String location;

  // Constructor fumction tanimlayalim ve o title ile outhor bilgisini sart olarak belirle  
  public Book(String i, String t, String a) {
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

  void setISBN(String s){
    if (is_isbn_correct(s) == true){
      isbn = s;
    }
  }
  
  void setTitle(String t){
    if (t.length() >= 3){
      title = t;
    }
  }

  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  
  static boolean is_isbn_correct(String isbn) {
    if(isbn.length() == 5){
      boolean hata = false;
      for(int i=0; i<5; i++){
        if (Character.isDigit(isbn.charAt(i)) == false){
          hata = true;
      }
    }
      if (hata == true) {
        return false;
      } else {
        return false;
      }
  }
    return false;
  }
}