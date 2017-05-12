package com.arakitski.google.appengine.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/list")
  @GetMapping
  public String getListUsers(ModelMap modelMap) {
    modelMap.put("message", "messageList");
    return "list";
  }
}
