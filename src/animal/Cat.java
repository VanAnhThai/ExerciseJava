package animal;

public class Cat extends AnimalA {
	private String mauLong;
	private int chieuCao;

	public String getmauLong() {
		return mauLong;

	}

	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}

	public Cat(String ten, int tuoi, String giong, String mauLong, int chieuCao) {
		super(ten, tuoi, giong);
		this.mauLong = mauLong;
		this.chieuCao = chieuCao;
	}

	public void displayCat() {
		System.out.println("ten: " + getTen() + "\t tuoi: " + getTuoi() + "\t giong: " + getGiong() + "\t mauLong: "
				+ mauLong + "\t chieuCao: " + chieuCao + " cm");
	}
}