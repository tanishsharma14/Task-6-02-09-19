import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;


public class Question7 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter first file name");
		
		
		
		FileInputStream fis1=new FileInputStream(sc.next());
		
		System.out.println("Enter second file name");
		FileInputStream fis2=new FileInputStream(sc.next());
		
		SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
		
		int ch;
		
		while((ch=sis.read())!=-1)
		{
			System.out.print((char)ch);
		}

	}

}
