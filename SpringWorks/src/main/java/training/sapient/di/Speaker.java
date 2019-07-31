package training.sapient.di;

import org.springframework.stereotype.Component;

@Component
public class Speaker {


	private String type;
	private int volLevel;
	public Speaker(String type, int volLevel) {
		super();
		this.type = type;
		this.volLevel = volLevel;
	}
	@Override
	public String toString() {
		return "Speaker [type=" + type + ", volLevel=" + volLevel + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolLevel() {
		return volLevel;
	}
	public void setVolLevel(int volLevel) {
		this.volLevel = volLevel;
	}
public Speaker() {
	// TODO Auto-generated constructor stub
}
}
