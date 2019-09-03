import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class EmployeeInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("saveEmployee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		
		System.out.println(e.toString());

	}

}
