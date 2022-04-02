package JAVA_07;

import java.util.ArrayList;

class AccountMananger{
	//ArrayList 사용
	ArrayList<Account> list = new ArrayList<>();
	//계좌추가
	public void insertAccount(String name, int money) {
		list.add(new Account(name, money));
	}
	
	
	// 리스트출력
	public void viewAccount() {
		//계좌명, 잔액
//		for(Account ac : list) {
//			System.out.println(ac.getName() 
//					+" 잔액 :" + ac.getMoney());
//		}
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getName() +" 잔액 : " +
		           list.get(i).getMoney());
		}
	}
	
}

public class AccountMain {

	public static void main(String[] args) {
		AccountMananger am = new AccountMananger();
		am.insertAccount("홍길동",3000);
		am.insertAccount("이순신",5000);
		am.insertAccount("강감찬",10000);
		am.viewAccount();
	}

}