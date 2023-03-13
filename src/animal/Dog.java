package animal;

public class Dog extends AnimalA {

	private String Color;
	private int trongLuong;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(int trongLuong) {
		this.trongLuong = trongLuong;
	}

	public Dog(String ten, int tuoi, String giong) {
		super(ten, tuoi, giong);

	}

	public Dog(String ten, int tuoi, String giong, String color, int trongLuong) {
		super(ten, tuoi, giong);
		Color = color;
		this.trongLuong = trongLuong;
	}

	public void displayDog() {
		System.out.println("ten: " + getTen() + "\t tuoi: " + getTuoi() + "\t giong: " + getGiong() + "\t Color: "
				+ Color + "\t trongLuong: " + trongLuong + " kg");
	}
}