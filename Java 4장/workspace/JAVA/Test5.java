//�ﰢ�� �����
package workspace;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		
		int max=a;
		int mid=b;
		int min=c;
		if (a+b>c) { 
		if (a+c>b)
		if (b+c>a)
			System.out.println("�ﰢ���� �˴ϴ�");
		}
		
		if (a+c==b) {
		if (a+b==c);
		System.out.println("�ﰢ���� �ȵ˴ϴ�");	
		}
		
		if (a+c<b) {
		if (a+b<c)
		System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}
			
						}
	}