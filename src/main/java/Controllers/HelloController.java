package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/v1/greeting")
    public String greeting(){
        return " hello user , 'welcome to the app' ...";
    }
}
