import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerOccurrencesMapper {
	
    
	public static Map<Integer, Integer> mapOccurrences(List<Integer> numbers) {
        
		Map<Integer, Integer> occurrences = new HashMap<>();
        
		for (Integer number : numbers) {
            
			occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }//end of for loop 
		
       
		return occurrences;
    
	}//end of mapOccurrences method 
    
}//end of class 
