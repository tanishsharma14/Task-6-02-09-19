import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class GameMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		System.out.println("Would you like to Resume or start a new game");
		System.out.println("Press 1 for resume and 2 for new game");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		System.out.println("Enter moves for x axis");
		int x=sc.nextInt();
		System.out.println("Enter move for y axis");
		int y=sc.nextInt();
		System.out.println("Enter move for z axis");
		int z=sc.nextInt();
		ThreeDGame g=null;
		
		if(choice==1)
		{
			File file=new File("previousRecord.txt");	
			if(file.exists()&&file.isFile())
				{
					FileInputStream fis=new FileInputStream(file);
					ObjectInputStream ois=new ObjectInputStream(fis);
					g=(ThreeDGame)ois.readObject();
					
					g.movex(x);
					g.movey(y);
					g.movez(z);
					
					
				}
		 
		}
		else if(choice==2)
		{
			g=new ThreeDGame();
			g.movex(x);
			g.movey(y);
			g.movez(z);
			
			FileOutputStream fos=new FileOutputStream("previousRecord.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(g);
			
			System.out.println("Object state saved");
		}
		
		g.display();

	}

}
