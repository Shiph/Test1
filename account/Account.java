public class Account {
	
	private double balance;
	private RevenueStrategy rev;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public double revenue(int days, RevenueStrategy rev) {
		return rev.revenue(balance, days);
	}
	
	// other methods omitted

}//Account