import java.io.File;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the first file");
		String s1=sc.next();
		System.out.println("Enter name of the second file");
		String s2=sc.next();
		
		File f1=new File(s1);
		File f2=new File(s2);
		
		
		/*System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());*/
		
		if(f1.exists()&&f1.isFile())
		{
			if(f2.exists())
			{
				System.out.println("This name file already exist");
			}
			else
			{
			boolean flag=f1.renameTo(f2);
			System.out.println("Is file name changed:  "+flag);
			}
		}
	}

}
