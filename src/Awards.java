public class Awards {
    private int oscar;
    private int goldenGlobe;

    public Awards(int o, int g) {
        oscar = o;
        goldenGlobe = g;
    }

    public void aReport() {
        System.out.println(", Awards ");
        System.out.println("Oscars: " + oscar + ", Golden Globes: " + goldenGlobe);
    }

}