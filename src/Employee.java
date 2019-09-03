import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Employee implements Serializable{

	public int empno;
	public String ename;
	public int sal;
	public String desg;
	public String dept;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal
				+ ", desg=" + desg + ", dept=" + dept + "]";
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public Employee(int empno, String ename, int sal, String desg, String dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
		this.dept = dept;
	}
	
	public static void main(String[] args) throws IOException {
		
			
		
		
		Employee e=new Employee(1,"Tanish",100,"Engg","IT");
		
		FileOutputStream fis=new FileOutputStream("saveEmployee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(e);
		
		System.out.println("Saving employee object");
	}

	

}
