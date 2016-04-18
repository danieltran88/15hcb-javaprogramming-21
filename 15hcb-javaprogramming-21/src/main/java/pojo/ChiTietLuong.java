package pojo;

import java.io.Serializable;

public class ChiTietLuong implements Serializable{
private int mactluong;
private NhanVien nhanvien;
private int slngaypc;
private int slngaylam;
private int slngaynghi;
private int luongthang;
	private double heso;

	public int getMactluong() {
		return mactluong;
	}

	public void setMactluong(int mactluong) {
		this.mactluong = mactluong;
	}

	public NhanVien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public int getSlngaypc() {
		return slngaypc;
	}

	public void setSlngaypc(int slngaypc) {
		this.slngaypc = slngaypc;
	}

	public int getSlngaylam() {
		return slngaylam;
	}

	public void setSlngaylam(int slngaylam) {
		this.slngaylam = slngaylam;
	}

	public int getSlngaynghi() {
		return slngaynghi;
	}

	public void setSlngaynghi(int slngaynghi) {
		this.slngaynghi = slngaynghi;
	}

	public int getLuongthang() {
		return luongthang;
	}

	public void setLuongthang(int luongthang) {
		this.luongthang = luongthang;
	}

	public double getHeso() {
		return heso;
	}

	public void setHeso(double heso) {
		this.heso = heso;
	}
}
