package workspace;
import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	
				
		for (int i=0;i<1;i++) {
			int num=(int)(Math.random()*3);
			System.out.println("���� ���� �� ����");
			String b = scn.next();
			System.out.println();
			if(b.equals("����")) {
				if(num==0) {
					System.out.println("��:����");
					System.out.println("�����:����");
					System.out.println("�����ϴ�");
				}
			}
			if(b.equals("����")) {
				if(num==1) {
					System.out.println("��:����");
					System.out.println("�����:����");
					System.out.println("�����ϴ�");
					
				}
			}
			if(b.equals("��")) {
				if(num==2) {
					System.out.println("��:��");
					System.out.println("�����:����");
					System.out.println("�̰���ϴ�");
				}
			}
			
	}

}
}