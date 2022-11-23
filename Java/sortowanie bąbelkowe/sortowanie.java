import java.util.Scanner;
 
public class sortowanie {

    public static void main(String[] args) {
        int ilosc = 10;
        Scanner in = new Scanner(System.in);
 
        int[] tab = new int[ilosc];
        for(int i=0; i<tab.length; i++){
            System.out.println("Podaj element tablicy:");
            tab[i] = in.nextInt();
        }
        sortowanie(tab);
        szukanieMax(tab);
    }
 
    public static void sortowanie(int tab[]){
    int temp;
    int zmiana = 1;
    while(zmiana > 0){
        zmiana = 0;
        for(int i=0; i<tab.length-1; i++){
            if(tab[i]>tab[i+1]){
                temp = tab[i+1];
                tab[i+1] = tab[i];
                tab[i] = temp;
                zmiana++;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }
    
    private static void szukanieMax(int tab[]){
        int max = tab[0];
        for(int i=0; i<tab.length; i++){
            if(tab[i]>max){
                max = tab[i];
            }
        }
        System.out.println("Największa liczba to: "+ max);
    }
}
