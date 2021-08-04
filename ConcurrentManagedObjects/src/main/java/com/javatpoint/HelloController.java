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
        System.out.println("SONUÇ:" + asyncReturn + " in thread : " + Thread.currentThread().toString() );
        return "index.jsp";

    }

    @RequestMapping("/abc")
    public String abc() {
        System.out.println("abc");
        return "index2.jsp";

    }

    @RequestMapping("/async")
    public String async() {
        String asyncReturn = asyncService.asyncMethod();
        System.out.println("SONUÇ:" + asyncReturn + " in thread : " + Thread.currentThread().toString());
        return "index3.jsp";

    }
}
