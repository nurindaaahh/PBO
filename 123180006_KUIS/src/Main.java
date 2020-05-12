import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan=0;
        char back;

        do {
            System.out.println("MENU FORM PENDAFTARAN");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.print("Silahkan pilih menu yang diinginkan : ");
            try {
                pilihan = scanner.nextInt();
                System.out.println("");
                switch(pilihan){
                    case 1:{
                        int NIM, tulis,coding,wawancara,microteaching;
                        int banyak=0;
                        String Nama;

                        System.out.println("FORM PENDAFTARAN ASISTEN LABORATORIUM");
                        System.out.print("Input banyak data : ");
                        banyak = scanner.nextInt();
                        for (int i = 0; i < banyak; i++) {
                            System.out.print("Masukkan NIM : ");
                            NIM = scanner.nextInt();
                            System.out.print("Masukkan Nama : ");
                            scanner.nextLine();
                            Nama = scanner.nextLine();
                            System.out.print("Masukkan Nilai Tulis : ");
                            tulis = scanner.nextInt();
                            System.out.print("Masukkan Nilai Coding : ");
                            coding = scanner.nextInt();
                            System.out.print("Masukkan Nilai Wawancara : ");
                            wawancara = scanner.nextInt();
                            System.out.print("Masukkan Nilai Microteaching : ");
                            microteaching = scanner.nextInt();
                            Aslab LabAsisten = new Aslab(Nama, NIM, tulis, coding, wawancara, microteaching);
                            System.out.println("Nilai Rata-rata : " + LabAsisten.rata);
                            if(LabAsisten.rata > 85){
                                System.out.println("KETERANGAN : LOLOS");
                                System.out.println("Selamat kepada NIM "+LabAsisten.NIM+" Anda telah diterima sebagai Asisten laboratorium");
                            }
                            else{
                                System.out.println("KETERANGAN : TIDAK LOLOS");
                                System.out.println("Mohon maaf kepada NIM "+LabAsisten.NIM+" Anda tidak diterima sebagai Asisten Laboratorium. Coba lagi tahun depan");
                            }
                        }
                        break;
                    }
                    case 2:{
                        int NIM, tulis,coding,wawancara,jaringan;
                        int jumlah=0;
                        String Nama;
                        System.out.println("FORM PENDAFTARAN ADMIN LABORATORIUM");
                        System.out.print("Input  banyak data : ");
                        jumlah = scanner.nextInt();
                        for (int i = 0; i < jumlah; i++) {
                            System.out.print("Masukkan NIM : ");
                            NIM = scanner.nextInt();
                            System.out.print("Masukkan Nama : ");
                            scanner.nextLine();
                            Nama = scanner.nextLine();
                            System.out.print("Masukkan Nilai Tulis : ");
                            tulis = scanner.nextInt();
                            System.out.print("Masukkan Nilai Coding : ");
                            coding = scanner.nextInt();
                            System.out.print("Masukkan Nilai Wawancara : ");
                            wawancara = scanner.nextInt();
                            System.out.print("Masukkan Nilai Tes Jaringan : ");
                            jaringan = scanner.nextInt();
                            Adlab LabAdmin = new Adlab(Nama, NIM, tulis, coding, wawancara, jaringan);
                            System.out.println("Nilai Rata-rata : " + LabAdmin.rata);
                            if(LabAdmin.rata > 85){
                                System.out.println("KETERANGAN : LOLOS");
                                System.out.println("Selamat kepada NIM "+LabAdmin.NIM+" telah diterima sebagai Admin Laboratorium");
                                System.out.println("");
                            }
                            else{
                                System.out.println("KETERANGAN : TIDAK LOLOS");
                                System.out.println("Mohon maaf kepada NIM "+LabAdmin.NIM+" Anda tidak diterima sebagai Admin Laboratorium. Coba lagi tahun depan");
                                System.out.println("");
                            }
                        }
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.err.println("Masukkan inputan berupa angka!");
                scanner.nextLine();
            }
            System.out.print("Back to menu? (y/n) : ");
            back = scanner.next().charAt(0);
            System.out.println("");
        } while (back == 'y' || back == 'Y');

    }

}