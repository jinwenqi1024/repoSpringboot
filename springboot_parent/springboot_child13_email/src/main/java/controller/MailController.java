package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MailService;

@RestController
public class MailController {

    @Autowired
    private MailService service;

    @RequestMapping("/mail")
    public String first(){
        service.sendSimpleMail("1084850119@qq.com","测试spring boot imail-主题","测试spring boot imail - 内容");
        return "ok";
    }
}
