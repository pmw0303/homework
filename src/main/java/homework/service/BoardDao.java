package homework.service;

import homework.dto.BoardDto;

public class BoardDao extends Dao{

    public BoardDao(){
        super();
    }
    public static BoardDao boardDao = new BoardDao();

    public static BoardDao getBoardDao(){
        return boardDao;
    }

    public boolean sqlwrite(BoardDto boardDto){
        String sql = "insert into board(btitle, bcontent, bwriter) values(?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setString(3, boardDto.getBwriter());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("sqlwrite 오류 " + e);
        }
        return false;
    }
}
