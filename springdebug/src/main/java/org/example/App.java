package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Hello world!
 *
 */
@ComponentScan("org.example")
public class App 
{
    public static void main( String[] args )
    {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(App.class);
		Hello bean = configApplicationContext.getBean(Hello.class);
		bean.sayHello();
		configApplicationContext.close();

	}
}

@Service
class Hello{
	public void sayHello(){
		System.out.println("hello");
	}
}
