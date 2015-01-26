public class Revenue2 implements RevenueStrategy {

	public double revenue(int balance, int days) {
		if (balance <= 250000) {
			return balance * days * 0.04 / 365;	
		}
		return balance * days * 0.06 / 365;
	}

}