package jobsheet;
import java.util.Scanner;

public class GajiGuruJob05 {
    public static void main(String[] args) {
        // ----- DEKLARASI -----
        Scanner sc = new Scanner(System.in);

        double gajiPerJam, gajiPokok, gajiTotal, jamMengajar;
        double tunjanganJabatan, tunjanganGuru1 = 0, tunjanganGuru2 = 0, tunjanganGuru3 = 0, tunjanganDinas;
        String nama, jabatan, tugasDinas, NIP;
        int statusGuru;

        // ----- INPUT DATA -----
        System.out.print("Masukkan NIP anda: ");
            NIP = sc.nextLine();
        System.out.print("Masukkan nama anda: ");
            nama = sc.nextLine();
        System.out.print("Masukkan jumlah jam mengajar anda: ");
            jamMengajar = sc.nextInt();
            sc.nextLine();
        System.out.print("Apakah anda memiliki jabatan (y/t): ");
            jabatan = sc.nextLine();

        // ----- PROSES PENGHITUNGAN -----
        gajiPerJam = 40000;
        tunjanganJabatan = gajiPerJam * 5;
        gajiPokok = (gajiPerJam * 96) * (jamMengajar / 96);

        // ----- JABATAN ------
        if (jabatan.equals("y")) {
            System.out.println("Tunjangan jabatan anda: " + tunjanganJabatan);
        }
        else {
            tunjanganJabatan = 0;
            System.out.println("Tunjangan jabatan anda: " + tunjanganJabatan);
        }

        // ----- STATUS GURU -----
        System.out.println("1. Guru part-time \n2. Guru full-time \n3. Guru tetap");
        System.out.print("Masukkan status guru anda (1/2/3): ");
        statusGuru = sc.nextInt();
            sc.nextLine();

        switch (statusGuru) {
            case 1:
                tunjanganGuru1 = gajiPerJam * 2;
                System.out.println("Tunjangan status anda: " + tunjanganGuru1);
                break;
            case 2:
                tunjanganGuru2 = gajiPerJam * 3;
                System.out.println("Tunjangan status anda: " + tunjanganGuru2);
                break;
            case 3:
                tunjanganGuru3 = gajiPerJam * 4;
                System.out.println("Tunjangan status anda: " + tunjanganGuru3);
                break;
        }

        // ----- TUGAS DINAS -----
        System.out.print("Apakah anda melakukan tugas dinas (y/t): ");
        tugasDinas = sc.nextLine();

        tunjanganDinas = gajiPerJam * 1.75;

        if(tugasDinas.equals("y")){
            System.out.println("Tunjangan dinas anda: " + tunjanganDinas);
        } else {
            tunjanganDinas = 0;
            System.out.println("Tunjangan dinas anda: " + tunjanganDinas);
        }

        System.out.println("\n"+NIP + " " + nama + " " + jamMengajar + " " + jabatan + " " + statusGuru + " " + tugasDinas + "\n");

        // ----- HITUNGAN AKUMULASI -----
       
        gajiTotal = gajiPokok + tunjanganJabatan + tunjanganGuru1 + tunjanganGuru2 + tunjanganGuru3 + tunjanganDinas;

        // ----- PEMANGGILAN GAJI -----
        System.out.println("Gaji pokok anda: " + gajiPokok);
        System.out.println("Total gaji anda: " + gajiTotal);

        sc.close();
    }
}
