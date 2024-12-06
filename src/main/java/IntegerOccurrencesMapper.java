import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerOccurrencesMapper {
	
	  /**
     * Maps integers in a list to their number of occurrences.
     *
     * @param numbers the list of integers
     * @return a map where the key is the integer, and the value is its count
     */
	
    
	public static Map<Integer, Integer> mapOccurrences(List<Integer> numbers) {
        
		Map<Integer, Integer> occurrences = new HashMap<>();
        
		for (Integer number : numbers) {
            
			occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }//end of for loop 
		
       
		return occurrences;
    
	}//end of mapOccurrences method 
    
}//end of class 
