//�ѱݾ� �� ������,����,õ��,���,���ʿ�,�ʿ�,�Ͽ� ���� ��� �������� �˾Ƴ���. 
package workspace;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("5���� �̻��� �ݾ��� �Է��Ͻÿ�");
		int a=scn.nextInt();
		int b=50000;
		int c=10000;
		int d=1000;
		int e=100;
		int f=50;
		int g=10;
		int h=1;
		
		System.out.println("��������"+a/b+"��");
		System.out.println("������"+(a%b)/c+"��");
		System.out.println("õ����"+(a%b%c)/d+"��");
		System.out.println("�����"+(a%b%c%d)/e+"��");
		System.out.println("���ʿ�"+(a%b%c%d%e)/f+"��");
		System.out.println("�ʿ�"+(a%b%c%d%e%f)/g+"��");
		System.out.println("�Ͽ�"+(a%b%c%d%e%f%g)/h+"��");
		

	}

}
