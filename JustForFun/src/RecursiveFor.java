import java.util.ArrayList;
import java.util.Date;

public class RecursiveFor {

	public static int counter = 0;
	
	public static void main(String[] args) {
		Date d = new Date();
		recurse(1, 11, 12, new ArrayList<Integer>());
		System.out.println(counter);
		Date d2 = new Date();
		System.out.println(d2.getTime() - d.getTime());
	}
	
	public static void recurse(int start, int exEnd, int levels, ArrayList<Integer> ints) {
		if(levels <= 0) {
			//System.out.println(ints);
			counter++;
			return;
		}
		ints.add(0);
		for(int i = start; i < exEnd; i++) {
			ints.set(ints.size() - 1, i);
			recurse(start, exEnd, levels - 1, ints);
		}
		ints.remove(ints.size() - 1);
	}
}
