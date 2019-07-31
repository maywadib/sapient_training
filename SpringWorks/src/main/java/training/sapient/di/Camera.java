package training.sapient.di;

import org.springframework.stereotype.Component;

@Component
public class Camera {
//
	private String type;
	private int pixcels;

	
	@Override
	public String toString() {
		return "Camera [type=" + type + ", pixcels=" + pixcels + "]";
	}
	public Camera(String type, int pixcels) {
	super();
	this.type = type;
	this.pixcels = pixcels;
}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPixcels() {
		return pixcels;
	}
	public void setPixcels(int pixcels) {
		this.pixcels = pixcels;
	}
	
	public Camera() {
		// TODO Auto-generated constructor stub
	}
	
}
