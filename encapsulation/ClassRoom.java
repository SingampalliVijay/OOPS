package com.kn.encapsulation;

public class ClassRoom {
  private int temperature;

public int getTemperature() {
	return temperature;
}

public void setTemperature(int temperature) {
	if(temperature>=15 && temperature<=27) {
	this.temperature = temperature;
	}else {
		System.out.println("Invalid Temperature");
	}
}
  
}
