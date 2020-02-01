import java.util.Map;

public class PremiumCustomer extends Customer {

		private Map<String,String> freeGifts;
	
	public PremiumCustomer(String n, Map<String,String> gifts) {
		super(n);
		this.freeGifts = gifts;
		
	}
	public void giftsFrom(String gifts,int quantity)
	{
		if(freeGifts.containsKey(gifts))
		{
			System.out.println(freeGifts.get(gifts) +" x"+ quantity);
		}
	}

	public String toString() {//
		String t = "";
				
				for(Map.Entry<String, String> s : freeGifts.entrySet())
				{
					t = freeGifts.get(s) + " on ordeing " + s;
				}
				String s = super.toString()+ "\n"+ "Free gifts; \n" + t;
		 return s;
	}
	public int chocolateGifts()
	{
		int count =0;
		
		for (int i = 0 ;i<freeGifts.size(); i++)
		{
			if(freeGifts.get(i).contains("chocolate")){
				count ++;
			}
		}
		return count;
	}
	

}
