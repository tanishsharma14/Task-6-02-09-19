import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question5 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of files you want to merge");
		
		int n=sc.nextInt();
		
		String array[]=new String[n];
		
		System.out.println("Enter file name with extension");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" file name");
			array[i]=sc.next();
		}
		
		System.out.println("Enter file name in which you want to merge all these files with extension");
		String megafile=sc.next();
		
		FileWriter fw=new FileWriter(megafile);
		
		for(int i=0;i<n;i++)
		{
			FileReader fr=new FileReader(array[i]);
			
			int ch;
			
			while((ch=fr.read())!=-1)
			{
				fw.write((char)ch);
			}
			
			fr.close();
		}
		
		fw.close();

	}

}
