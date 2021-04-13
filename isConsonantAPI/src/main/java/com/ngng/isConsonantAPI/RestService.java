package com.ngng.isConsonantAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

    @GetMapping("/note")
    public Note greeting(@RequestParam(value = "midi", defaultValue = "60") String midi) {
        System.out.println("badaboom");
        return new Note(Integer.valueOf(midi));
    }
}
