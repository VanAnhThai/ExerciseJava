package BtapChuyenTien;

public class ChuyenTien {
	private String id;
	private String name;
	private int balance;

	public ChuyenTien(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("So tien invalid");
			return;
		}
		this.balance += amount;
	}

	public void debit(int amount) {
		if (amount < 0) {
			System.out.println("So tien invaild");
			return;
		}
		if (this.balance < amount) {
			System.out.println("So tien muon chuyen lon hon so tien trong tai khoan \n Chuyen tien khong thanh cong");
			return;
		}
		this.balance -= amount;
	}

	public void transferTo(int amount, ChuyenTien accountTo) {
		if (amount < 0) {
			System.out.println("So tien invaild");
			return;
		}
		if (this.balance < amount) {
			System.out.println("So tien muon chuyen lon hon so tien trong tai khoan \n Chuyen tien khong thanh cong");
			return;
		}
		this.balance -= amount;

		accountTo.balance += amount;
	}

	public boolean soDuong(int number) {
		if (number < 0) {
			System.out.println("Error: So tien nhap phai la so duong");
			return false;
		}
		return true;

	}

	public void hienthiThongTinSoDu() {
		System.out.println("So tien trong tai khoan hien co: " + this.balance);
	}

	public static void main(String[] args) {
		ChuyenTien object1 = new ChuyenTien("1", "object 1", 39);
		object1.debit(5);
		object1.hienthiThongTinSoDu();
		object1.credit(10);
		object1.hienthiThongTinSoDu();
		ChuyenTien object2 = new ChuyenTien("2", "Object 2", 9);
		object1.transferTo(9, object2);
		object1.hienthiThongTinSoDu();
	}
}