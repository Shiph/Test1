public class Revenue1 implements RevenueStrategy {
	
	public double revenue(int balance, int days) {
		return balance * days * 0.04 / 365;
	}

}