package JAVA_07;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String>  hm = new HashMap<>();
		hm.put("one", "첫번째");
		hm.put("two", "두번째");
		hm.put("three", "세번째");
		hm.put("four", "네번째");
		System.out.println(hm); //순서 없음 , 중복 허용 안함(key)
		hm.put("one", "첫번째첫번째");
		System.out.println(hm); 
		hm.put("oneone", "첫번째첫번째");
		System.out.println(hm); 
		System.out.println(hm.size());
		System.out.println(hm.get("one"));
		String value = hm.remove("oneone");
		System.out.println("제거 : " + value);
		System.out.println(hm);
		
		HashMap<String, String>  h = new HashMap<>();
		h.put("1", "딸기");
		h.put("2", "딸기2");
		h.put("3", "딸기3");
		h.put("4", "딸기4");
		//h 에 있는 value 값 출력
//		System.out.println(h.get("1"));
//		System.out.println(h.get("2"));
//		System.out.println(h.get("3"));
//		System.out.println(h.get("4"));
		
		for(int i = 1; i<=h.size();i++) {  // i = 1,2 ,3,4
			//System.out.println(h.get(i+""));  // i(int) ==> String
			System.out.println(h.get(String.valueOf(i)));
		}
	

		//h 라는 해쉬맵에서 키값에서 "1"이 있나요?
		System.out.println(h.containsKey("1"));
		//h 라는 해쉬맵에서 value값에서 "딸기" 있나요?
		System.out.println(h.containsValue("딸기"));
		//h 라는 해쉬맵에서 키 값만 출력
		 System.out.println(h.keySet());
		//h 라는 해쉬맵에서  value 값만 출력
		 System.out.println(h.values());
		 System.out.println("=======");
		HashMap<String, String>  hash = new HashMap<>();
		hash.put("one", "바나나");
		hash.put("two", "바나나2");
		hash.put("three", "바나나3");
		hash.put("four", "바나나4");
		 System.out.println(hash.values());
		 //get 을 이용해서 value 값 출력  ==>  value =  get(key)
		 for(String key : hash.keySet()) {
			 System.out.println("value = " + hash.get(key));
		 }
		 for(String val : hash.values()) {
			 System.out.println("v = " + val);
		 }
		HashMap<Integer, String>  h1 = new HashMap<>();
		h1.put(1, "사과");
		h1.put(2, "사과2");
		h1.put(3, "사과3");
		h1.put(4, "사과4");
		for(int i = 1; i<=h1.size();i++) {  // i = 1,2 ,3,4
			System.out.println(h1.get(i));  
		
		}
		
		HashMap<Integer,String> handsome = new HashMap<>();
		handsome.put(1, "박보검");
		handsome.put(2, "이수혁");
		handsome.put(3, "서강준");
		handsome.put(4, "유태오");
		
		for(int i = 1;i<= handsome.size();i++) {
			System.out.println(handsome.get(i));
		}
		
	}

}





