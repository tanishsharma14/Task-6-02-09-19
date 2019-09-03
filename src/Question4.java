import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question4 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter name of the file you want to split");
		
		String filename=sc.next();
		String splitfiles=filename;
		filename+=".txt";
		File file=new File(filename);
		
		if(!file.exists())
			{
				System.out.println("This file does not exists");
				System.exit(0);
			}
		System.out.println("Enter number of parts you want to create");
		int n=sc.nextInt();
		
		long filelength=file.length();
		long eachfilesize=filelength/n;
		
		FileReader fr=new FileReader(file);
		
		for(int i=1;i<=n;i++)
		{
			FileWriter fw=new FileWriter(splitfiles+""+(i)+".txt");
			for(int j=0;j<eachfilesize;j++)
			{
				fw.write(fr.read());
			
			}
			
			fw.close();
		}
		
		fr.close();
		
	}

}
