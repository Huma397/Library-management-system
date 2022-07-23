class Employee
{
String n;
int id;

Employee(String name,int emp_id)
{
  n=name;
  id=emp_id;
}

 public static void main(String[] args)
{
   Employee e1=new Employee("huma",1001);
   Employee e2=new Employee("amna",1008);
   System.out.println("Employee 1: "+e1.n+" "+e1.id);
   System.out.println("Employee 2: "+e2.n+" "+e2.id);
   }
}

