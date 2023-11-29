package mylibrarysystem;

public class Person{
  private String tc;
  private String name;
  private String surname;
  private String address;
  private String phone;
  private String birth_date;

  public Person(String t,String n, String s){
  // todo: kontrolden gecmediginde nesne olusumunu engelle
    if (is_tc_correct(t) == true){
      tc = t;
    }
    name = n;
    surname = s;
  }

  public void setTC(String s){
    if(is_tc_correct(s) == true){
      tc = s;
    }
  }

  public boolean is_tc_correct(String s){
    if(s.length() == 11){
      boolean hata = false;
      for(int i=0; i<11; i++){
        if(Character.isDigit(s.charAt(i)) == false) {
          hata = true;
        }
      }
      if(hata == true){
        return false; 
      } else {
        return true;
      }
    }
    return false;
  }
}