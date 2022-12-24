package mement.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	private int money;
	private List<String> fruits;
	
	public int getMoney() {
		return money;
	}
	
	// javaでは可視性がない場合は、ほぼprotectedと同等の扱い
	Memento(int money){
		this.money = money;
		this.fruits = new ArrayList<>();
	}

	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	List<String> getFruits(){
		return new ArrayList<>(fruits);
	}
}
