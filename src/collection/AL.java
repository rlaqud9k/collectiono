package collection;

import java.util.ArrayList;
import java.util.List;

public class AL {

	public static void main(String[] args) {
		List list= new ArrayList();
		//List<Integer> list= new ArrayList<Integer>();//정수전용이됨(제네릭타입)
		
		int[]a=new int[10];
		ArrayList list2 =new ArrayList();
		list.add(1);
		list.add("aaaa");
		list.add(3.14);
		//list.remove(0);
		list.set(2, 3.213);
		for(int x=0;x<list.size();x++) {
			System.out.println(list.get(x));
		}
		System.out.println(list.size());
		System.out.println(a.length);
	}

}
