public class Main {
    public static void main(String[] args) {

        int  [] Sayilar = new int [50];

        for (int i = 0; i < 50 ; i++) {

            Sayilar[i] = i+1;

        }

        for (int j = 0; j < Sayilar.length; j++) {

            System.out.println("j = " + Sayilar[j]);
        }
    }
}