//100λ³΄λ€??? ?? ₯κ°?(? ?λ°°μ΄) λ°κ³  ?΄κ°μ ??€?κ²? ?½? ?΄?Ό (μ€λ³΅??΄) 
package workspace2;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("? ?λ₯? λͺκ° ???₯?  κ²? ?Έμ§? ? ?΄?Ό.");
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