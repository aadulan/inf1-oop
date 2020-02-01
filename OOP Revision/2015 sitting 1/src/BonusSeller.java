import java.util.HashMap;
import java.util.Map;

public class BonusSeller extends Seller {

	private HashMap<String, Double> sales;

	public BonusSeller(String n) {
		super(n);
		sales = new HashMap<String, Double>(10);

	}

	public void sale(String c, double d) {
		super.sale(d);
		sales.put(c, super.getWeightSold());
	}

	public String toString() {

		String s = super.toString() + "\n Sales per customer: \n";
		String d = "";
		for (Map.Entry<String, Double> t : sales.entrySet()) {
			d = t.getKey() + ":" + (int)Math.round(t.getValue()) + "kg" + "\n";
		}
		return s + d;

	}
	public int calculateBonus(){
		
		int count =0;
		int bonus=0;
		for(Map.Entry<String, Double> t: sales.entrySet())
		{
			if(t.getValue()>=20) count ++;
		}
		if(count< 5 )
		{
			bonus=0;
		}else if (count>=5 && count<10)
		{
			bonus=5;
		} else bonus =7;
		return bonus;
	}

}
