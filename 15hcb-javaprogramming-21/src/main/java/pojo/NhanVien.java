package pojo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.ManyToAny;

public class NhanVien implements Serializable {
	private int ma;
	private String hoten;
	private String gioitinh;
	private Date ngaysinh;
	private String diachi;
	private LoaiNhanVien loainv;
	private int dienthoai;
	private int cmnd;
	private Date thoigianbatdau;
	private String trinhdo;
	private double hesoluong;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public LoaiNhanVien getLoainv() {
		return loainv;
	}
	public void setLoainv(LoaiNhanVien loainv) {
		this.loainv = loainv;
	}
	public int getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(int dienthoai) {
		this.dienthoai = dienthoai;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public Date getThoigianbatdau() {
		return thoigianbatdau;
	}
	public void setThoigianbatdau(Date thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}
	public String getTrinhdo() {
		return trinhdo;
	}
	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}
	public double getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	
}
