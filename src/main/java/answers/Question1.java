package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int ans = 0;
		for (int p1 : portfolios) {
			for(int p2 : portfolios){
				int temp = p1 ^ p2;
				if (temp > ans) {
					ans = temp;
				}
			}
		}
		return ans;
	}

}
