//(200,200)���� (100,100)�� x,y��ǥ�� ���ԵǴ��� �˾Ƴ���.
package workspace;
import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int x=a;
		int y=b;
				
		if (x<=100||0<=x) {
		if (y<=100||0<=y)
			System.out.println(x+","+y+"�� �簢�� �ȿ� �ֽ��ϴ�");
		}
		
		else if (x<=200 ||100<x) {
		if (y<=200 || 100<y)
			System.out.println(x+","+y+"�� �簢�� �ȿ� �ֽ��ϴ�");
		}
	}

}
