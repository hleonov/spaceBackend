package gm.spacebackend.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class AppController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}
