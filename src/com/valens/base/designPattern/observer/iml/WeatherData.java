package com.valens.base.designPattern.observer.iml;

import java.util.ArrayList;

import com.valens.design.observer.Observer;
import com.valens.design.observer.Subject;

//WeatherData现在实现了Subject接口
public class WeatherData implements Subject {
	// 我们加上一个ArrayList来记录观察者，此ArrayList是在构造器中建立的。
	public ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	// 当注册观察者时，我们只要把它加到ArrayList的后面即可
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	// 当观察者想取消注册，我们把它从ArrayList中删除即可
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	// 在这里，我们把状态告诉每一个观察者
	// 因为观察者都实现了update()，所以我们知道如何通知它们
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	// 当从气象站得到更新观测值时，我们通知观察者
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}