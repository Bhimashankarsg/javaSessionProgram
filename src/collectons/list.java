package collectons;

import java.util.*;

public class list {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(20);
		list.add(10);
		list.add(40);

		int a[] = { 3, 4, 22, 11, 3 };

		// System.out.println(list);
		ListIterator listit = list.listIterator();
		for (int i = a.length - 1; i >= 0; i--) {
			listit.add(a[i]);
		}

		listit = list.listIterator();

		while (listit.hasNext()) {
			System.out.println(listit.next());
		}

	}

}
