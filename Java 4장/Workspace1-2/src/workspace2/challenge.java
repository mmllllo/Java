//������ ������ ���¼����� ��and�ٿ�
package workspace2;
import java.util.Random;
import java.util.Scanner;
public class challenge {

	public static void main(String[] args) {
		System.out.println("���� ���ڸ��߱�");
		Random r=new Random();
		int k =r.nextInt(100);
					
		while(true) {
			Scanner text=new Scanner(System.in);
			int a=text.nextInt();
			int num=a;
			if(num<k) {
				a=num++;
				System.out.println("����");
				continue;
			}
			
			if(num>k) {
			System.out.println("����");
			continue;
			}
		
			else if(num==k) {
			System.out.println("����");
			System.out.println("1����y,������n");
			
			 String aa=text.next();//���Ḧ���� Y,n
			if(aa=="y") {
					continue;				
			}
			else {
					
				break;
			}
			}
		}
		}}
