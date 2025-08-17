package kr.kosa.hello.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;


@RestController
@RequestMapping("/")
public class HelloController {
    
    @GetMapping
    public Map<String, Object> home() {
        return Map.of("message","Hello World");
        //{"message" : "Hello World"}
    }
    

}
