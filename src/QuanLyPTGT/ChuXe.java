package QuanLyPTGT;

import java.util.Scanner;

public class ChuXe {
	private int soCmnd;
	private String hoTen;
	private String email;

	public ChuXe(int soCmnd, String hoTen, String email) {
		super();
		this.soCmnd = soCmnd;
		this.hoTen = hoTen;
		this.email = email;
	}


	public ChuXe() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSoCmnd() {
		return soCmnd;
	}

	public void setSoCmnd(int soCmnd) {
		this.soCmnd = soCmnd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void hienthiThongTinChuXe() {
		System.out.println("So CMND: " + soCmnd);
		System.out.println("Ho Ten: " + hoTen);
		System.out.println("Email: " + email);
	}

}