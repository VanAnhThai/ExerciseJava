package QuanLyPTGT;

public class XeTai extends PhuongTienGiaoThong {
	private String trongTai;

	public XeTai(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, String trongTai) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.trongTai = trongTai;
	}

	public String getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(String trongTai) {
		this.trongTai = trongTai;
	}

	public void hienthiThongTinXe() {
		super.hienthiThongTinXe();
		System.out.println("Trong tai:" + trongTai);
	}

}