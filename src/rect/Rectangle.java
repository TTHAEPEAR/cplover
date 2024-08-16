package rect;

public class Rectangle {
	
	private int width, height;
	public Rectangle(int width, int height) {
		super();
		this.width =Math.max(width, 1);
		this.height = Math.max(1, height);
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	
}
