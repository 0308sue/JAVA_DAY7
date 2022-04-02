package JAVA_07;

import java.util.Iterator;
import java.util.Vector;
//collection 요소 순회 
public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(5);
		vc.add(-1);
		vc.add(new Integer(3));
		vc.add(2, 100);
		System.out.println(vc);
		for(Integer i : vc) {
			System.out.println(i);
		}
		System.out.println("====");
	  Iterator<Integer> it = 	vc.iterator();
	  while(it.hasNext()) {//이후에 요소가 더 있는지 체크후 있다면 true로 반환 
		  System.out.println(it.next());//다음에 있는 요소 반환 
	  }

	}

}
