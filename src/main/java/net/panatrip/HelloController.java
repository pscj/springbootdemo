package net.panatrip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chengjiang on 2017/4/14.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "welcome";
    }
}
