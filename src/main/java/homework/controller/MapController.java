package homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping("/board")
    public String main(){ return "board";}

    @GetMapping("/board/jpaboard")
    public String jpawrite(){ return "jpaboard";}

    @GetMapping("/board/sqlboard")
    public String sqlwrite(){ return "sqlboard";}
}
