public class RysowanieProstokata {
    public static void main (String[]args){
        int wysokosc = 5;
        int szerokosc = 10;

        for(int i=0; i<wysokosc; i++){
            for(int j=0; j<szerokosc; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int k=0; k<wysokosc; k++){
            for(int l=0; l<szerokosc; l++){
                if((k==0)||(k==wysokosc-1)){
                    System.out.print("*");
                }else if((l==0)||(l==szerokosc-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int emptyField=5;
        for(int i=emptyField; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("-");}
            for(int k=(emptyField-i)+1; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}