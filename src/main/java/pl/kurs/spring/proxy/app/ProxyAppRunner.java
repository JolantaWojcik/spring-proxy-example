package pl.kurs.spring.proxy.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.kurs.spring.proxy.service.PrinterService;
import pl.kurs.spring.proxy.service.impl.ConsolePrinterSericeImpl;

@Service
public class ProxyAppRunner {
	
	@Autowired
	private PrinterService consolePrinterServiceImpl;
	//private ConsolePrinterSericeImpl consolePrinterServiceImpl;
	//Nie mozemy polegac na implementacji poniewaz nie wiemy czy spring nie nalozyl na impelemntacje jakiegos Proxy
	//poniewaz jesli to zrobil to w kontenerze nie bedzie implemntacji tylko Proxy ktore opakowalo implementacje ale implementuje ten sam interfejs
	
	public void start() {
		System.out.println("Target class: "+consolePrinterServiceImpl.getClass());
		consolePrinterServiceImpl.print("Hello World, I'm in Spring!");
	}
	
	/*
	 * Praca Domowa: 
	 * Stworz Ciag Fibonacciego w springu (spring bean)
	 * Fibonacci <interface> BigInteger fib(int n)
	 * FibonacciImpl (domyslna implemenetacja) bez delegatów - ale reukrencyjna 
	 * Stworz aspect @Around o nazwe CacheAspect (zalozenie: dziala tylko dla fibonacci)
	 * jesli juz taki argument byl no to pobieramy wartosc z cache, jesli nie, dodajemy do cache i pobieramy z cache.
	 * 
	 * drugi aspect w ktorym bedziesz liczyla czas wykonania danej metody: PROBLEM ktory aspect bedzie najpeirw? i jak go rozwiazac (czy sie da?)
	 * 
	 * 
	 */
}
