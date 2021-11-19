package Quiz;

class IPTV extends ColorTV{
	String ipAddress;
	
	public IPTV(String ip, int size, int color) {
		super(size,color);
		this.ipAddress = ip;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ ipAddress+" 주소의 ");
		super.printProperty();
	}
}

public class Quiz_2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192,1,1,2", 32, 2048);
		
		iptv.printProperty();
		}
	}


