import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int[] nilai = new int[5];
        int max,min;
        int i;
        float r;

        Scanner val= new Scanner( System.in);
        System.out.println("Nama : ");
        name=val.nextLine();

            for (i = 0; i<5; i++){
                System.out.print("Nilai ke-" + (i+1) + " : ");
                nilai[i] = val.nextInt();
            }

            min = nilai[0];
            max = nilai[0];
            r = 0;
            for (i = 0; i<5; i++){
                if (nilai[i] > max){
                    max = nilai[i];
                }
                else if (nilai[i] < min){
                    min = nilai[i];
                }
                r=r+ nilai[i];
            }
            r/= 5;
            System.out.println("Nama : " + name);
            System.out.println("Nilai Tertinggi : " + max);
            System.out.println("Nilai Terendah : " + min);
            System.out.println("Rata-rata Nilai : " + r);
    }

}
