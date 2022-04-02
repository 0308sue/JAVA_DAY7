package JAVA_07;

import java.util.ArrayList;

//p275~276

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날아갑니다.");
	}
}
class Rose extends Animal{
	@Override
	public void move() {
		System.out.println("장미가 바람에 흔들립니다.");
	}

}
public class AnimalTest {
	ArrayList<Animal> anList = new ArrayList<Animal>();
	
	public void addAnimal() {
		anList.add(new Human());
		anList.add(new Tiger());
		anList.add(new Eagle());
		anList.add(new Rose());
		for(Animal ani  :anList ) {
			ani.move();
		}
	}
	public void testCasting() {
		for(int i=0; i<anList.size();i++) {
			Animal ani =   anList.get(i);
			if(ani instanceof Human) {  //  Haman(하위)= Animal(상위)
				// Human h = (Human) ani;
				// h.readBook();
				((Human) ani).readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			}else {
				 System.out.println("지원되지 않는 형입니다.");
			}
		}
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("====다운 캐스팅 ====");
		aTest.testCasting();

	}

}