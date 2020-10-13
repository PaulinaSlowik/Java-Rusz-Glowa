public class Zgadywanka {
    //składowe przechowujące trzy obiekty Gracz
    Gracz p1;
    Gracz p2;
    Gracz p3;

    //utworzenia trzech obiektów Gracz i zapisanie ich w trzech składowych
    public void rozpocznijGre() {
        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();

        //deklaracja zmiennych w których będą przechowywane wytypowane liczby przez poszczególnych graczy
        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;

        //deklaracja zmiennych które będą przechowywać wartości true i false w zależności od odpowiedzi konkretnego gacza
        boolean p1odgadl = false;
        boolean p2odgadl = false;
        boolean p3odgadl = false;

        //wyznaczenie liczby jaką będą musieli odgadnąć gracze
        int liczbaodgadywana = (int) (Math.random() * 10);
        System.out.println("Myślę o liczbie z zakresu od 0 do 9..");

        while (true) {
            System.out.println(("Należy wytypować liczbę: " + liczbaodgadywana));

            //wyowłane metody zgaduj() dla każdego z graczy
            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            //pobranie liczb wytypowanych przez każdego z graczy poprzez odczytanie jej ze skłądowych obiektów graczy (wyników wywołania metody zgaduj())
            typp1 = p1.liczba;
            System.out.println("Gracz pierwszy wytypował liczbę: " + typp1);

            typp2 = p2.liczba;
            System.out.println("Gracz drugi wytypował liczbę: " + typp2);

            typp3 = p3.liczba;
            System.out.println("Gracz trzeci wytypował liczbę: " + typp3);

            //sprawdzenie liczb wytypowanych przez graczyw celu określenia czy odpowiadają one wyznaczonej liczbie
            if (typp1 == liczbaodgadywana) {
                p1odgadl = true;
            }
            if (typp2 == liczbaodgadywana) {
                p2odgadl = true;
            }
            if (typp3 == liczbaodgadywana) {
                p3odgadl = true;
            }
            if (p1odgadl || p2odgadl || p3odgadl) {
                System.out.println("Mamy zwycięzcę!");
                System.out.println("Czy gracz pierwszy wytypował poprawnie?: " + p1odgadl);
                System.out.println("Czy gracz drugi wytypował poprawnie?: " + p2odgadl);
                System.out.println("Czy gracz trzeci wytypował poprawnie?: " + p3odgadl);
                System.out.println("Koniec gry.");
                break; //Gra skończona, zatem wychodzimy z pętli while
            } else {
                System.out.println("Gracze będą musieli spróbować jeszcze raz.");
            }
        }
    }
}
