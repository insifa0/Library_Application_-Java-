class Member extends Person{
  Book[] rented_books;

  public  Member(String tc, String n, String s){
    // ust sinifin constructorini cagir
    super(t,n,s);
  }

  public Member(){
    super("","","");
  } //Hiç bir değeri olmayan member oluşturmak için
}