// extends Person ==> Customer class ı Person classında olan herşeye sahip. Aralarındaki fark Customer in *start_date* bilgisinin olması.
class Employee extends Person{
  String start_date;

  public  Employee(String tc, String n, String s){
    // ust sinifin constructorini cagir
    super(t,n,s);
  }
}