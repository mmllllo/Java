package workspace3;
import java.util.Scanner;
class Grade {
	int math, science, english;
	
	Grade(int m, int s, int e){
		math = m;
		science = s;
		english = e;		
	}
	
	int average() {
		return(math + science + english)/3;
	}
}

public class Quiz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은" + me.average());
		
		scanner.close();

	}

}
