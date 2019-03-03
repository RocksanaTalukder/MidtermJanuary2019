package datastructure;
import java.util.Iterator;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
			list.add("NY");
			list.add("FL");
			list.add("CA");

			Iterator it = list.listIterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}


		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	

	}


