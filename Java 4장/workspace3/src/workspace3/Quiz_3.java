package workspace3;

class Song {
	String t, a, c;
	int y;
	Song(){}
	
	Song(String t, String a, int y, String c){
		this.t = t;
		this.a = a;
		this.y = y;
		this.c = c;
	}
	void show() {
		System.out.print(y+"년 "+c+"국적의 "+a+"가 부른 "+t);
	}
}

public class Quiz_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong = new Song("Dancing Queen","ABBA", 1978, "스웨덴");
		mySong.show();

	}

}
