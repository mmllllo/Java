//3 6 9 �������� �ڼ�¦ 369 �ߺ��� ������ �ڼ�¦¦
package workspace;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		System.out.println("(1~99) ������ ������ �Է��Ͻÿ�");
		Scanner scn=new Scanner(System.in);
		
		int a=scn.nextInt();
		
		int num=a/10;//10���� ���� ��
		int num1=a%10;//10���� ���� ������

		if (num%10==3) {
			System.out.println("�ڼ�¦¦");
			}
		 if (num%10==6) {
			 System.out.println("�ڼ�¦¦");
		 }
		 if (num%10==9) {
			
			System.out.println("�ڼ�¦¦");
		}
		 
		 if(10>=a) {
		  if (num1==3) 
			System.out.println("�ڼ�¦");			
		 
		 if (num1==6) { 
				System.out.println("�ڼ�¦");			
			 }
		 if (num1==9) { 
				System.out.println("�ڼ�¦");			
			 }}
}}
