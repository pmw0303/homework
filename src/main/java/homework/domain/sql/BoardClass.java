package homework.domain.sql;

public class BoardClass {

    private int bnum;
    private String btitle;
    private String bcontent;
    private String bwriter;

    public int getBnum() {
        return bnum;
    }

    public String getBtitle() {
        return btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBnum(int bnum) {
        this.bnum = bnum;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

}
