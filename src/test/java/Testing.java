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
	
	 @Test
	    public void testSortListAscending() {
		 
		 List<Integer> unsortedList = List.of(5, 3, 8, 1, 2);
	        List<Integer> sortedList = ListSorter.sortListAscending(unsortedList);
	        List<Integer> expectedList = List.of(1, 2, 3, 5, 8);

	        
	        assertEquals(expectedList, sortedList, "The list should be sorted in ascending order");

	       
	        assertNotEquals(unsortedList, sortedList, "The original list should remain unchanged");

	        
	        List<Integer> emptyList = Collections.emptyList();
	        List<Integer> sortedEmptyList = ListSorter.sortListAscending(emptyList);
	        assertTrue(sortedEmptyList.isEmpty(), "Sorting an empty list should return an empty list");

	      
	        List<Integer> singleElementList = List.of(42);
	        List<Integer> sortedSingleElementList = ListSorter.sortListAscending(singleElementList);
	        assertEquals(singleElementList, sortedSingleElementList, "A single-element list should remain unchanged");
	    }//end of testSortListingAscending

}//end of testing class
