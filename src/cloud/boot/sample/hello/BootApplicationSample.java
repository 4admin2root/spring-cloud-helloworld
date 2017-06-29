package cloud.boot.sample.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class BootApplicationSample  {

    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootApplicationSample.class, args);
    }

}