package com.example.demo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor

@RestController
//controller
public class NCGController {
	@Autowired
	private  INCG incg;
	
//controller NCG
	@GetMapping("/getNCGGR")
	public List<NCG> listNCG() {
		List<NCG> listNCG = incg.findAll();
		for (NCG ncg : listNCG) {
			
		}
		Stream<NCG> streamNCG = listNCG.stream();
	
		streamNCG.forEach(System.out::print);
		
		return listNCG;
	}
	
	@GetMapping("/ncg/{ncgid}")
	public NCG getNCG(@PathVariable String ncgid ){

		
		NCG ncg = incg.findById(ncgid).orElse(null);
		return ncg;
		
	}

	@GetMapping("/ncg/getByNcgs/{ncgs}")
	public List<NCG> listNCG(@PathVariable List ncgs) {
		List<NCG> listNCG = null;
		try {
			listNCG = incg.findByNcgs(ncgs);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return listNCG;
	}
}
