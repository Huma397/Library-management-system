abstract class A
{
void callme()
{
System.out.println("inside A method");
}
  class B extends A
  {
  void callme()
  {
   System.out.println("inside b's method");
   }
class C extends A
  {
  void callme()
  {
   System.out.println("inside c's method");
   }
}
class MethDis{
public static void main(String args[])
{
   B obj1= new B();
   C obj2= new C();
     A r;
   r=obj1;
   r.callme();
    r=obj2;
   r.callme();
   }
}

}
}
