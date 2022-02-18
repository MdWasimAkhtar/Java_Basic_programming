package com.springCore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestExpressionLanguage {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/spel/spelConfig.xml");
		
	//	TrySPEL spl = (TrySPEL) context.getBean("ob");
		TrySPEL  spl2 = context.getBean("ob", TrySPEL.class);
		System.out.println(spl2);
		
		SpelExpressionParser sep = new SpelExpressionParser();
		Expression exp = sep.parseExpression("22+99");
		System.out.println(exp.getValue());
		
				
	}

}
