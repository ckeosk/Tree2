package com.dimmunity.Tree.controller;


import com.dimmunity.Tree.dto.BoardDTO;
import com.dimmunity.Tree.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board") // /board가 상위 주소인데, 계속 부를테니까 아예 구분하여 선언해놓음
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save2")
    public String saveForm(){
        return "save2";
    }

    //post로 보냈기 때문에 postmapping 사용
    @PostMapping("/save2")
    public String save(@ModelAttribute BoardDTO boardDTO){
        boardService.save(boardDTO); // board save 완료

        return "index";


    }
}
