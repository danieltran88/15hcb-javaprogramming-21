package pojo;

import java.io.Serializable;

public class ChiTietHoaDon implements Serializable {
private int ma;
private HoaDon hoadon;
private ThucDon thucdon;
private int soluong;
	private int thanhtien;

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public HoaDon getHoadon() {
		return hoadon;
	}

	public void setHoadon(HoaDon hoadon) {
		this.hoadon = hoadon;
	}

	public ThucDon getThucdon() {
		return thucdon;
	}

	public void setThucdon(ThucDon thucdon) {
		this.thucdon = thucdon;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
}
