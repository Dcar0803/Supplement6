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

}//end of testing class
