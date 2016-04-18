package pojo;

import java.io.Serializable;
import java.util.Date;

public class HoaDon implements Serializable {
private int ma;
private int tongtien;
private double giamgia;
private int tongtienhoadon;
private NhanVien nhanvien;
private Ban ban;
private int soluongkhach;
private Date ngaylap;
public int getMa() {
	return ma;
}
public void setMa(int ma) {
	this.ma = ma;
}
public int getTongtien() {
	return tongtien;
}
public void setTongtien(int tongtien) {
	this.tongtien = tongtien;
}
public double getGiamgia() {
	return giamgia;
}
public void setGiamgia(double giamgia) {
	this.giamgia = giamgia;
}
public int getTongtienhoadon() {
	return tongtienhoadon;
}
public void setTongtienhoadon(int tongtienhoadon) {
	this.tongtienhoadon = tongtienhoadon;
}
public NhanVien getNhanvien() {
	return nhanvien;
}
public void setNhanvien(NhanVien nhanvien) {
	this.nhanvien = nhanvien;
}
public Ban getBan() {
	return ban;
}
public void setBan(Ban ban) {
	this.ban = ban;
}
public int getSoluongkhach() {
	return soluongkhach;
}
public void setSoluongkhach(int soluongkhach) {
	this.soluongkhach = soluongkhach;
}
public Date getNgaylap() {
	return ngaylap;
}
public void setNgaylap(Date ngaylap) {
	this.ngaylap = ngaylap;
}
}
