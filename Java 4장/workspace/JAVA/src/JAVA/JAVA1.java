package JAVA;
import java.util.Scanner;
public class JAVA1 {

   public static void main(String[] args) {
	System.out.println("�̸�,����,����,ü��,���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
	Scanner scn=new Scanner(System.in);
	
	String name=scn.next();
	System.out.println("�̸���"+name+"�Դϴ�");
	
	String city=scn.next();
	System.out.println("���ô�"+city+"�Դϴ�");
	
	int old=scn.nextInt();
	System.out.println("���̴�"+old+"�Դϴ�");
	
	double kg=scn.nextDouble();
	System.out.println("ü����"+kg+"�Դϴ�");
	
	boolean isSingle=scn.hasNextBoolean();
	System.out.println("���� ���δ�"+isSingle+"�Դϴ�");
	
	System.out.println("�̸���:"+name+"\n��°���:"+city+"\n���̴�:"+old+"\n�����Դ�:"+kg+"\n���� ���δ�:"+isSingle);
   }
}