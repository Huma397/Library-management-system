class C
{
int a= 10;
}
class Bee extends C
{
    int a=100;
   void show(int a)
   {
   System.out.println(super.a);
   }
    public static void main(String[] args)
    {
      Bee obj1=new Bee();
       obj1.show(30);
   }
 }