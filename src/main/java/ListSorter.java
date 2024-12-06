import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {
	
	  /**
     * Sorts a list of integers in ascending order.
     *
     * @param numbers the list of integers
     * @return a new list sorted in ascending order
     */
	
    public static List<Integer> sortListAscending(List<Integer> numbers) {
        
    	List<Integer> sortedList = new ArrayList<>(numbers);
        
        Collections.sort(sortedList);
        
        return sortedList;
    
    }//end of sortListsAscending
    
}//end of ListSorter class
