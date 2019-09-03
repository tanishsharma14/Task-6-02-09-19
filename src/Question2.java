import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Question2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fd=new FileReader("copyFromThis.txt");
		FileWriter fw=new FileWriter("copyToThis.txt");
		
		int ch;
		
		while((ch=fd.read())!=-1)
				{
			
						fw.write(ch);
						System.out.print((char)ch);
				}
		
		fd.close();
		fw.close();

	}

}
