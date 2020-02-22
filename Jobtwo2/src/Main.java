import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int menu;
	    char back=0;
	    do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Jajar Genjang");
            System.out.println("Silahkan pilih menu yang diinginkan= ");
            menu = sc.nextInt();

            if (menu == 1) {
                double p, l, t; //panjang,lebar,tinggi
                System.out.println("Persegi Panjang");
                System.out.println("Masukkan panjang= ");
                p = sc.nextDouble();
                System.out.println("Masukkan lebar= ");
                l = sc.nextDouble();
                System.out.println("Masukkan tinggi= ");
                t = sc.nextDouble();

                System.out.println("\nPersegi Panjang");
                PersegiPanjang pp = new PersegiPanjang(p, l);
                System.out.println("Luas PersegiPanjang= " + pp.luasPersegiPanjang());

                System.out.println("\nBalok");
                Balok b = new Balok(p, l);
                System.out.println("Volume Balok= " + b.vol(t));

                System.out.println("\nLimas Persegi Panjang");
                LimasPersegiPanjang lim = new LimasPersegiPanjang(p, l);
                System.out.println("Volume Limas Persegi Panjang= " + lim.vol(t));
            } else if (menu == 2) {
                double a, h, ht; //alas,tinggi,tinggi3
                System.out.println("Jajar Genjang");
                System.out.println("Masukkan alas= ");
                a = sc.nextDouble();
                System.out.println("Masukkan tinggi= ");
                h = sc.nextDouble();
                System.out.println("Masukkan tinggi3D= ");
                ht = sc.nextDouble();

                System.out.println("\nJajar Genjang");
                JajarGenjang jj = new JajarGenjang(a, h);
                System.out.println("Luas Jajar Genjang= " + jj.luasJajarGenjang());

                System.out.println("\nPrisma Jajar Genjang");
                PrismaJajarGenjang pjg = new PrismaJajarGenjang(a, h);
                System.out.println("Volume Prisma Jajar Genjang= " + pjg.vol(ht));

                System.out.println("\nLimas Jajar Genjang");
                LimasJajarGenjang ljg = new LimasJajarGenjang(a, h);
                System.out.println("Volume Limas Jajar Genjang= " + ljg.vol(ht));
            } else {
                System.out.println("Pilihan tidak ada\n");
            }

            System.out.println("Back to menu?(y/n)");
            back = sc.next().charAt(0);
        }while (back == 'y' || back == 'Y');
    }
}
