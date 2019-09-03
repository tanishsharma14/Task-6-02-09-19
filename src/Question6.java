import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Question6 {

	public static void main(String[] args) throws Exception{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the file with extension");
		String filename=sc.next();
		
		File file=new File(filename);
		
		if(!file.exists())
		{
			System.out.println("File not exists");
			System.exit(0);
		}

		FileReader rd=new FileReader(file);
		
		int ch;
		
		while((ch=rd.read())!=-1)
		{
			System.out.print((char)ch);
		}
		
		rd.close();
		
		file.delete();
	}

}
