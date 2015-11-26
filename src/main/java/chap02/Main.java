package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g = ctx.getBean("greeter",Greeter.class); //객체 리턴
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}

}
