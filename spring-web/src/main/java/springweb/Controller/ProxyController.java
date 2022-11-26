package src.main.java.springweb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy")
public class ProxyController {
    public static final String uri = "https://v.daum.net/v/6XoizQmB4I";
    private final Rest Template
    restTemplate;

    public ProxyController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }


    @RequestMapping(value = "/daum", produces = MediaType.APPLICATION_JSON_VALUE)
    public String daum() {
        return restTemplate.getForObject(uri, String.class)
    }

}
