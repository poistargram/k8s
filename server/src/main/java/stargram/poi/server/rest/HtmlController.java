package stargram.poi.server.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/html")
@RestController
@Slf4j
public class HtmlController {

    @GetMapping
    public List<String> html(@RequestBody HtmlRequest request) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(request.getPath()));
        List<String> ret = new ArrayList<>();

        String line;
        while((line = bufferedReader.readLine()) != null){
            ret.add(line);
        }

        return ret;
    }

    @Data
    public static class HtmlRequest{
        String path;
    }
}
