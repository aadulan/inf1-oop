import java.util.ArrayList;

public class Question1 {

	public static ArrayList<Integer> cayley() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =1;i <10;i++)
		{
			for (int j =0;j<10;j++){
				int k =(i*10)+j;
				
				if((i*j)+(i+j)==k)
				{
					numbers.add(k);
				}
				
			}
		}
		
		return numbers;

	}

	public static int[] countVowels(String[] words) {
		int n = words.length;
		int[] vowels = new int[n];
		// do not declare it here, otherwise it adds stuff

		for (int k = 0; k < words.length; k++) {

			String word = words[k];
			int v = 0;
			for (int i = 0; i < word.length(); i++) {

				if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
						|| word.charAt(i) == 'U' || word.charAt(i) == 'a' || word.charAt(i) == 'e'
						|| word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
					v++;

				}

			}
			vowels[k] = v;

		}
		return vowels;
	}

	public static String mostVowels(String[] words) {
		String s = "";

		if (words.length == 0) {
			return s;
		} else {
			int[] numbers = countVowels(words);
			int max = 0;
			int index = 0;
			for (int i = 0; i < words.length; i++) {
				if (numbers[i] > max) {
					max = numbers[i];
					index = i;
				}
			}

			s = words[index];

			return s;
		}

	}

	public static void main(String[] args) {
		
		ArrayList<Integer> nos = Question1.cayley();
		System.out.print(nos);
		System.out.println();
		
		
		

//		String[] words = { "HELLO", "world" };
//		int[] numbers = Question1.countVowels(words);
//		for (int j = 0; j < numbers.length; j++) {
//			System.out.println(numbers[j]);
//		}
//
//		System.out.println(mostVowels(words));

		 String[] chart = new String[args.length];
		
		for (int i = 0; i < args.length; i++) {
		   chart[i] = args[i];
	 }
		//
		int[] numbers = Question1.countVowels(chart);
		System.out.print("[");
		 for (int j = 0; j < numbers.length; j++) {
		 
			 if(j==numbers.length-1)
			 {
				 System.out.print(numbers[j]);
			 }else
			 {
				 System.out.print(numbers[j]+", ");
			 }
		 }
		 System.out.print("]");
		 System.out.println();
		 System.out.print(Question1.mostVowels(chart));

	}

}
