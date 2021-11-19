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
		System.out.print(c+"에서 만든"+y+"년형"+i+"인치 TV");
		
	}
}

public class Quiz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
