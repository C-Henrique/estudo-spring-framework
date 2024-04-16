package helloword;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWordSpring {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class)) {
			System.out.println(context.getBean("name"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}
}
