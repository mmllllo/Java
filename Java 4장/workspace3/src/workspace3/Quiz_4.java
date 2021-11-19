package workspace3;

class Rectangle {
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	void show(){
		System.out.println("("+x+","+y+")"+"에서 크기가" +width+"x"+height+"인 사각형");		
	}
	boolean contains(Rectangle r) {
		if((x<r.x) && (y<r.y) && (x+width)>(r.x + r.width) && (y+height)>(r.y+r.height)) {
			return true;
		}
		else {
			return false;
		}
	}
	int square() {
		return height * width;
	}
}

public class Quiz_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은" + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포합합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포합합니다.");

	}

}
