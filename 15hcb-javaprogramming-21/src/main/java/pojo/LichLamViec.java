package pojo;

import java.io.Serializable;
import java.util.Date;

public class LichLamViec implements Serializable{
private Date ma;
private Date ngaybd;
	private Date ngaykt;

	public Date getMa() {
		return ma;
	}

	public void setMa(Date ma) {
		this.ma = ma;
	}

	public Date getNgaybd() {
		return ngaybd;
	}

	public void setNgaybd(Date ngaybd) {
		this.ngaybd = ngaybd;
	}

	public Date getNgaykt() {
		return ngaykt;
	}

	public void setNgaykt(Date ngaykt) {
		this.ngaykt = ngaykt;
	}
}
