package collection;

import java.util.ArrayList;
import java.util.List;

class AA{
	int bun;
	String name;
	AA(int bun, String name){
		this.bun=bun;
		this.name=name;
	}
public void print() {
	System.out.print(bun + ":"+name);
}
	
	//	@Override
//	public String toString() {
//		return bun +"\t:"+name;
//	}
}
public class AL3 {

	public static void main(String[] args) {
		List<AA> list = new ArrayList<AA>();
		List list2= new ArrayList();
		list2.add("aaa");
		list2.add(1234);
		list2.add("123");
		list.add(new AA(1,"aaaa"));
		list.add(new AA(2,"qwera"));
		list.add(new AA(3,"cxb"));
		list.add(new AA(4,"fdsg"));
		list.add(new AA(5,"asdf"));
		for(int x=0;x<list.size();x++) {
			AA aa=list.get(x);//���׸��� ������� ������ ������Ʈ�� �����ϱ⶧���� ����ȯ�� ���ָ� �ȴ�.
			aa.print();
		}
		for(int x=0;x<list2.size();x++) {
			System.out.println(list2.get(x));
		}
	}

}
