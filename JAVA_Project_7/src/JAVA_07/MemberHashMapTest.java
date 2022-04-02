package JAVA_07;


public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001,"이도현");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박보검");
		Member memberHong = new Member(1004,"홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
	
		
		Member mem = memberHashMap.removeMember(1);
		if(mem == null) {
			System.out.println("삭제 실패");
		}else {
			System.out.println(mem.getMemberId()+"삭제");
		}
		memberHashMap.showAllMember();

	}

}
