public class Cast {
    private String actors;
    private String directors;

    public Cast(String a, String d) {
        actors = a;
        directors = d;
    }

    public void cReport() {
        System.out.println(actors + ", " + directors);
    }
}