package pojo;

import java.io.Serializable;
import java.util.Date;

public class CaLamViec implements Serializable {
private int ma;
private String tenca;
private Date thoigianbd;
private Date thoigiankt;
public int getMa() {
	return ma;
}
public void setMa(int ma) {
	this.ma = ma;
}
public String getTenca() {
	return tenca;
}
public void setTenca(String tenca) {
	this.tenca = tenca;
}
public Date getThoigianbd() {
	return thoigianbd;
}
public void setThoigianbd(Date thoigianbd) {
	this.thoigianbd = thoigianbd;
}
public Date getThoigiankt() {
	return thoigiankt;
}
public void setThoigiankt(Date thoigiankt) {
	this.thoigiankt = thoigiankt;
}
}
