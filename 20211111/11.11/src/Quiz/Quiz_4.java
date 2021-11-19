package Quiz;

class Km2Mile extends Converter {
	public Km2Mile (double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
}

public class Quiz_4 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
