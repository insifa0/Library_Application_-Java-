class Book {
  String isbn;
  String title;
  String author;
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
  public Book(String t, String a, int y, int c, String ar, String l){
    title = t;
    author = a;
    publication_year = y;
    page_count = c;
    area = ar;
    location = l;
  }
}