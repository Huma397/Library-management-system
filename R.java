class Q
{
 int a=10;
  }
class R extends Q
{
  int a=20;
 void show(int a)
 {
 System.out.print(a);
  System.out.print(this.a);
  System.out.print(super.a);
}
   public static void main(String args[])
{
 R obj1=new R();
 obj1.show(30);
   }
}