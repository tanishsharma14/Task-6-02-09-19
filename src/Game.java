import java.io.Serializable;


public class Game implements Serializable{
	
	
	
	public int x;
	public int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void movex(int xpos)
	{
		x+=xpos;
	}
	
	public void movey(int ypos)
		{
			y+=ypos;
		}
}
