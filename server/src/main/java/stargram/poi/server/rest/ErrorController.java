package stargram.poi.server.rest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/error")
@RestController
public class ErrorController {

	@GetMapping
	public void resource() {
		if(Counter.count > 3) {
			throw new RuntimeException();
		}
	}

}
