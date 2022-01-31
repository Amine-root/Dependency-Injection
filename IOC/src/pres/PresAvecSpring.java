package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresAvecSpring {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		IMetier metier = (IMetier) ctx.getBean("metier");
		System.out.println(metier.calcul());
	}

}
