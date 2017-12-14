package example.controllers;

/**
 *
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@RestController
public class HelloController {
    private String message = "D:/MyPrograms/HelloMicroService/README.md";

    @RequestMapping("/")
    public String index() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(message)));
        return in.readLine();
    }
}
