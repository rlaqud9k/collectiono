package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AL5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("aaaa");
		list.add("bbb");
		list.add("123454");
		list.add("5433");
		list.add("efe");
		
		System.out.println("+++++++++++++++++++++++++");
		for(/*Object*/String str:list) {
			System.out.println(str);
		}
		Collections.sort(list);//소트가 되는건 기본자료형뿐임 사용자 정의 클래스는 솔트가 안됨.
		System.out.println("+++++++++++++++++++++++++");
		for(/*Object*/String str:list) {
			System.out.println(str);
		}
	}

}
