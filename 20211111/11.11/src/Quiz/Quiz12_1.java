package Quiz;
import java.util.Scanner;
abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Line extends Shape{

	@Override
	public void draw() {
		System.out.println("Line");
		
	}
	
}
class Rect extends Shape{

	@Override
	public void draw() {
		System.out.println("Rect");
		
	}
	
}
class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
		
	}
	
}


class GraphicEditor{
	private String name;
	private Shape start = null, last = null;
	private Scanner sc = new Scanner(System.in);
			
	GraphicEditor(String name){
		this.name = name;
	}
	
	private void insert(int num) {
		Shape obj = null;
		switch(num) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}
		if(start == null) {
			start = last = obj;
		}
		else {
			last.setNext(obj);
			last = obj;
		}
	}
	private boolean delete(int num) {
		Shape cur=start; //cur = ������ġ, pre = ������ġ
		Shape pre=start;
		if(start == null) return false;
		for(int i=0;i<num;i++) {
			pre = cur;
			cur = cur.getNext();
			if(cur==null) {return false;}
		}
		if(start == last) {
			start = last = null;
			return true;
		}
		if(cur == start) {
			start = start.getNext();
		}
		else if(cur == last) {
			last = pre;
			last.setNext(null);
		}
		else {
			pre.setNext(cur.getNext());
		}
		return true;
	}


	void run() {
		System.out.println("�׷��ȿ�����"+name+"�� �����մϴ�.");
		int choice=0;// ����,����
		int num=0;//������ ��ȣ
		while(choice !=4) {
			System.out.println("����(1), ����(2), ��κ���(3), ����(4)");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Line(1), Rect(2), Circle(3), ����(4)");
				num = sc.nextInt();
				if(num<1 || num>3) { 
					System.out.println("�߸��Է�");
					break;
					}
				insert(num);
				break;
			case 2:
				System.out.println("������ ���� ��ġ�Է�:");
				num = sc.nextInt();
				if(!delete(num)) {
					System.out.println("������ �� �����ϴ�.");
				}
				break;
			case 3:
				Shape t= start;
				while(t != null) {
					t.draw();
					t =t.getNext();
				}
				break;
			
			case 4:
				System.out.println(name+"�� �����մϴ�.");
				break;
			default:
				System.out.println("1~4���� �Է°���");
			}
		}
	}
}

public class Quiz12_1 {
	

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();

	}

}