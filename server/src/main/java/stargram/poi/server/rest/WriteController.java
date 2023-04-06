package stargram.poi.server.rest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@Slf4j
@RequestMapping("/write")
@RestController

 */
public class WriteController {

	@PostMapping
	public void write(@RequestBody Body body) throws IOException {

		FileWriter fileWriter = new FileWriter(body.path, true);
		fileWriter.write(body.value);
		fileWriter.flush();
		fileWriter.close();

	}

	@Data
	static class Body{
		String path;
		String value;
	}
}
