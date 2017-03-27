package com.valens.design.observer;

public interface Observer {
	// 当气象观测值改变时，主题会把温度、湿度、气压的状态值当作方法的参数，传送给观察者
	public void update(float temp, float humidity, float pressure);
}
