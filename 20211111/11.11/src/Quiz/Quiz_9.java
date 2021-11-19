package Quiz;
import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StringStack implements Stack{
	String[] arr;
	int len, cap;
	public StringStack(int n){
		arr = new String[n];
		len = 0;
		cap = n;
	}
	public int length() {
		return len;
	}
	public int capacity() {
		return cap;
	}
	public String pop() {
		return arr[--len];
	}
	public boolean push(String val) {
		if(len == cap) {			
			return false;
		}
		else {
			arr [len++] = val;
			return true;
		}
	}

}

public class Quiz_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		
		int n = scanner.nextInt();
		StringStack ss = new StringStack(n);
		
		String op;
		while(true) {
			System.out.println("문자열 입력 >>");
			String val = scanner.next();
			if(val.contentEquals("그만")) {
				break;
			}
			if(!ss.push(val)) {
				System.out.println("스택이 꽉 차서 푸쉬불가!");
			}
		}
		System.out.println("스택에 저장된 모든 문자열 팝 :");
		for(int i = 0; i < ss.length(); i++) {
			System.out.println(ss.pop()+" ");
		}
		

	}

}
