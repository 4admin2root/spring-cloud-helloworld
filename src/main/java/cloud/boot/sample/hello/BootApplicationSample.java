package cloud.boot.sample.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@SpringBootApplication
public class BootApplicationSample  {

    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello Mac!";
    }

    @ResponseBody
    @RequestMapping(value = "/getIp")
    String getSip(HttpServletRequest request) {
        String remoteaddr = request.getRemoteAddr();
        InetAddress hostaddr = null;
        try {
            hostaddr = Inet4Address.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "The Server ip is: " + hostaddr.getHostAddress() + "<br> The Client ip is: " + remoteaddr;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootApplicationSample.class, args);
    }

}
