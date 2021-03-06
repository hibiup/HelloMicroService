package example.controllers;

/**
 *
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@RestController
public class HelloController {
    @Value("${message.greeting.location}") private String message;

    @RequestMapping("/")
    public String index() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(message)));
        return "Hello " + in.readLine();
    }
}
