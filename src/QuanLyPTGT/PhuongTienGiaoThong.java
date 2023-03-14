package QuanLyPTGT;

public class PhuongTienGiaoThong {
	private String soXe;
	private String nhaSanXuat;
	private int namSanXuat;
	private String mauXe;
	private ChuXe chuXe;

	public PhuongTienGiaoThong(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe) {
		super();
		this.soXe = soXe;
		this.nhaSanXuat = nhaSanXuat;
		this.namSanXuat = namSanXuat;
		this.mauXe = mauXe;
	    this.chuXe = chuXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public ChuXe getChuXe() {
		return chuXe;
	}

	public void setChuXe(ChuXe chuXe) {
		this.chuXe = chuXe;
	}

	public void hienthiThongTinXe() {
		System.out.println("So Xe: " + soXe);
		System.out.println("Nha San Xuat: " + nhaSanXuat);
		System.out.println("Nam San Xuat: " + namSanXuat);
		System.out.println("Mau Xe: " + mauXe);
		chuXe.hienthiThongTinChuXe();
	}
	

}