package Quiz;

class ColorPoint2 extends Point{
	String color;
	public ColorPoint2() {
		super(0,0);
		color = "black";
	}
	public ColorPoint2(int x, int y) {
		super(x,y);
		color = "black";
	}
	public ColorPoint2(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color+"색의 (" + getX() + "," + getY()+")의 점";
	}
	
}

public class Quiz_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");

	}

}
