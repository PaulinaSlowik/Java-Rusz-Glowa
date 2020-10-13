public class DobryPiesek {
    //składowa powinna być prywatna
    private int wielkosc;

    //metoda zwracająca- powinna być publiczna
    public int getWielkosc(){
        return wielkosc;
    }

    //metoda ustawiająca- powinna być publiczna
    public void setWielkosc(int w){
        wielkosc=w;
    }

    void szczekaj() {
        if (wielkosc > 23) {
            System.out.println("Houu!");
        } else if (wielkosc > 6) {
            System.out.println("Chiau!");
        } else {
            System.out.println("Hiau");
        }
    }
}
