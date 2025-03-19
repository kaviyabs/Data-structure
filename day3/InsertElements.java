package addon;
import java.util.*;
public class InsertElements {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
	        list.add(0, 777);
	        list.add(4, 333);
	        System.out.println("Updated List: " + list);
	    }
	}

