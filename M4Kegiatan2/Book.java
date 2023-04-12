package M4Kegiatan2;

public class Book {
    private String motif;
    private Paper paper; //Has-a

    public Book(String motif, Paper paper){
        this.motif = motif;
        this.paper = paper;
    }

    public void setMotif(String motif){
        this.motif = motif;
    }

    public String getMotif(){
        return motif;
    }

    public Paper getPaper(){
        return paper;
    }
}
