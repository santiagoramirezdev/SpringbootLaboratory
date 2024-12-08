package hola_mundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo desde Spring Boot!";
    }
}
