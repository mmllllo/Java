package workspace3;
import java.util.Scanner;

class day {
	private String work;
	public void set(String work) {this.work = work; }
	public String get () {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		array[day - 1 ] = new Day();
		array[day - 1 ].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.print(day+"일의 할 일은");
		array[day - 1 ].show();
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
		int op = sc.nextInt();
		while(op!=3) {
			if(op ==1 ) {
				input();
			}
			else {
				view ();
			}
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			op = sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

public class Quiz_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		

	}

}
