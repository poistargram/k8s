package stargram.poi.server.rest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/read")
@RestController
public class ReaderController {

	@GetMapping
	public String read(@RequestBody Body body) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(body.path));
		String str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}

	@Data
	static class Body{
		String path;
		String value;
	}
}
