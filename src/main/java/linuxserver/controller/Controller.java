package linuxserver.controller;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Hello good evening");
    }
}
