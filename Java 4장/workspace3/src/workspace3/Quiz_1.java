package workspace3;
class TV {
	String c;
	int y;
	int i;
	TV(){}
	
	TV(String c,int y, int i){
		this.c = c;
		this.y = y;
		this.i = i;
	}
	void show(){
		System.out.print(c+"���� ����"+y+"����"+i+"��ġ TV");
		
	}
}

public class Quiz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
