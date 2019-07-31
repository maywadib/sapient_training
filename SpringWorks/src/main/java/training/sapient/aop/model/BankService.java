package training.sapient.aop.model;

public class BankService {

	private SBAccount sbAccount;
	private CAAccount caAccount;

	public SBAccount getSbAccount() {
		return sbAccount;
	}

	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}

	public CAAccount getCaAccount() {
		System.out.println("called  getCaAccount() ");
		return caAccount;
	}

	public void setCaAccount(CAAccount caaccount) {
		this.caAccount = caaccount;
	}

	public BankService(SBAccount sbAccount, CAAccount caaccount) {
		super();
		this.sbAccount = sbAccount;
		this.caAccount = caaccount;
	}

	@Override
	public String toString() {
		return "BankService [sbAccount=" + sbAccount + ", caaccount=" + caAccount + "]";
	}

	public BankService() {
		// TODO Auto-generated constructor stub
	}

}
