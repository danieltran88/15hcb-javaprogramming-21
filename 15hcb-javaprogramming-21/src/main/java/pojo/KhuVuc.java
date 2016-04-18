package pojo;

import java.io.Serializable;

public class KhuVuc implements Serializable {
	private int makv;
	private String tenkv;

	public int getMakv() {
		return makv;
	}

	public void setMakv(int makv) {
		this.makv = makv;
	}

	public String getTenkv() {
		return tenkv;
	}

	public void setTenkv(String tenkv) {
		this.tenkv = tenkv;
	}
}
