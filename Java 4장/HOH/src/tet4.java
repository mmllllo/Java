//�ּ�,�ִ�,�߰� ���������ϱ�
package workspace;
import java.util.Scanner;
public class tet4 {
 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("3���� ������ �Է��ϼ���");
		int max,mid,min;
		int num;
		max= scn.nextInt();
		mid= scn.nextInt();
		min= scn.nextInt();
		//???�߸𸣰ٳ�..;;
		if(max<mid) {
			num=max;
			max=mid;
			mid=num;
		}
		if(max<min) {
			num=max;
			max=min;
			min=num;
		}
		if(mid<min) {
			num=mid;
			mid=min;
			min=num;
		}
		System.out.println("�ִ밪"+max+"�߰���"+mid+"�ּҰ�"+min);
	}
}

