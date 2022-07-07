package homework.service;

import homework.domain.jpa.BoardEntity;
import homework.domain.jpa.BoardRepository;
import homework.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public boolean write(BoardDto boardDto){

        BoardEntity boardEntity = boardDto.toentity();
        boardRepository.save(boardEntity);
        return true;
    }
}
