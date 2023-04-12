package M4Kegiatan2;

public class Paper {
    private String paperType;
    private String paperSize;
    private String paperPage;

    public Paper(String paperType, String paperSize, String paperPage){
        this.paperType = paperType;
        this.paperSize = paperSize;
        this.paperPage = paperPage;
    }

    public String getType(){
        return paperType;
    }
    
    public String getSize(){
        return paperSize;
    }

    public String getPage(){
        return paperPage;
    }
}
