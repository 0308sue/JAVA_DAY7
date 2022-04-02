package JAVA_07;

import java.util.HashMap;
import java.util.Scanner;

public class HashTest02 {
	//1. 해쉬맵 map 을 생성
	// 2. 단어를 입력받아 단어와 입력 횟수 저장
	//3. 대소문자 구분없이  x 치면 종료.
	//4. map  출력
	//예)java test java test test test abc  x
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("단어입력(종료 x) >>");
			String word = sc.next();
		//	if(word.equals("x")) break;
		//	if(word.toLowerCase().equals("x"))break;
		//	if(word.toUpperCase().equals("X"))break;
			if(word.equalsIgnoreCase("x")) break;
//			int value;
//			if(map.containsKey(word)) { //입력한 단어가  map 에 있으면
//				value = map.get(word)+ 1;
//			}else {
//				value=1;
//			}
//			map.put(word, value);
			//map.put(word, map.containsKey(word)==true ?map.get(word)+ 1 : 1 );
			map.put(word, map.containsKey(word) ?map.get(word)+ 1 : 1 );
		}
		System.out.println(map);

	}

}
