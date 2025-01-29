package fr.efrei.rag.web.rest;

import fr.efrei.rag.repository.dto.SampleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

    @GetMapping("/samples/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value){
        return "Hello " + value + "!";
    }

    @GetMapping("/samples/dto/{value}")
    public SampleDto helloDto(@PathVariable(value = "value", required = false) final String value){
        return new SampleDto("Hello " + value + "!");
    }
}