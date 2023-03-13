package QLHS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
	private int tenLop;
	private List<HocSinh> hocSinh;

	public School() {
		this.hocSinh = new ArrayList<>();
	}

	public void add(HocSinh hocSinh) {
		this.hocSinh.add(hocSinh);
	}

	public List<HocSinh> getHocSinh20tuoi() {
		return this.hocSinh.stream().filter(hocSinh -> hocSinh.getTuoi() == 20).collect(Collectors.toList());
	}

	public long countHocSinh23tuoilnDN() {
		return this.hocSinh.stream().filter(hocSinh -> hocSinh.getTuoi() == 23 && hocSinh.getQueQuan().equals("DN"))
				.count();

	}

	public int getTenLop() {
		return tenLop;
	}

	public void setTenLop(int tenLop) {
		this.tenLop = tenLop;
	}

	public School(int tenLop) {
		super();

		this.tenLop = tenLop;
	}

	public void hienthihocsinh() {

		System.out.println("tenLop" + tenLop);
	}

}