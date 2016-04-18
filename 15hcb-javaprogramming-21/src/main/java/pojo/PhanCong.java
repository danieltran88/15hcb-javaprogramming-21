package pojo;

import java.io.Serializable;

public class PhanCong implements Serializable {
	private int ma;
	private CaLamViec ca;
	private NhanVien nhanvien;
	private LichLamViec lichlamviec;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public CaLamViec getCa() {
		return ca;
	}
	public void setCa(CaLamViec ca) {
		this.ca = ca;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public LichLamViec getLichlamviec() {
		return lichlamviec;
	}
	public void setLichlamviec(LichLamViec lichlamviec) {
		this.lichlamviec = lichlamviec;
	}
	
}
