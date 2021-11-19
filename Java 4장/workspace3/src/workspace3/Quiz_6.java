package workspace3;
import java.util.Scanner;

class Circle2 {
	double x, y;
	int radius;
	Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	static void largestCircle(Circle2 c[]) {
		double max = Math.pow(c[0].radius, 2);
		int maxi = 0;
		for(int i=1;i<c.length;i++) {
			if(max<Math.pow(c[0].radius, 2));{				
				max=Math.pow(c[0].radius, 2);
				maxi = i;
		}
	}
	System.out.print("가장 면적이 큰 원은");
	c[maxi].show();

	}
}
	public class Quiz_6 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			Circle2 c [] = new Circle2 [3];
			for(int i = 0; i < c.length; i++) {
				System.out.print("x,y,radius >>");
				double x = scanner.nextDouble();
				double y = scanner.nextDouble();
				int radius = scanner.nextInt();
				c[i] = new Circle2(x, y, radius);
			}
			Circle2.largestCircle(c);
			scanner.close();
			

	}

}


