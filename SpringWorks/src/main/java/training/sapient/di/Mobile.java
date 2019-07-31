package training.sapient.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	private Camera camera;
	
	
	@Autowired
	private Screen screen;
	
	@Autowired
	private Speaker speaker;
	
	
	
	
	@Override
	public String toString() {
		return "Mobile [camera=" + camera + ", screen=" + screen + ", speaker=" + speaker + "]";
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public Mobile(Camera camera, Screen screen, Speaker speaker) {
		super();
		this.camera = camera;
		this.screen = screen;
		this.speaker = speaker;
	}
	
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}		
	
}
