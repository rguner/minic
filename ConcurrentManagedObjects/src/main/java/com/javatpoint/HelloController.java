package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/")
    public String display() {
        String asyncReturn = asyncService.asyncMethod();
        System.out.println("SONUÇ:" + asyncReturn);
        return "index";

    }

    @RequestMapping("/diger")
    public String diger() {
        String asyncReturn = asyncService.asyncMethod();
        System.out.println("SONUÇ:" + asyncReturn);
        return "index";

    }
}
