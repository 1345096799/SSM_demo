package com.demo.controller;

/**
 * @PACKAGE_NAME: com.demo.controller
 * @DATE: 2021/11/28
 * @PROJECT_NAME: SSM_demo
 * @AUTHOR: ding.bk
 * @Description:
 **/


import com.demo.entity.Person;
import com.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    @Qualifier("personService")
    private PersonService personService;

    //跳转到save.jsp
    @RequestMapping("/toSave")
    public String toSave() {
        return "save";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(Person person) {
        int result = personService.save(person);
        String message;
        if (result > 0) {
            message = "新增记录成功";
        } else {
            message = "新增记录失败";
        }
        return message;
    }

    @RequestMapping("/queryAll")
    public ModelAndView queryAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("personList");
        modelAndView.addObject("personList", personService.queryAll());
        return modelAndView;
    }
}
