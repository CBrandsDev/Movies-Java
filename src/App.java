public class App {
    public static void main(String[] args) {
        Cast c1 = new Cast("Joaquin Phoenix", "Todd Phillips");
        Cast c2 = new Cast("vanesa da mata", "Christhoer camargo");
        Cast c3 = new Cast("Elisa Sanchez", "Kid Bengala");
        Awards a1 = new Awards(2, 3);
        Awards a2 = new Awards(45, 2);
        Awards a3 = new Awards(0, 1);
        Movies m1 = new Movies("Joker", 2019, c1, a1);
        Movies m2 = new Movies("Cachoroo", 2024, c2, a2);
        Movies m3 = new Movies("Gloob da luta", 2001, c3, a3);

        m1.oCuDeMarco();
        m2.oCuDeMarco();
        m3.oCuDeMarco();

        // Repository d1 = new Repository();

        // d1.insert(m1);
        // d1.insert(m2);
        // d1.insert(m3);
        // // d1.remove(m2);
        // d1.oCuDeLacerda();
    }
}