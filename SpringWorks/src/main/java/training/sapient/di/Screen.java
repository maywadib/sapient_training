package training.sapient.di;

import org.springframework.stereotype.Component;

@Component
public class Screen {

	private String glassType;
	private int len;
	private int bre;
	public Screen(String glassType, int len, int bre) {
		super();
		this.glassType = glassType;
		this.len = len;
		this.bre = bre;
	}
	@Override
	public String toString() {
		return "Screen [glassType=" + glassType + ", len=" + len + ", bre=" + bre + "]";
	}
	public String getGlassType() {
		return glassType;
	}
	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}


public Screen() {
	// TODO Auto-generated constructor stub
}
}

