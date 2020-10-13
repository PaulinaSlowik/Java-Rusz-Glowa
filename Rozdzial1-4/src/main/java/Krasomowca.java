public class Krasomowca {
    public static void main(String[] args) {
        //trzy grupy słów, które będą wybieane do zadania(dodaj własne!)
        String[] listaSlow1 = {"architektura wielowarstowa", "30000 metrów", "rozwiązanie B-do-B", "aplikacja kliencka", "interfejs internetowy", "inteligentna karta", "rozwiązanie dynamiczne", "sześć sigma", "przenikliwość"};
        String[] listaSlow2 = {"zwiększa możliwości", "poprawia atakcyjność", "pomnażą wartość", "opracowana dla", "bazująca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wyższy poziom", "skierowanej", "udostępniona"};
        String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwiązania", "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"};

        //określenie, ile jest słów w każdej z list
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;

        //generacja trzech losowych słów (lub zwrotów)
        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);

        //stworzenie zdania
        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

        //wyświetlenie zdania
        System.out.println("To jest to, czego nam trzeba: " + zdanie);
        System.out.println(lista1Dlugosc);
    }
}
