package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bcontroller {
	
	@Autowired
	public Bservice service;
	
	@RequestMapping("/")
	public String hello() {
		return "Hello !!!!!!!";
	}
	@PostMapping("/addBtime")
	public Btime addBtime(@RequestBody ColorComb colorcomb ) {
		
		int h1=colorcomb.getH1();
		int h2=colorcomb.getH2();
		int m1=colorcomb.getM1();
		int m2=colorcomb.getM2();
		
		Btime btime=new Btime();
		btime.setHour1(h1);
		btime.setHour2(h2);
		btime.setMin1(m1);
		btime.setMin2(m2);
		btime.setHour(5*h1 + h2);
		btime.setMinute(5*m1 +m2);
		return service.saveBtime(btime);
	}
	
	@GetMapping("/getBtimes")
	public List<Btime> findAllBtimes()
	{
		return service.getBtimes();
	}
	
	

}
