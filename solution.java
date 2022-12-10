import java.util.HashMap;
import java.util.Map;

public class NewspaperSubscription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, double[]> newspaperSubscription = new HashMap<>();
		double[] toi = {3,3,3,3,3,5,6};
		double[] hindu = {2.5,2.5,2.5,2.5,2.5,4,4};
		double[] et = {4,4,4,4,4,4,10};
		double[] bm = {1.5,1.5,1.5,1.5,1.5,1.5,1.5};
		double[] ht = {2,2,2,2,2,4,4};
		
		newspaperSubscription.put("TOI", toi);
		newspaperSubscription.put("HINDU", hindu);
		newspaperSubscription.put("ET", et);
		newspaperSubscription.put("BM", bm);
		newspaperSubscription.put("HT", ht);
		
		// double budget = 40;
        int array[] = new int[2];
        array[0] = 40;
        array[1] = 35;

		for(int budget: array)
		{System.out.println("Possible Combinations for Budget "+budget+" :");
		
		for(String paper1 : newspaperSubscription.keySet()) {
			double[] price1 = newspaperSubscription.get(paper1);
			double totalPrice1 = 0;
			for(int i=0;i<price1.length;i++) {
				totalPrice1 = totalPrice1 + price1[i];
			}
			
			for(String paper2 : newspaperSubscription.keySet()) {
				if(paper1.equals(paper2)) {
					continue;
				}
				double[] price2 = newspaperSubscription.get(paper2);
				double totalPrice2 = 0;
				for(int i=0;i<price2.length;i++) {
					totalPrice2 = totalPrice2 + price2[i];
				}
				
				double totalPrice = totalPrice1 + totalPrice2;
				
				if(totalPrice<=budget) {
					System.out.println("{"+paper1+","+paper2+"}");
				}
				
			}}
			
		}

	}

}