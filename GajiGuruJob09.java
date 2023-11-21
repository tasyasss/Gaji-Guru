// ada login
// login ada array uname array pass
// login istrue masuk menu
// jam mengajar, status (yg penting)
// menu 1 masukkan semua infirmasi
// menu 2 menhambil isi array (NIP) lalu diproses
// history 1 tahun (12 bulan)
// slip 


import java.util.Scanner;

public class GajiGuruJob09  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double gajiPerJam, gajiPokok, gajiTotal, jamMengajar, jamDinas = 0;
        double tunjanganJabatan = 0, tunjanganGuru1 = 0, tunjanganGuru2 = 0, tunjanganGuru3 = 0, tunjanganDinas;
        String nama, jabatan, tugasDinas, NIP;
        int statusGuru, jenisJabatan, menu;

        gajiPerJam = 40000;

        do{
            System.out.println("----- SELAMAT DATANG DI SISTEM PENGGAJIAN GURU ----- \n");
            System.out.println("1. Menu Data Guru \n2. Menu Gaji Guru \n3. EXIT");
            System.out.print("Silahkan pilih menu yang ingin dibuka (1/2/3): ");
            menu = sc.nextInt();

            if (menu == 1){
                System.out.print("Masukkan NIP anda: ");
                NIP = sc.next();
                System.out.print("Masukkan nama anda: ");
                nama = sc.next();

                System.out.println("Selamat datang " + nama + " NIP " + NIP);
                    System.out.println();
        
            } else if (menu == 2){
                System.out.print("Masukkan jumlah jam mengajar anda: ");
                jamMengajar = sc.nextDouble();
                System.out.print("Apakah anda memiliki jabatan (y/t): ");
                jabatan = sc.next();

                gajiPokok = (gajiPerJam * 96) * (jamMengajar / 96);

                if (jabatan.equals("y")) {
                System.out.println("1. Kepala Sekolah \n2. Wakil Kepala Sekolah \n3. Sekretaris \n4. Bendahara \n5. Kepala Urusan");
                System.out.print("Masukkan Jabatan anda (angka): ");
                jenisJabatan = sc.nextInt();

                    if(jenisJabatan == 1){
                    tunjanganJabatan = 950000;
                    System.out.println("Tunjangan Jabatan anda (Kepala Sekolah): " + tunjanganJabatan);
                    } else if (jenisJabatan == 2){
                    tunjanganJabatan = 800000;
                    System.out.println("Tunjangan Jabatan anda (Wakil Kepala Sekolah): " + tunjanganJabatan);
                    } else if (jenisJabatan == 3){
                    tunjanganJabatan = 650000;
                    System.out.println("Tunjangan Jabatan anda (Sekretaris): " + tunjanganJabatan);
                    } else if (jenisJabatan == 4){
                    tunjanganJabatan = 500000;
                    System.out.println("Tunjangan Jabatan anda (Bendahara): " + tunjanganJabatan);
                    } else if (jenisJabatan == 5){
                    tunjanganJabatan = 500000;
                    System.out.println("Tunjangan Jabatan anda (Kepala Urusan): " + tunjanganJabatan);
                    }
                } else {
                tunjanganJabatan = 0;
                System.out.println("Tunjangan jabatan anda: " + tunjanganJabatan);
                }

                    System.out.println();

                System.out.println("1. Guru part-time \n2. Guru full-time \n3. Guru tetap");
                System.out.print("Masukkan status guru anda (1/2/3): ");
                statusGuru = sc.nextInt();

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

                System.out.print("Apakah anda melakukan tugas dinas (y/t): ");
                tugasDinas = sc.next();


                if(tugasDinas.equals("y")){
                    System.out.print("Masukkan jumlah jam dinas anda: ");
                    jamDinas = sc.nextInt();

                    tunjanganDinas = jamDinas * gajiPerJam * 1.5;

                    System.out.println("Tunjangan dinas anda: " + tunjanganDinas);
                } else {
                    tunjanganDinas = 0;
                    System.out.println("Tunjangan dinas anda: " + tunjanganDinas);
                }

                    System.out.println();

                gajiTotal = gajiPokok + tunjanganJabatan + tunjanganGuru1 + tunjanganGuru2 + tunjanganGuru3 + tunjanganDinas;
                System.out.println("Gaji pokok anda: " + gajiPokok);
                System.out.println("Total gaji anda: " + gajiTotal);

                    System.out.println();

            } 
        } while(menu != 3);

            //System.out.println("\n"+ NIP + " " + nama + " " + jamMengajar + " " + jabatan + " " + statusGuru + " " + tugasDinas + "\n");       

        sc.close();
    }
}
