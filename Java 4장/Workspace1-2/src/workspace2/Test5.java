//������ �Է°��� 3�ǹ���� ����ϰ��϶�
package workspace2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int num[]=new int[10];
		System.out.println("���� �־�");
		for (int i=0;i<10;i++) {
			num[i]=scn.nextInt();
			if(num[i]%3==0) {
				
				System.out.println("3�� �����"+num[i]);
			}
			
	
		}
		
	}

}
