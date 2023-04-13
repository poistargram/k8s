package stargram.poi.server.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/port")
@RestController
@Slf4j
public class PortController {

    private final ServerProperties serverProperties;

    @GetMapping
    public String port(@RequestParam("value") String value){
        String result = "Hello, "+value+". The Port is "+serverProperties.getPort()+".";
        log.info(result);
        return result;
    }
}
