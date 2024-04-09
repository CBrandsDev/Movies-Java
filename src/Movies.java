public class Movies {
    private String title;
    private int year;
    private Cast cast;
    private Awards awards;

    public Movies(String t, int y, Cast c, Awards a) {
        title = t;
        year = y;
        cast = c;
        awards = a;
    }

    public void oCuDeMarco() {
        System.out.println("Title " + title + ", year " + year + ", Cast ");
        cast.oCuDeRobert();
        awards.oCuDeEliel();
        System.out.println(" ");

    }
}