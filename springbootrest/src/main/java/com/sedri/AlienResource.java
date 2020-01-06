package com.sedri;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class AlienResource 
{
	@RequestMapping("alien")			//path
	public List<Alien> getAliens()
	{
		List<Alien> aliens = new ArrayList<>();
		
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("Navin");
		a1.setPoints(70);
		
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setName("Priya");
		a1.setPoints(80);
		
		aliens.add(a1);
		aliens.add(a2);
		
		return aliens;
	}
	
}
