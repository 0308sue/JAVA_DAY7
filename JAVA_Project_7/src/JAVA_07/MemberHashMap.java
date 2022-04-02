package JAVA_07;

import java.util.HashMap;
import java.util.Iterator;

import JAVA_07.Member;



public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(),member);
	}
	
	public Member removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {//HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면 
			Member m = hashMap.remove(memberId);//해당 회원 삭제 
				return m;
				}
			return null;
		}
		
		public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { //다음 key가 있으면
			int key = ir.next(); //key 값을 가져와서 
			Member member = hashMap.get(key);//key로부터 value 가져오기
				System.out.println(member);
			}
			System.out.println();
		}
	}
