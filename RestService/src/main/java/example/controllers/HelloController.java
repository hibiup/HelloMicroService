package example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class HelloController {
    @Value("${message.location}") private String message;

    @RequestMapping(value="/",
            method =  RequestMethod.GET ,
            consumes = { MediaType.ALL_VALUE },
            produces = {
                    MediaType.ALL_VALUE
    })
    public String index() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(message)));
        return in.readLine();
    }
}
