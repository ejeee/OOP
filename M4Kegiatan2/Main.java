package M4Kegiatan2;

public class Main {
    public static void main(String[] args){
        Paper p = new Paper("Line", "B5", "80 Page");
        Book b = new Book("SpongeBob", p);
        System.out.println("\nBook : " +b.getPaper().getPage());
        System.out.println("\n");
    }
}
