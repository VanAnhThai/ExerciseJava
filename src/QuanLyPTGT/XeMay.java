package QuanLyPTGT;

public class XeMay extends PhuongTienGiaoThong {
	private String congSuat;

	public XeMay(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, String congSuat) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.congSuat = congSuat;
	}

	public String getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(String congSuat) {
		this.congSuat = congSuat;
	}

	public void hienthiThongTinXe() {
		super.hienthiThongTinXe();
		System.out.println("Cong Suat: " + congSuat);
	}

}