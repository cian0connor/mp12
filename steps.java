public class steps{	
	public static void main(String args[])
	{
		int step = 1, zeros = 0, ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixs = 0, sevens = 0, eights = 0, nines = 0, totalTiles;
		float  totalCost, labourCost, partsCost;
		String stepAsString;
		
		while(step < 136)
		{
			stepAsString = Integer.toString(step);
			
			for(int i = 0; i < stepAsString.length(); i++)
			{
				if(stepAsString.charAt(i) == '0')
				{
					zeros++;
				}
				
				if(stepAsString.charAt(i) == '1')
				{
					ones++;
				}
				
				if(stepAsString.charAt(i) == '2')
				{
					twos++;
				}
				
				if(stepAsString.charAt(i) == '3')
				{
					threes++;
				}
				
				if(stepAsString.charAt(i) == '4')
				{
					fours++;
				}
				
				if(stepAsString.charAt(i) == '5')
				{
					fives++;
				}
				
				if(stepAsString.charAt(i) == '6')
				{
					sixs++;
				}
				
				if(stepAsString.charAt(i) == '7')
				{
					sevens++;
				}
				
				if(stepAsString.charAt(i) == '8')
				{
					eights++;
				}
				
				if(stepAsString.charAt(i) == '9')
				{
					nines++;
				}
				
				
			}
			
			step++;
		}
		
		totalTiles = (zeros + ones + twos + threes + fours + fives + sixs + sevens + eights + nines);
		partsCost = (float)((totalTiles * 13.50) + ((totalTiles * 0.1)*13.50));
		labourCost = (float)(totalTiles * 8.51);
		totalCost = partsCost + labourCost;
		
		System.out.println("Zeros: " + zeros +
						   "\nOnes: " + ones +
						   "\nTwos: " + twos +
						   "\nThrees: " + threes +
						   "\nFours: " + fours +
						   "\nFives: " + fives +
						   "\nSixs: " + sixs +
						   "\nSevens: " + sevens +
						   "\nEights: " + eights +
						   "\nNines: " + nines +
						   "\nTotal Tiles: " + totalTiles +
						   "\nTotal Parts Cost: " + String.format("%.2f%s",partsCost," EUROS") +
						   "\nTotal Labour Cost: " + String.format("%.2f%s",labourCost," EUROS")+
						   "\nTotal Cost: " + String.format("%.2f%s",totalCost," EUROS"));
		
	}
}