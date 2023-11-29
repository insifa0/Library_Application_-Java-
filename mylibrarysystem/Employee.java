// extends Person ==> Customer class ı Person classında olan herşeye sahip. Aralarındaki fark Customer in *start_date* bilgisinin olması.
package mylibrarysystem;

public class Employee extends Person{
  String start_date;

  private  Employee(String tc, String n, String s){
    // ust sinifin constructorini cagir
    super(s,n,s);
  }
}