package QLHS;

import java.util.Scanner;

public class HocSinh {
	private String hoTen;
	private int tuoi;
	private String queQuan;

	public int getMaHocSinh() {
		return getMaHocSinh();
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public void nhapThongTinHocSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên học sinh: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập tuổi học sinh: ");
		tuoi = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập quê quán học sinh: ");
		queQuan = scanner.nextLine();

	}

	public void hienthihocsinh() {
		System.out.println("hoTen: " + hoTen + "tuoi: " + tuoi + "queQuan: " + queQuan);
	}
}