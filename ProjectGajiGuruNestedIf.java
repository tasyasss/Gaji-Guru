import java.util.Scanner;

public class ProjectGajiGuruNestedIf {
    public static void main(String[] args) {
        // ----- DEKLARASI -----
        Scanner sc = new Scanner(System.in);

        double gajiPerJam, gajiPokok, gajiTotal, jamMengajar;
        double tunjanganJabatan, tunjJabatanTotal = 0, tunjanganGuru1 = 0, tunjanganGuru2 = 0, tunjanganGuru3 = 0, tunjanganDinas;
        String nama, jabatan, tugasDinas, NIP;
        int statusGuru, jenisJabatan = 0;

        // ----- INPUT DATA -----
        System.out.print("Masukkan NIP anda\t: ");
            NIP = sc.nextLine();
        System.out.print("Masukkan nama anda\t: ");
            nama = sc.nextLine();
        System.out.print("Masukkan jumlah jam mengajar anda\t: ");
            jamMengajar = sc.nextInt();
            sc.nextLine();
        System.out.println("");
        System.out.print("Apakah anda memiliki jabatan (y/t)\t: ");
            jabatan = sc.nextLine();
        // System.out.println("Jabatan Anda \n1. Kepala Sekolah \t2. Sekretaris \n3. Bendahara \t\t4. Kepala Kurikulum");
        // System.out.println("5. Kepala Kesiswaan \t6. Kepala Sarpras \n7. Kepala Humas \t8. Kepala Tata Usaha");
        // System.out.print("Masukkan angka\t: ");        
        //     jenisJabatan = sc.nextInt();
        //     sc.nextLine();

        // ----- PROSES PENGHITUNGAN -----
        gajiPerJam = 40000;
        tunjanganJabatan = gajiPerJam * 5;
        gajiPokok = (gajiPerJam * 96) * (jamMengajar / 96);

        // ----- JABATAN ------
        if (jabatan.equalsIgnoreCase("y")) {
            System.out.println("1. Kepala Sekolah \t2. Sekretaris \n3. Bendahara \t\t4. Kepala Kurikulum");
            System.out.println("5. Kepala Kesiswaan \t6. Kepala Sarpras \n7. Kepala Humas \t8. Kepala Tata Usaha");
            System.out.print("Masukkan angka\t: ");        
            jenisJabatan = sc.nextInt();
            sc.nextLine();
            if (jenisJabatan == 1) {
                tunjJabatanTotal = tunjanganJabatan + 750000;
                System.out.println("Jabatan Anda: Kepala Sekolah");
            } else if (jenisJabatan == 2){
                tunjJabatanTotal = tunjanganJabatan + 600000;
                System.out.println("Jabatan Anda: Sekretaris");
            } else if (jenisJabatan == 3){
                tunjJabatanTotal = tunjanganJabatan + 450000;
                System.out.println("Jabatan Anda: Bendahara");
            } else if (jenisJabatan == 4){
                tunjJabatanTotal = tunjanganJabatan + 300000;
                System.out.println("Jabatan Anda: Kepala Kurikulum");
            } else if (jenisJabatan == 5){
                tunjJabatanTotal = tunjanganJabatan + 300000;
                System.out.println("Jabatan Anda: Kepala Kesiswaan");
            } else if (jenisJabatan == 6){
                tunjJabatanTotal = tunjanganJabatan + 300000;
                System.out.println("Jabatan Anda: Kepala Sarpras");
            } else if (jenisJabatan == 7){
                tunjJabatanTotal = tunjanganJabatan + 300000;
                System.out.println("Jabatan Anda: Kepala Humas");
            } else {
                tunjJabatanTotal = tunjanganJabatan + 300000;
                System.out.println("Jabatan Anda: Kepala Tata Usaha");
            }
            System.out.println(tunjanganJabatan + "Tunjangan jabatan anda: " + tunjJabatanTotal);
        }
        else {
            tunjanganJabatan = 0;
            System.out.println("Anda tidak memiliki jabatan");
            System.out.println("Tunjangan jabatan anda: " + tunjanganJabatan);
        }

        // ----- STATUS GURU -----
        System.out.println("");
        System.out.println("Status guru Anda");
        System.out.println("1. Guru part-time \n2. Guru full-time \n3. Guru tetap");
        System.out.print("Masukkan angka\t: ");
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
        System.out.print("Apakah anda melakukan tugas dinas (y/t)\t: ");
        tugasDinas = sc.nextLine();

        tunjanganDinas = gajiPerJam * 1.75;

        if(tugasDinas.equalsIgnoreCase("y")){
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
