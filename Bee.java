class Cfloat
{
double a= 1.0;
}
class Bee extends C
{
    double a=1.00;
   void show(double a)
   {
   System.out.println(super.a);
   }
    public static void main(String[] args)
    {
      Bee obj1=new Bee();
       obj1.show(2.5);
   }
 }