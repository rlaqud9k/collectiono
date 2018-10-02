package collection;

import java.util.ArrayList;
import java.util.List;

public class AL2 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("홍길동");
		list.add("AAAA");
		list.add("1234");
		list.add("d'd''d'");
		for(int x=0;x<list.size();x++) {
			String str= list.get(x);//제네릭을 안해주면 list.get은 object를 참조하기때문에 오류가나게됨
			System.out.println(str);
		}
	}

}
