import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomListGenerator {
	
	/**
     * Generates a random list of integers.
     *
     * @param size the size of the list to generate
     * @return a list of random integers
     */
	
	public static List<Integer> generateRandomList(int size) {
		
        List<Integer> randomList = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
        	
            randomList.add(random.nextInt(100)); // Generates numbers between 0 and 99
        
        }//end of for loop
        
        return randomList;
        
        
    }//end of generateRandomList method

}//end of RandomListGenerator class
