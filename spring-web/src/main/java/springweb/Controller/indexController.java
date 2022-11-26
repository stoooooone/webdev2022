package src.main.java.springweb.Controller;

import src.main.java.springweb.dto.SampleRecordData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")

public class indexController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("sdata", new SampleRecordData(11, "제주대학교 수업 중"));
        return "index";
    }
}
