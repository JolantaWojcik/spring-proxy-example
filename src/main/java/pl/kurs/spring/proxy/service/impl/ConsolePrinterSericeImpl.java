package pl.kurs.spring.proxy.service.impl;

import org.springframework.stereotype.Service;

import pl.kurs.spring.proxy.service.PrinterService;

@Service
public class ConsolePrinterSericeImpl implements PrinterService {

	@Override
	public void print(String txt) {
		System.out.println(txt);
	}

}
