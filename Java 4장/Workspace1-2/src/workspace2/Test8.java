//100ë³´ë‹¤?‘?? ?…? ¥ê°?(? •?ˆ˜ë°°ì—´) ë°›ê³  ?´ê°’ì„ ?œ?¤?•˜ê²? ?‚½?… ?•´?¼ (ì¤‘ë³µ?—†?´) 
package workspace2;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("? •?ˆ˜ë¥? ëª‡ê°œ ???¥?•  ê²? ?¸ì§? ? ?–´?¼.");
		Scanner scn=new Scanner(System.in);
		
		int b=scn.nextInt();
		int[]a= new int[b];
		
		for (int i=0;i<b;i++) {
			a[i]=(int)(Math.random()*100+1);
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		} 
		
		for(int i=0;i<b;i++) {
		
			System.out.print(a[i]+"   ");
		if(i!=0&& i%10==9) {
			System.out.println();
			}		
		}		
	}
}