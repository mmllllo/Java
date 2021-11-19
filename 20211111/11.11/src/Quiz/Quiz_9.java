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
		System.out.println("�� ���� ���� ������ ũ�� �Է� >>");
		
		int n = scanner.nextInt();
		StringStack ss = new StringStack(n);
		
		String op;
		while(true) {
			System.out.println("���ڿ� �Է� >>");
			String val = scanner.next();
			if(val.contentEquals("�׸�")) {
				break;
			}
			if(!ss.push(val)) {
				System.out.println("������ �� ���� Ǫ���Ұ�!");
			}
		}
		System.out.println("���ÿ� ����� ��� ���ڿ� �� :");
		for(int i = 0; i < ss.length(); i++) {
			System.out.println(ss.pop()+" ");
		}
		

	}

}
