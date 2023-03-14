package QuanLyPTGT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.time.Year;
import java.util.Map;
import java.util.List;

public class Main {

	private ArrayList<PhuongTienGiaoThong> arrL = new ArrayList<PhuongTienGiaoThong>();
	private List<String> listSoXe = new ArrayList<String>();
	private List<String> nsx = new ArrayList<String>(Arrays.asList("Honda", "Yamaha", "Toyota"));

	public ArrayList<PhuongTienGiaoThong> getArrL() {
		return arrL;
	}

	public void setArrL(ArrayList<PhuongTienGiaoThong> arrL) {
		this.arrL = arrL;
	}

	public List<String> getListSoXe() {
		return listSoXe;
	}

	public void setListSoXe(List<String> listSoXe) {
		this.listSoXe = listSoXe;
	}

	public static void main(String[] args) {
		Main PT = new Main();
		Scanner sc = new Scanner(System.in);
//		          Cach 1. 1-Thêm phương tiện giao thông:
		ChuXe anh1 = new ChuXe(12345, "Anh 1", "anh1@gmail.com");
		ChuXe anh2 = new ChuXe(67890, "Anh 2", "anh2@gmail.com");
		ChuXe anh3 = new ChuXe(76543, "Anh 3", "anh3@gmail.com");
		ChuXe anh4 = new ChuXe(123890, "Anh 4", "anh4@gmail.com");
		ChuXe anh5 = new ChuXe(543678, "Anh 5", "anh5@gmail.com");
		ChuXe anh6 = new ChuXe(890123, "Anh 6", "anh6@gmail.com");
		ChuXe anh7 = new ChuXe(365478, "Anh 7", "anh7@gmail.com");

		PhuongTienGiaoThong oto1 = new Oto("a-1122", "Yamaha", 1, "Do", anh1, 5, "kieudongco1");
		PhuongTienGiaoThong oto2 = new Oto("b-3344", "Honda", 2009, "Xanh", anh2, 7, "kieudongco2");
		PhuongTienGiaoThong oto3 = new Oto("c-5566", "Toyota", 2015, "Den", anh3, 4, "kieudongco3");
		PhuongTienGiaoThong xemay1 = new XeTai("d-7788", "Yamaha", 2004, "Trang", anh1, "congsuat60");
		PhuongTienGiaoThong xemay2 = new XeTai("e-9900", "Honda", 2013, "Vang", anh5, "congsuat20");
		PhuongTienGiaoThong xemay3 = new XeTai("f-1029", "Toyota", 2019, "Nau", anh4, "congsuat100");
		PhuongTienGiaoThong xetai1 = new XeTai("g-3847", "Yamaha", 2022, "Xanh", anh6, "trongtai-150T");
		PhuongTienGiaoThong xetai2 = new XeTai("h-5760", "Honda", 2010, "Den", anh7, "trongtai-120T");
		PhuongTienGiaoThong xetai3 = new XeTai("i-2597", "Toyota", 2023, "Nau", anh4, "trongtai-180T");

		PT.arrL.add(oto1);
		PT.arrL.add(oto2);
		PT.arrL.add(oto3);
		PT.arrL.add(xemay1);
		PT.arrL.add(xemay2);
		PT.arrL.add(xemay3);
		PT.arrL.add(xetai1);
		PT.arrL.add(xetai2);
		PT.arrL.add(xetai3);
		oto1.hienthiThongTinXe();
		oto2.hienthiThongTinXe();
		oto3.hienthiThongTinXe();
		xemay1.hienthiThongTinXe();
		xemay2.hienthiThongTinXe();
		xemay3.hienthiThongTinXe();
		xetai1.hienthiThongTinXe();
		xetai2.hienthiThongTinXe();
		xetai3.hienthiThongTinXe();
//	}
//	Cach 2. 1-Thêm phương tiện giao thông

//		PT.nhapPhuongTien(sc);

		PT.timKiemTheoSoXe(sc);
		PT.timKiemTheoCmndChuXe(sc);
		System.out.println("-------------------Sau Khi sap xep:-------------------");
		PT.sapXepTheoSoXeGiamDan();
		for (PhuongTienGiaoThong xe : PT.getArrL()) {
			xe.hienthiThongTinXe();
		}
		System.out.println("-------------------Sau khi xoa:-------------------");
		PT.xoaptgtcuamotnhasx("Honda");
		System.out.println("\n");

		for (PhuongTienGiaoThong xe : PT.getArrL()) {
			xe.hienthiThongTinXe();
		}
	}

	public ChuXe nhapThongTinChuXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap CMND: ");
		int soCmnd = Integer.parseInt(scanner.nextLine());

		System.out.println("Nhap Ten Chu Xe: ");
		String hoTen = scanner.nextLine();

		System.out.println("Nhap Email: ");
		String email = scanner.nextLine();
		return new ChuXe(soCmnd, hoTen, email);

	}


//	private boolean checkVaildSoXe(String soXe) {
//		for (int i = 0; i < arrL.size(); i++) {
//			if (arrL.size() == 5) {
//				if (listSoXe.contains(soXe)) {
//					System.out.println("So xe da ton tai");
//					return false;
//				}
//				listSoXe.add(soXe);
//				return true;
//			} else {
//				System.out.println("So Xe khong dung 5 so");
//				return false;
//			}
//		}
//		return false;
//	}

	private boolean checkValidNamSanXuat(int namSanXuat) {
		int namHt = Year.now().getValue();
		if (namSanXuat <= namHt && namSanXuat >= 2000) {
			return true;
		}
		System.out.println("Nam san xuat phai nho hon hoac bang nam hien hanh va lon hon nam 2000");
		return false;
	}

	public PhuongTienGiaoThong nhapThongTinXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap So Xe: ");
		String soXe = scanner.nextLine();
//		boolean vaildSoXe = checkVaildSoXe(soXe);
		System.out.println("Xin hay nhap lai");
//		vaildSoXe = scanner.nextLine();
//		vaildSoXe = checkVaildSoXe(soXe);

		System.out.println("Nhap Nha San Xuat: ");
		String nhaSanXuat = scanner.nextLine();
		System.out.println("Nhap Nam San Xuat: ");
		int namSanXuat = Integer.parseInt(scanner.nextLine());
		boolean validNamSanXuat = checkValidNamSanXuat(namSanXuat);
		while (validNamSanXuat == false) {
			System.out.println("Xin hay nhap lai");
			namSanXuat = Integer.parseInt(scanner.nextLine());
			validNamSanXuat = checkValidNamSanXuat(namSanXuat);
		}
		System.out.println("Nhap Mau Xe: ");
		String mauXe = scanner.nextLine();
		ChuXe chuxe = this.nhapThongTinChuXe();
		return new PhuongTienGiaoThong(soXe, nhaSanXuat, namSanXuat, mauXe, chuxe);
	}

	public Oto nhapOto(Scanner sc) {
		Scanner scanner = new Scanner(System.in);
		PhuongTienGiaoThong ptgt = this.nhapThongTinXe();
		System.out.println("Nhap So Cho Ngoi: ");
		int soChoNgoi = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap Kieu Dong Co: ");
		String kieuDongCo = scanner.nextLine();
		return new Oto(ptgt.getSoXe(), ptgt.getNhaSanXuat(), ptgt.getNamSanXuat(), ptgt.getMauXe(), ptgt.getChuXe(),
				soChoNgoi, kieuDongCo);
	}

	public XeMay nhapXeMay(Scanner sc) {
		PhuongTienGiaoThong ptgt = this.nhapThongTinXe();
		System.out.println("Nhap cong Suat: ");
		String congSuat = sc.nextLine();
		return new XeMay(ptgt.getSoXe(), ptgt.getNhaSanXuat(), ptgt.getNamSanXuat(), ptgt.getMauXe(), ptgt.getChuXe(),
				congSuat);

	}

	public XeTai nhapXeTai(Scanner sc) {
		PhuongTienGiaoThong ptgt = this.nhapThongTinXe();
		System.out.println("Nhap Trong Tai: ");
		String trongTai = sc.nextLine();
		return new XeTai(ptgt.getSoXe(), ptgt.getNhaSanXuat(), ptgt.getNamSanXuat(), ptgt.getMauXe(), ptgt.getChuXe(),
				trongTai);

	}

	public void xoaptgtcuamotnhasx(String nhaSanXuat) {
		this.arrL.removeIf(vehicle -> vehicle.getNhaSanXuat().equals(nhaSanXuat));
	}

	public void nhapPhuongTien(Scanner sc) {
		char a;
		String chon;
		while (true) {

			System.out.println("Nhap loai Xe: ");
			chon = sc.nextLine();

			switch (chon) {
			case "Xe Oto": {
				Oto oto = nhapOto(sc);
				arrL.add(oto);
				oto.hienthiThongTinXe();
				break;
			}
			case "Xe May": {
				XeMay xemay = nhapXeMay(sc);
				arrL.add(xemay);
				xemay.hienthiThongTinXe();
				break;
			}
			case "Xe Tai": {
				XeTai xetai = nhapXeTai(sc);
				arrL.add(xetai);

				xetai.hienthiThongTinXe();
				break;
			}
			}

			System.out.println("Ban co muon nhap nua khong: (Y/N)");
			a = sc.nextLine().charAt(0);
			if (a == 'N' || a == 'n')
				break;
		}
	}

	public void timKiemTheoSoXe(Scanner sc)

	{

		System.out.println("Nhap so xe ban muon tim kiem: ");

		String soxeTk = sc.nextLine();

		for (int i = 0; i < arrL.size(); i++) {

			String soxe = arrL.get(i).getSoXe();
			if (soxe.equalsIgnoreCase(soxeTk))
				arrL.get(i).hienthiThongTinXe();
		}
	}

	public void timKiemTheoCmndChuXe(Scanner sc) {
		System.out.println("Nhap CMND cua Chu Xe ma ban muon tim kiem: ");
		int soCmndTk = sc.nextInt();
		int cmnd = 0;
		for (int i = 0; i < arrL.size(); i++) {
			int socmnd = arrL.get(i).getChuXe().getSoCmnd();
			if (socmnd == soCmndTk)
				arrL.get(i).hienthiThongTinXe();
		}
	}

	// 6.Sắp xếp các phương tiện giao thông theo số xe giảm dần
//	public void sapXepTheoSoXeGiamDan() {
//		int num, i, j, temp;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Nhap vao so luong Xe trong danh sach: ");
//		num = input.nextInt();
//		int array[] = new int[num];
//		System.out.println("Nhap vao cac so xe: ");
//		for (i = 0; i < num; i++)
//			array[i] = input.nextInt();
//		for (i = 0; i < (num - 1); i++) {
//			for (j = 0; j < num - i - 1; j++) {
//				if (array[j] < array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//			System.out.println("Ket qua sau khi sap xep giam dan theo so xe: ");
//			for (i = 0; i < num; i++) {
//				System.out.println(array[i] + "\t");
//			}
//		}
//
//	}

	public List<PhuongTienGiaoThong> sapXepTheoSoXeGiamDan() {
		Collections.sort(arrL, Comparator.comparing(PhuongTienGiaoThong::getSoXe).reversed());
		return arrL;
	}

}