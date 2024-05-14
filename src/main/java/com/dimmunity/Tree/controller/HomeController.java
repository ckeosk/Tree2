package com.dimmunity.Tree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본주소 요청이 오면
    @GetMapping("/")
    // 시작 주소를 받아주는 메소드 호출
    public String index(){
        //templates 폴더의 index.html을 찾아가서 index 페이지를 띄우기 위한 코드
        return "index";
    }
}
