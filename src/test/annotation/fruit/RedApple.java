package test.annotation.fruit;

/**
 * 
 * @author huang_xiaohua
 *
 */
@Apple(color="红色")
public class RedApple {
	
	
	public String getMyString(){
		Apple apple=RedApple.class.getAnnotation(Apple.class);
		return apple.value+":"+apple.color();
	}
	 
}
