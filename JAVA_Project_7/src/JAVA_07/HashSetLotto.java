package JAVA_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		// 로또번호 6개 출력(1에서 45까지의 난수 6개 출력)
		Set<Integer> set = new HashSet<>();
		while(set.size()<6) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		//오름차순 으로
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println("------- 정렬 후 -------");
		System.out.println(list);
	}

}
