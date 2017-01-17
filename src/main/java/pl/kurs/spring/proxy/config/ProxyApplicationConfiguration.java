package pl.kurs.spring.proxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "pl.kurs.spring.proxy")
@EnableAspectJAutoProxy
public class ProxyApplicationConfiguration {

}
