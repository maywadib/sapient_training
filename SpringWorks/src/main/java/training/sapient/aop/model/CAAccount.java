package training.sapient.aop.model;

public class CAAccount {

	
	private Account account;

	public Account getAccount() {
		System.out.println("called.. getAccount()  ");
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public CAAccount(Account account) {
		super();
		this.account = account;
	}

	@Override
	public String toString() {
		return "CAAccount [account=" + account + "]";
	}
	public CAAccount() {
		// TODO Auto-generated constructor stub
	}
	
}
