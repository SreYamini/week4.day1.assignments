package week4.day1.assignments;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class FindSecondLargest {

	public static void main(String[] args) {
		
		
				int[] data = {3,2,11,4,6,7};
				
				List<Integer> secondLarge = new LinkedList<Integer>();
				
				for (int i = 0; i < data.length; i++) {
					
					secondLarge.add(data[i]);
				}
				
				Collections.sort(secondLarge);
				
				System.out.println(secondLarge);
				
				int size = secondLarge.size();
				
				System.out.println("The second largest is "+secondLarge.get(size-2));

	}

}
