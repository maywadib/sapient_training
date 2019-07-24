package training.servlets.basics;

public class EData {

	private String eName;
	private String eEmail;
	private int eId;

	public EData() {
		// TODO Auto-generated constructor stub
	}

	public EData(String eName, String eEmail, int eId) {
		super();
		this.eName = eName;
		this.eEmail = eEmail;
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "EData [eName=" + eName + ", eEmail=" + eEmail + ", eId=" + eId + "]";
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

}
