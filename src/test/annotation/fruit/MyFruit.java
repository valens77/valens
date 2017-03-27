package test.annotation.fruit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import test.annotation.fruit.FruitColor.FColor;
import test.annotation.table.SQLInteger;

/**
 * 水果名称 默认""
 * 
 * @author huang_xiaohua
 * 
 */

public class MyFruit {
	@FruitName("苹果")
	private String name;
	@FruitColor(fruitColor = FColor.RED)
	private String color;
	public MyFruit(){
		init();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	private void init(){
		for (Field field : MyFruit.class.getDeclaredFields()) {
			
			Annotation[] annotations = field.getDeclaredAnnotations();
			if (annotations.length <= 0)
				continue;
			if (annotations[0] instanceof FruitName) {
				FruitName fname = (FruitName) annotations[0];
				this.name=fname.value();
			}
			if (annotations[0] instanceof FruitColor) {
				FruitColor fc = (FruitColor) annotations[0];
				this.color=fc.fruitColor().name();
			}
		}
	}
}
