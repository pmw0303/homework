package homework.controller;

import homework.dto.BoardDto;
import homework.service.BoardDao;
import homework.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    BoardDao boardDao = new BoardDao();

    @PostMapping("/jpa/board")
    public boolean jpawrite(BoardDto boardDto){
        return boardService.write(boardDto);
    }

    @PostMapping("/sql/board")
    public boolean sqlwrite(BoardDto boardDto){ return boardDao.sqlwrite(boardDto);}
}
