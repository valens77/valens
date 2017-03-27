package test.annotation.springtest;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ApplicationContext
		FileSystemXmlApplicationContext context =null;
		context = new FileSystemXmlApplicationContext(
				"/WebRoot/WEB-INF/test/context-index.xml",
				"/WebRoot/WEB-INF/test/context-index.xml"
		);
		//org.antlr.runtime.BitSet bs;
		//DefaultListableBeanFactory a;
		//XmlBeanDefinitionReader f;
		ActionBean action=(ActionBean)context.getBean("action");
		System.out.println(action);

	}
}
