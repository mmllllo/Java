package workspace3;

public class isNumber {

	public static boolean isNumber(String str) {
		if(str == null || str.contentEquals(""))
			return false;
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(c < '0' || c > '9') 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));

	}

}
