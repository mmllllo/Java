package Quiz;

import java.util.Scanner;


class StringStack1 implements Stack{
	private int tos;
	private String[] stk;
	

	StringStack1(int num){
		stk = new String[num];
	}
	@Override
	public int length() {		
		return tos+1;		
			}
	
	@Override
	public int capacity() {
		return stk.length;
	
	}
	
	@Override
	public String pop() {
		if (tos==-1) {
			return null;
		}
		String s = stk[tos];
		tos--;
		return s;
	}
		
	
	@Override
	public boolean push(String val) {
		if(tos == stk.length-1)
			return false;
		else {
			tos++;
			stk[tos] = val;
			return true;
		}
	
	}
}
public class Quiz9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총스택 저장공간의 크기입력>>");
		int n = sc.nextInt();
		StringStack1 ss = new StringStack1(n);
		while(true) {
			System.out.println("문자열 입력>>");
			String st = sc.next();
			if(st.equals("그만"))
				break;
			boolean result = ss.push(st);
			if(!result) {
				System.out.println("스택이 꽉 차서 푸시불가");
			}
		}
		System.out.println("스택에 저장된 모든 문자열>>");
		int len = ss.length();
		for(int i = 0;i<len;i++) {
			System.out.println(ss.pop()+" ");
		}
		sc.close();
	}
}
