package training.sapient.aop.model;

public class SBAccount {

	
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "SBAccount [account=" + account + "]";
	}

	public SBAccount(Account account) {
		super();
		this.account = account;
	}
	
	public SBAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double showbalance() {
		return account.getBalance();
	}
}
