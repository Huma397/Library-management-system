import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadandWrite
	{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
	void savefile() throws FileNotFoundException
	{
		String text="this is demo";
		FileOutputStream fos=new FileOutputStream("d:/abc.txt"); 
	}
}
class HelloDemo
{
	public static void main(String args[]) throws FileNotFoundException
	{
		ReadandWrite rw=new ReadandWrite();
			rw.readFile();
	System.out.println("hello");
	}
}






	