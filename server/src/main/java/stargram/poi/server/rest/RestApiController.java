package stargram.poi.server.rest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/resource")
@RestController
public class RestApiController {

	@GetMapping
	public void resource(@RequestParam("value") String value){
		log.info("Hello, {}!", value);
	}
}
