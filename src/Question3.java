import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("cities.txt",true));
		System.out.println("Enter the number of cities you want to store");
		int n=sc.nextInt();
		
		String cities[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" city name");
			cities[i]=sc.next();
		}
		

		for(int i=0;i<n;i++)
		{
			bw.write(cities[i]+" ");
		
		}
		
		bw.close();
	}

}
