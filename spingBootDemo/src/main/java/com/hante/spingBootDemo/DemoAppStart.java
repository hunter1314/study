package com.hante.spingBootDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
@Configuration
public class DemoAppStart {//https://www.bilibili.com/video/av14673579/index_12.html#page=6
    
    
    //自定义消息转化器（编码格式）jar里默认是utf-8，这里优先于jar中加载bean
   /* @Bean
    @ConditionalOnMissingBean  //当spring容器中没有这个bean的时候创建,单例
    public StringHttpMessageConverter StringHttpMessageConverter(){
    	return new StringHttpMessageConverter(Charset.forName("utf-8"));
    	//return new StringHttpMessageConverter(Charset.forName("iso-8859-1"));
    }*/
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoAppStart.class, args);
    }
}