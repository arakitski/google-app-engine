package com.arakitski.google.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by arakitsky on 5/11/17.
 */
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
