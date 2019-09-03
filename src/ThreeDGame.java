
public class ThreeDGame extends Game{
	public int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void movez(int zpos)
		{
			z+=zpos;
		}

	public void display()
		{
			System.out.println("X axis:"+x);
			System.out.println("Y axis:"+y);
			System.out.println("Z axis:"+z);
		}
}
