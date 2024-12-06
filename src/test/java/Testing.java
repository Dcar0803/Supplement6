import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class Testing {

	@Test
	public void testGenerateRandomList() {
		
       List<Integer> randomList = RandomListGenerator.generateRandomList(10);
        
       assertNotNull(randomList, "The generated list should not be null");
        
       assertEquals(10, randomList.size(), "The size of the generated list should match the input size");
        
       for (Integer num : randomList) {
           
    	   assertNotNull(num, "Each element in the list should be an integer");
        
       }//end of for loop
    
	}//end of TestGenerateRandomList
	
	
	@Test
	public void testMapOccurrences() {
		
        List<Integer> inputList = List.of(1, 2, 2, 3, 3, 3);

        Map<Integer, Integer> occurrences = IntegerOccurrencesMapper.mapOccurrences(inputList);

       
        assertEquals(3, occurrences.size(), "The map should have 3 unique keys");

       
        assertEquals(1, occurrences.get(1), "The count for 1 should be 1");
        assertEquals(2, occurrences.get(2), "The count for 2 should be 2");
        assertEquals(3, occurrences.get(3), "The count for 3 should be 3");

        // Test with an empty list
        Map<Integer, Integer> emptyOccurrences = IntegerOccurrencesMapper.mapOccurrences(Collections.emptyList());
        
        assertTrue(emptyOccurrences.isEmpty(), "The map should be empty for an empty input list");
    
	}//end of testMapOccurrences

}//end of testing class
