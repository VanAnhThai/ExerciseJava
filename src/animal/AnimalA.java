package animal;

public class AnimalA {
	private String Ten;
	private int Tuoi;
	private String Giong;

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public String getGiong() {
		return Giong;
	}

	public void setGiong(String giong) {
		Giong = giong;
	}

	public AnimalA(String ten, int tuoi, String giong) {
		super();
		Ten = ten;
		Tuoi = tuoi;
		Giong = giong;
	}

}
