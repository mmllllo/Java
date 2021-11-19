package workspace3;

public class pp {
	
	
	public static int [] shuffle(int[] arr){
		for(int i=0; i<arr.length; i++) {
			int ri = (int)(Math.random()*arr.length);
			
			int temp = arr[i];
			arr[i] = arr[ri];
			arr[ri]=temp;
	}
		return arr;
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
