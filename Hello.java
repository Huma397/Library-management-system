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
class Hello
{
	public static void main(String args[])
	{
		ReadandWrite rw=new ReadandWrite();

	try
	{
		rw.readFile();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	System.out.println("hello");
	}
}






	