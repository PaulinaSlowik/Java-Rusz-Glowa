public class TestTablic {
    public static void main(String[] args) {
        int y =0;
        int ref;

        String[] wyspy = new String[4];
        wyspy[0]="Bermudy";
        wyspy[1]="Fiji";
        wyspy[2]="Azory";
        wyspy[3]="Kozumel";
        int[] indeks = new int[4];
        indeks[0]=1;
        indeks[1]=3;
        indeks[2]=0;
        indeks[3]=2;

        while (y<4){
            System.out.print("wyspa = ");
            ref=indeks[y];
            System.out.println(wyspy[ref]);
            y = y + 1;
        }
    }
}
