//����ڿ��� �Է¹޾� -1�� �ԷµǸ� ���߰� �Է��� �� ��δ��ϱ�
package workspace2;
import java.util.Scanner;
public class while1 {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���� 5�� �Է�");
		int sum=0;
		
		for(int i=0; i<5; i++) {
			int a=scn.nextInt();
			
			if(a<=0.0)
				continue;
			else
				sum+=a;
		}
		System.out.println("����"+sum);
		
		/*int count=0;//����
		int sum=0;//��
		System.out.println("-1�� �Է½� ���� ���� �հ谡 ����");
		Scanner scn=new Scanner(System.in);
		
		int a=scn.nextInt();//����������Է�
		
		while (a!=-1) {
			
			sum+=a;
			count++;
			a=scn.nextInt();//�����Է�
		}
		
		if (count==0) {
			System.out.println("���� �Է��ϼ���");
		}
		else {
			System.out.print("������ ������ :"+count+"�̸�");
			System.out.println("���� �����"+(double)sum/count+"�Դϴ�");
			
		}
		scn.close();*/
	}

}
