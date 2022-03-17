package moduloiii.sptringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public String hello() {
        return "Hello Word";
    }

//    @GetMapping("/{name}")
//    public String seuNome(@PathVariable String name) {
//        return "Olá " + name;
//    }

}
