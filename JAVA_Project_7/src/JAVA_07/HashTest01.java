package JAVA_07;

import java.util.HashMap;
import java.util.Scanner;

public class HashTest01 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("java","1111");
		hm.put("oracle","1234");
		hm.put("jsp","abcd");
		Scanner sc = new Scanner(System.in);
		System.out.println("id/password 를 입력하세요");
		System.out.println("id 입력 >>");
		 String id =sc.next();
		 System.out.println("password 입력 >>");
		 String password =sc.next();
		//입력한  id 가 없습니다.
		 if(!hm.containsKey(id)) {
			 System.out.println("입력한  id 가 없습니다.");
			 return;
		 }
		 //입력한 비번이 입력한  id의  value  값과 같아야 모두일치
		 if(password.equals(hm.get(id))) {
			 System.out.println("모두 일치합니다.");
		 }else {
			 System.out.println("비밀번호가 일치하지 않습니다.");
		 }
		 
		 
		//모두 일치합니다.
		//비밀번호가 일치하지 않습니다.
		
	}

}
