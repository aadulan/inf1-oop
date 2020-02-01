
public class Favourite {
	
	private static final int n = 5;
	private int count = 0;
	private MusicTrack [] favourites = new MusicTrack[n];
			
	
	public void addTrack(String artist, String title)
	{
		MusicTrack add = new MusicTrack(artist,title);
		
		if (count<n){
			favourites[count]= add;
			count ++;
		}
		else{
			System.out.println("Sorry, can't add: "+ add.toString());
		}
		
		System.out.println();
		
			
	
	}
	public void showFavourites()
	{
		for(int i =0 ; i<count;i++){
			System.out.println(favourites[i].toString());
		}
	}
	
	public static void main(String[] args){
		
			
		Favourite favourites = new Favourite();
		favourites.addTrack("Fun", "Some Nights");
		favourites.addTrack("Oliver Tank", "Help You Breathe");
		favourites.addTrack("Horse Feathers", "Fit Against the Country");
		favourites.addTrack("Emile Sande", "Country House");
		favourites.addTrack("Fun", "Walking the Dog");
		favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
		favourites.showFavourites();
	}

}
