package test.annotation.fruit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	RedApple apple=(RedApple)Test.testAnnon(RedApple.class,null);
		//String appleStr=XMLUtils.transObjectToXml(apple, true);
		System.out.println(apple.getMyString());
		//Apple.class
		RedApple.class.getAnnotations();*/
		MyFruit f=new MyFruit();
		System.out.println(f.getName());
	}
	public static Object testAnnon(Class c,Class annotationClass){
		try{
			if(c==null){
				return null;
			}
			if(annotationClass==null){
				return c.newInstance();
			}
			return c.getAnnotation(annotationClass);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static Object getAnnonObject(Class c){
		Object object=null;
		try{
			if(c==null){
				return object;
			}else{
				object=c.newInstance();
				for (Field field : c.getDeclaredFields()) {
					Annotation[] annotations = field.getDeclaredAnnotations();
					if (annotations.length <= 0){
						continue;
					}else{
						
					}
				}
				
			}
			 
		}catch(Exception e){
			e.printStackTrace();
			return object;
		}
		return object;
	}

}
