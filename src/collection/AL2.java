package collection;

import java.util.ArrayList;
import java.util.List;

public class AL2 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("AAAA");
		list.add("1234");
		list.add("d'd''d'");
		for(int x=0;x<list.size();x++) {
			//Object str=list.get(x);
			String str= list.get(x);//���׸��� �����ָ� list.get�� object�� �����ϱ⶧���� ���������Ե�
			System.out.println(str);
		}
		System.out.println("===========");
		for(String str : list) {
			System.out.println(str);
		}
	}

}
