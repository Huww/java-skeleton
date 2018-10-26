package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int ans = 0;
		for (int i = 0; i < portfolios.length-1; i++) {
			for(int j = i + 1; j < portfolios.length; j++){
				int temp = portfolios[i] ^ portfolios[j];
				if (temp > ans) {
					ans = temp;
				}
			}
		}
		return ans;
	}

}
