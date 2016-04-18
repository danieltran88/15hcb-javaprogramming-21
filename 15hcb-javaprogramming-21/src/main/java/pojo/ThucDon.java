package pojo;

import java.io.Serializable;

public class ThucDon implements Serializable {
	private int ma;
	private String ten;
	private int dongia;
	private String ghichu;
	private LoaiThucDon loai;
	private String donvi;
	private String tinhtrang;

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public LoaiThucDon getLoai() {
		return loai;
	}

	public void setLoai(LoaiThucDon loai) {
		this.loai = loai;
	}

	public String getDonvi() {
		return donvi;
	}

	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
}
