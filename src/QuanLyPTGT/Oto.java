package QuanLyPTGT;

public class Oto extends PhuongTienGiaoThong {
	private int soChoNgoi;
	private String kieuDongCo;

	public Oto(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, int soChoNgoi,
			String kieuDongCo) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}

	public void hienthiThongTinXe() {
		super.hienthiThongTinXe();
		System.out.println("So Cho Ngoi: " + this.soChoNgoi);
		System.out.println("Kieu Co Dong: " + this.kieuDongCo);

	}
	

}