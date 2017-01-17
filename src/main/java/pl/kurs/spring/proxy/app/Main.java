package pl.kurs.spring.proxy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.kurs.spring.proxy.config.ProxyApplicationConfiguration;

/*
Target class: class pl.kurs.spring.proxy.service.impl.ConsolePrinterSericeImpl
Hello World, I'm in Spring!

Target class: class com.sun.proxy.$Proxy15 //dynamic proxy (JDK - kiedy istnieje interface)
Metoda: print
Hello World, I'm in Spring!

Target class: class pl.kurs.spring.proxy.service.impl.ConsolePrinterSericeImpl$$EnhancerBySpringCGLIB$$eabe2c3b //static proxy (kiedy nie ma interfejsu) uwaga: wymagana jest biblioteka CGLIB ktora od spring 3.x lub 4.x jest domyslnie w pakiecie spring.
Metoda: print
Hello World, I'm in Spring!

 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ProxyApplicationConfiguration.class);
		context.getBean(ProxyAppRunner.class).start();
	}
}
