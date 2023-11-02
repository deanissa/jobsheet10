/**
 * BioskopWithScanner06
 */
import java.util.Scanner;
public class BioskopWithScanner06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String [][] penonton = new String [4][2];
        String nama;
        String next;
        String exit;
        int baris;
        int kolom;

        //Menambah Menu
        do{
            System.out.println ("Pilih Menu");
            System.out.println ("1. Input Data Penonton");
            System.out.println ("2. Tampilkan daftar penonton");
            System.out.println ("3. Exit");
            System.out.print("Pilihan Anda : ");
            int choice = sc.nextInt();
            sc.nextLine();

        //Input Data Penonton
        switch (choice){
            case 1:
            System.out.print("Masukkan nama :");
            nama = sc.nextLine();
            System.out.print("Masukkan baris :");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom :");
            kolom = sc.nextInt();
            sc.nextLine();

            //Baris Tidak Tersedia
            if (baris < 1 ||baris > penonton.length || kolom < 1 || kolom > penonton[0].length ){
            System.out.println ("Nomor baris dan kolom tidak tersedia");
            //Warning Kursi Terisi
            } else if (penonton [baris-1][kolom-1] != null){
            System.out.println ("Kursi sudah terisi, silahkan pilih kursi lain");
            } else {
            penonton [baris-1][kolom-1]= nama;
            }
            System.out.print("Input penonton lainnya? (y/n)");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            } break;

            // Menampilkan daftar penonton
        case 2 :
            for (int i = 0; i < penonton.length; i++) {
                //Jika null akan ditampilkan ***
                for (int j = 0; j < penonton[i].length; i++) {
                    if (penonton[i][j]== null){
                        penonton[i][j]= "****";
                    }
                }
                System.out.println ("Penonton pada baris ke-" + (i+1) + ":"+ String.join(",", penonton[i]));
            }
                break;

                //Exit
            case 3 :
            System.out.print("Ingin keluar? (y/n)");
            exit = sc.nextLine();
            if (exit.equalsIgnoreCase("y")){
                return;
            }
            break;
        }
        }while(true);
    }
    }