package com.spring.demo.dependancyinjection.manyclassesonedependancy;

public class AnotherStudent {

	MathCheat cheat;

	

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}



	public void startCheating() {
		cheat.mathCheat();
		System.out.println("Another student is cheating!");
	}
}
