public class PiesTester {
    public static void main(String[] args) {
        PiesDwa pierwszy = new PiesDwa();
        PiesDwa drugi = new PiesDwa();
        PiesDwa trzeci = new PiesDwa();

        pierwszy.wielkosc = 40;
        drugi.wielkosc = 2;
        trzeci.wielkosc = 8;

        pierwszy.szczekaj();
        drugi.szczekaj();
        trzeci.szczekaj();
    }
}
