package workspace3;
import java.util.Scanner;

class day {
	private String work;
	public void set(String work) {this.work = work; }
	public String get () {return work;}
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
	
}

class MonthSchedule {
	private Day array [];
	private Scanner sc;
	public MonthSchedule(int n) {
		sc = new Scanner(System.in);
		array = new Day [n];
	}
	public void input() {
		System.out.print("��¥(1~30)?");
		int day = sc.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = sc.next();
		array[day - 1 ] = new Day();
		array[day - 1 ].set(work);
	}
	public void view() {
		System.out.print("��¥(1~30)?");
		int day = sc.nextInt();
		System.out.print(day+"���� �� ����");
		array[day - 1 ].show();
	}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		System.out.print("����(�Է�:1, ����:2, ������:3)>>");
		int op = sc.nextInt();
		while(op!=3) {
			if(op ==1 ) {
				input();
			}
			else {
				view ();
			}
			System.out.println();
			System.out.print("����(�Է�:1, ����:2, ������:3)>>");
			op = sc.nextInt();
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}

public class Quiz_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		

	}

}
