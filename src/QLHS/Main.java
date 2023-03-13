package QLHS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<HocSinh> arrL = new ArrayList<>();
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số học sinh: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("----Nhập thông tin học sinh thứ " + (i + 1) + ": ");
			HocSinh hocSinhLop = new HocSinh();
			hocSinhLop.nhapThongTinHocSinh();
			arrL.add(hocSinhLop);
		}
		for (int i = 0; i < arrL.size(); i++) {
			System.out.println("\n----Thông tin học sinh thứ " + (i + 1) + ": ");
			arrL.get(i).hienthihocsinh();
		}
		Scanner scanner1 = new Scanner(System.in);
		School school = new School();

		System.out.println("\n----Danh sách HS 20 tuổi ");
		for (int i = 0; i < arrL.size(); i++) {
			if (arrL.get(i).getTuoi() == 20) {
				arrL.get(i).hienthihocsinh();
			}
		}
		int dem = 0;
		System.out.println("\n----Số HS tuổi 23 và Quê ở DN ");
		for (int i = 0; i < arrL.size(); i++) {
			if (arrL.get(i).getTuoi() == 23 && arrL.get(i).getQueQuan().toLowerCase().equals("DN".toLowerCase())) {
				dem++;
			}

		}
		System.out.println("Tổng số: " + dem);

//		HocSinh hocSinh = new HocSinh();
//		hocSinh.nhapThongTinHocSinh();
//		hocSinh.hienthihocsinh();
//		Scanner scanner = new Scanner(System.in);
//		School school = new School();
//		school.add(new HocSinh());
//		school.getHocSinh20tuoi();
//		school.countHocSinh23tuoilnDN();
	}
}