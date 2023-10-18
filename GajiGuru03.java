import java.util.Scanner;

public class GajiGuru03 {
    public static void main(String[] args) {
        // ----- DEKLARASI -----
        Scanner sc = new Scanner(System.in);

        double gajiPerJam, gajiPokok, gajiTotal, jamMengajar;
        double tunjanganJabatan = 0, tunjanganGuru1 = 0, tunjanganGuru2 = 0, tunjanganGuru3 = 0, tunjanganDinas;
        String nama, jabatan, tugasDinas, NIP;
        int statusGuru, jenisJabatan;

        // ----- INPUT DATA -----
        System.out.print("Masukkan NIP anda: ");
            NIP = sc.nextLine();
        System.out.print("Masukkan nama anda: ");
            nama = sc.nextLine();
        System.out.print("Masukkan jumlah jam mengajar anda: ");
            jamMengajar = sc.nextDouble();
            sc.nextLine();
        System.out.print("Apakah anda memiliki jabatan (y/t): ");
            jabatan = sc.nextLine();

        // ----- PROSES PENGHITUNGAN -----
        gajiPerJam = 40000;
        gajiPokok = (gajiPerJam * 96) * (jamMengajar / 96);

        // ----- JABATAN ------
        if (jabatan.equals("y")) {
            System.out.println("1. Kepala Sekolah \n2. Wakil Kepala Sekolah \n3. Sekretaris \n4. Bendahara \n5. Kepala Urusan");
            System.out.print("Masukkan Jabatan anda (angka): ");
            jenisJabatan = sc.nextInt();

            if(jenisJabatan == 1){
                tunjanganJabatan = 750000;
                System.out.println("Tunjangan Jabatan anda (Kepala Sekolah): " + tunjanganJabatan);
            } else if (jenisJabatan == 2){
                tunjanganJabatan = 600000;
                System.out.println("Tunjangan Jabatan anda (Wakil Kepala Sekolah): " + tunjanganJabatan);
            } else if (jenisJabatan == 3){
                tunjanganJabatan = 450000;
                System.out.println("Tunjangan Jabatan anda (Sekretaris): " + tunjanganJabatan);
            } else if (jenisJabatan == 4){
                tunjanganJabatan = 300000;
                System.out.println("Tunjangan Jabatan anda (Bendahara): " + tunjanganJabatan);
            } else if (jenisJabatan == 5){
                tunjanganJabatan = 300000;
                System.out.println("Tunjangan Jabatan anda (Kepala Urusan): " + tunjanganJabatan);
            }
        }
        else {
            tunjanganJabatan = 0;
            System.out.println("Tunjangan jabatan anda: " + tunjanganJabatan);
        }

            System.out.println();

        // ----- STATUS GURU -----
        System.out.println("1. Guru part-time \n2. Guru full-time \n3. Guru tetap");
        System.out.print("Masukkan status guru anda (1/2/3): ");
        statusGuru = sc.nextInt();
            sc.nextLine();

        switch (statusGuru) {
            case 1:
                tunjanganGuru1 = gajiPerJam * 2;
                System.out.println("Tunjangan status guru anda (guru part-time): " + tunjanganGuru1);
                break;
            case 2:
                tunjanganGuru2 = gajiPerJam * 3;
                System.out.println("Tunjangan status guru anda (guru full-time): " + tunjanganGuru2);
                break;
            case 3:
                tunjanganGuru3 = gajiPerJam * 4;
                System.out.println("Tunjangan status guru anda (guru tetap): " + tunjanganGuru3);
                break;
        }

            System.out.println();

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

        System.out.println("\n"+ NIP + " " + nama + " " + jamMengajar + " " + jabatan + " " + statusGuru + " " + tugasDinas + "\n");

        // ----- HITUNGAN AKUMULASI -----
       
        gajiTotal = gajiPokok + tunjanganJabatan + tunjanganGuru1 + tunjanganGuru2 + tunjanganGuru3 + tunjanganDinas;

        // ----- PEMANGGILAN GAJI -----
        System.out.println("Gaji pokok anda: " + gajiPokok);
        System.out.println("Total gaji anda: " + gajiTotal);

        sc.close();
    }
}

