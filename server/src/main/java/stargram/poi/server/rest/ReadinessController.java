package stargram.poi.server.rest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/readiness")
@RestController
public class ReadinessController {

	private static boolean FLAG = false;

	@GetMapping
	public String get(){
		if(FLAG){
			return "SUCCESS!";
		}
		throw new RuntimeException();
	}

	@PutMapping
	public void put(@RequestParam String flag){
		FLAG = Boolean.parseBoolean(flag);
	}


}
