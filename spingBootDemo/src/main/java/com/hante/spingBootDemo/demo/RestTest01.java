package com.hante.spingBootDemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
@ResponseBody
public class RestTest01 
{
	@RequestMapping(value="/helloGet",method=RequestMethod.GET)
    public String helloGet() {
        return "helloGet=====";
    }
    
	@RequestMapping(value="/helloPost",method=RequestMethod.POST)
    public String helloPost() {
        return "helloPost=====";
    }
    
	@RequestMapping(value="/helloPut",method=RequestMethod.PUT)
    public String helloPut(String name) {
        return "helloPut=====putname:" + name;
    }
    
	@RequestMapping(value="/helloDelete",method=RequestMethod.DELETE)
    public String helloDelete(String name) {
        return "helloDelete=====deletename" + name;
    }
}
