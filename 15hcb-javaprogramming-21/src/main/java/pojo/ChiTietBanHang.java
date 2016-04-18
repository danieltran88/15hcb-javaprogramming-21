package pojo;

import java.io.Serializable;
import java.util.Date;

public class ChiTietBanHang implements Serializable {
private int ma;
private Ban ban;
private ThucDon thucdon;
private int soluong;
private String tinhtrang;
private Date thoigian;
private int thanhtien;
private NhanVien nhanvien;
private String ghichu;
public int getMa() {
	return ma;
}
public void setMa(int ma) {
	this.ma = ma;
}
public Ban getBan() {
	return ban;
}
public void setBan(Ban ban) {
	this.ban = ban;
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
public String getTinhtrang() {
	return tinhtrang;
}
public void setTinhtrang(String tinhtrang) {
	this.tinhtrang = tinhtrang;
}
public Date getThoigian() {
	return thoigian;
}
public void setThoigian(Date thoigian) {
	this.thoigian = thoigian;
}
public int getThanhtien() {
	return thanhtien;
}
public void setThanhtien(int thanhtien) {
	this.thanhtien = thanhtien;
}
public NhanVien getNhanvien() {
	return nhanvien;
}
public void setNhanvien(NhanVien nhanvien) {
	this.nhanvien = nhanvien;
}
public String getGhichu() {
	return ghichu;
}
public void setGhichu(String ghichu) {
	this.ghichu = ghichu;
}
}
