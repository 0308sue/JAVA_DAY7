package JAVA_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapTest01 {
	/*
	 *   1.   해쉬맵  hm 생성
	 *   2.  1에서 20사이의 난수를 발생 (Math.random())
	 *   3. 난수 10개를  hm에 추가 단 value값 중복허용 안됨
	 */
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i =1 ; i<11; i++) {
			while(true) {
				int  v =(int)(Math.random()*20)+1;  //1에서 20사이의 난수
				if(!hm.containsValue(v)) {  //hm.containsValue(v) == false
					hm.put(i, v);
					break;
				} //if
			}//while
		}//for
		System.out.println(hm);
		// value 값만 출력
		System.out.println(hm.values());
		for(Integer value : hm.keySet()) {
			System.out.println("value = " + hm.get(value));
		}
		//value 을 오름차순 으로 정렬
		List<Integer> list = new ArrayList<>(hm.values());
		Collections.sort(list);
		System.out.println("==정렬 후 == ");
		for(int i : list) {
			System.out.print( i +"\t");
		}
		System.out.println("\n ==== reverse===");
		Collections.reverse(list);
		for(int i : list) {
			System.out.print( i +"\t");
		}
		System.out.println("\n최대값 : " + Collections.max(list));
		System.out.println("최소값 : " + Collections.min(list));

	}

}

