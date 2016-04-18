package pojo;

import java.io.Serializable;

public class Ban  implements Serializable{
private int ma;
private String tenban;
private KhuVuc khuvuc;
private String tinhtrang;
public int getMa() {
	return ma;
}
public void setMa(int ma) {
	this.ma = ma;
}
public String getTenban() {
	return tenban;
}
public void setTenban(String tenban) {
	this.tenban = tenban;
}

public String getTinhtrang() {
	return tinhtrang;
}
public void setTinhtrang(String tinhtrang) {
	this.tinhtrang = tinhtrang;
}
public KhuVuc getKhuvuc() {
	return khuvuc;
}
public void setKhuvuc(KhuVuc khuvuc) {
	this.khuvuc = khuvuc;
}
}
