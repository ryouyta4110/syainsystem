package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.TourokuRequest;
import com.example.demo.service.TouorkuService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class KoushinController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  private TouorkuService userService;
  
  @RequestMapping(value = "/koushin")
  public String displayAdd(Model model) {
    model.addAttribute("tourokuRequest", new TourokuRequest());
    return "koushin";
  }
  /**
   * ユーザー新規登録
   * @param userRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @PostMapping("/touroku/update")
  public String update(@Validated @ModelAttribute TourokuRequest tourokuRequest, BindingResult result, Model model) {

    if (result.hasErrors()) {
      // 入力チェックエラーの場合
      List<String> errorList = new ArrayList<String>();
      for (ObjectError error : result.getAllErrors()) {
        errorList.add(error.getDefaultMessage());
      }
      model.addAttribute("validationError", errorList);
      return "koushin";
    }
    // ユーザー情報の登録成功
    userService.create(tourokuRequest);
    return "koushinok";
  }

  
}