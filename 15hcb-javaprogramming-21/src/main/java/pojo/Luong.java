package pojo;

import java.io.Serializable;
import java.util.Date;

public class Luong implements Serializable{
private ChiTietLuong ctluong;
private Date tungay;
private Date denngay;
	private int tongluong;

	public ChiTietLuong getCtluong() {
		return ctluong;
	}

	public void setCtluong(ChiTietLuong ctluong) {
		this.ctluong = ctluong;
	}

	public Date getTungay() {
		return tungay;
	}

	public void setTungay(Date tungay) {
		this.tungay = tungay;
	}

	public Date getDenngay() {
		return denngay;
	}

	public void setDenngay(Date denngay) {
		this.denngay = denngay;
	}

	public int getTongluong() {
		return tongluong;
	}

	public void setTongluong(int tongluong) {
		this.tongluong = tongluong;
	}
}
