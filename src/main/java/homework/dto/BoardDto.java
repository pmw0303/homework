package homework.dto;

import lombok.*;
import homework.domain.jpa.BoardEntity;


@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {

    private int bnum;
    private String btitle;
    private String bcontent;
    private String bwriter;

    public BoardEntity toentity(){
        BoardEntity boardEntity = BoardEntity.builder()
                .btitle(this.btitle)
                .bcontent(this.bcontent)
                .bwriter(this.bwriter)
                .build();
        return boardEntity;
    }
}
