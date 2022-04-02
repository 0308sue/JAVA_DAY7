package JAVA_07;

public class Account {
	private String name;
   private 	int money;
   
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void inputMoney(int money) {
		this.money += money;
	}
	public void outputMoney(int money) { //잔액- 출금할 돈
		if(this.money < money) {
			System.out.println(name +" 님 잔액부족");
			return; //종료
		}
		this.money -= money;
//		if(this.money  < money) {
//			System.out.println(name +" 님 잔액부족");
//		}else {
//			this.money -= money;
//		}
	}
	public int getMoney() {
		return money;
	}
	//getter
	public String getName() { //name
		return name;
	}

}