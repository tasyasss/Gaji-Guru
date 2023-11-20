package project;
import java.util.Scanner;

public class ProjectAkhirAldo_menu3 {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String inputPass, inputStatus;
        int menu = 0, opsiLain, opsiAbsen, employeeCount = 4, inputNIP, loginNIP;

        String[] passwordArray = { "admin123", "guru1", "guru2", "guru3" };

        int[] NIP = new int[6];
        NIP[0] = 123123; // admin
        NIP[1] = 1234501;
        NIP[2] = 1234502;
        NIP[3] = 1234503;

        String[] nama = new String[6];
        nama[0] = "Admin"; // admin
        nama[1] = "Agita Putri";
        nama[2] = "Aldo Khrisna W.";
        nama[3] = "An Naastasya";

        String[] status = new String[6];
        status[0] = "Admin"; // admin
        status[1] = "Guru Part-Time";
        status[2] = "Guru Kontrak";
        status[3] = "Guru Tetap";

        String[] bulan = { " ", "Januari", "Februari", "Maret", "April", "Mei", "Juni" };
        int[][] absen = new int[6][7];
        absen[1][1] = 96;
        absen[1][2] = 95;
        absen[1][3] = 94;
        absen[1][4] = 93;

        absen[2][1] = 96;
        absen[2][2] = 96;
        absen[2][3] = 95;
        absen[2][4] = 96;

        absen[3][1] = 96;
        absen[3][2] = 96;
        absen[3][3] = 96;
        absen[3][4] = 96;

        int[][] gajiPokok = new int[6][7];
        int[][] tunjangan = new int[6][7];
        int[][] gajiTotal = new int[6][7];

        while (true) {

            System.out.println("------ Login Sistem Penggajian Guru ------");
            System.out.print("Username: ");
            loginNIP = sc.nextInt();
            System.out.print("Password: ");
            inputPass = sc.next();

            boolean isUsernameValid = false, isPasswordValid = false;

            for (int i = 0; i < NIP.length; i++) {
                if (NIP[i] == loginNIP) {
                    isUsernameValid = true;
                    if (passwordArray[i].equals(inputPass)) {
                        isPasswordValid = true;
                        break;
                    }
                }
            }

            if (isUsernameValid && isPasswordValid) {
                System.out.println("Login berhasil!");
                System.out.println(" ");
                if (loginNIP == NIP[0]) {
                    do {
                        System.out.println("===== SELAMAT DATANG DI MENU =====");
                        System.out.println("1. Kelola Data Guru");
                        System.out.println("2. Kelola Absen Guru");
                        System.out.println("3. Informasi Gaji Guru");
                        System.out.println("4. Pelaporan Gaji");
                        System.out.println("5. Histori");
                        System.out.println("6. LOG OUT");
                        System.out.print("Silahkan pilih menu yang ingin dibuka: ");
                        menu = sc.nextInt();
                        System.out.println(" ");

                        switch (menu) {
                            case 1:
                                System.out.println("===== KELOLA DATA GURU =====");
                                System.out.println(" ");
                                System.out.println("-------------------------------------------------------");
                                System.out.printf("| %-10s | %-20s | %-15s |%n", "NIP", "Nama", "Status");
                                System.out.println("-------------------------------------------------------");

                                for (int i = 1; i < NIP.length; i++) {
                                    if (NIP[i] != 0 && nama[i] != null && status[i] != null) {
                                        System.out.printf("| %-10s | %-20s | %-15s |%n", NIP[i], nama[i], status[i]);
                                        System.out.println("-------------------------------------------------------");
                                    }
                                }
                                do {
                                    System.out.println(" ");
                                    System.out.println("Pilih Opsi Kelola Data");
                                    System.out.println("1. Input Data Guru");
                                    System.out.println("2. Update Status Guru");
                                    System.out.println("3. Kembali ke Menu");
                                    System.out.print("Pilih opsi: ");
                                    opsiLain = sc.nextInt();
                                    System.out.println(" ");
                                    if (opsiLain == 1) {
                                        System.out.println("===== INPUT DATA GURU =====");
                                        if (employeeCount < NIP.length) {
                                            System.out.print("Masukkan NIP: ");
                                            NIP[employeeCount] = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Masukkan Nama: ");
                                            nama[employeeCount] = sc.nextLine();
                                            System.out.println("Guru Part-Time");
                                            System.out.println("Guru Kontrak");
                                            System.out.println("Guru Tetap");
                                            System.out.print("Masukkan Status: ");
                                            status[employeeCount] = sc.nextLine();
                                            employeeCount++;
                                        }
                                    } else if (opsiLain == 2) {
                                        System.out.println("===== UPDATE STATUS GURU =====");
                                        System.out.print("Masukkan NIP: ");
                                        inputNIP = sc.nextInt();
                                        sc.nextLine();

                                        // scanner mencari data NIP dan looping
                                        int key = inputNIP;
                                        for (int i = 0; i < NIP.length; i++) {
                                            if (NIP[i] == key) {
                                                System.out.print("Masukkan Status: ");
                                                inputStatus = sc.nextLine();
                                                status[i] = inputStatus;
                                            }
                                        }
                                    }
                                } while (opsiLain != 3);
                                break;

                            case 2:
                                System.out.println("===== KELOLA ABSEN GURU =====");
                                do {
                                    System.out.println(" ");
                                    // --- PERULANGAN JUDUL KOLOM ---
                                    for (int i = 1; i < 2; i++) {
                                        for (int j = 1; j <= absen[0].length; j++) {
                                            System.out.print("------------");
                                        }
                                        System.out.println();
                                        System.out.printf("| %-9s ", "NIP");
                                        System.out.print("|");
                                        for (int j = 1; j < bulan.length; j++) {
                                            System.out.printf(" %-9s |", bulan[j]);
                                        }
                                        System.out.println();
                                        for (int j = 1; j <= absen[0].length; j++) {
                                            System.out.print("------------");
                                        }
                                        System.out.println();
                                    }
                                    // --- PERULANGAN ISI KOLOM ---
                                    // PERULANGAN NIP BARIS KEBAWAH
                                    for (int i = 1; i < absen.length; i++) {
                                        int nipIndex = i;
                                        if (NIP[i] == 0) {
                                            System.out.printf("| %-9s ", " ");
                                        } else if (NIP[i] != 0) {
                                            System.out.printf("| %-9s ", NIP[nipIndex]);
                                        }

                                        System.out.print("|");
                                        // PERULANGAN ABSENSI 
                                        for (int j = 1; j < absen[i].length; j++) {
                                            if (absen[i][j] == 0) {
                                                System.out.printf(" %-9s |", " ");
                                            } else if (bulan[i] != null && absen[i][j] != 0) {
                                                System.out.printf(" %-9s |", absen[i][j]);
                                            }
                                        }
                                        System.out.println();
                                    }

                                    System.out.println(" ");
                                    System.out.println("Pilih Opsi Kelola Absensi");
                                    System.out.println("1. Input Absensi");
                                    System.out.println("2. Kembali ke Menu");
                                    System.out.print("Pilih Opsi: ");
                                    opsiAbsen = sc.nextInt();
                                    System.out.println(" ");

                                    if (opsiAbsen == 1) {
                                        System.out.println("Input Absensi Guru");
                                        System.out.print("Masukkan NIP: ");
                                        inputNIP = sc.nextInt();
                                        sc.nextLine();

                                        int key = inputNIP;
                                        for (int i = 1; i < NIP.length; i++) {
                                            if (NIP[i] == key) {
                                                int absenCount = 5;
                                                while (absen[i][absenCount] != 0 && absenCount < absen[i].length) {
                                                    absenCount++;
                                                }
                                                if (absenCount < absen[i].length) {
                                                    System.out.print("Masukkan Absensi: ");
                                                    int inputAbsen = sc.nextInt();
                                                    absen[i][absenCount] = inputAbsen;
                                                    System.out.println(
                                                            "Absensi berhasil diinput pada bulan " + bulan[absenCount]);
                                                }
                                            }
                                        }
                                    }
                                } while (opsiAbsen != 2);
                                break;
                            case 3: // INFORMASI GAJI GURU PER INDIVIDU
                                System.out.println("===== INFORMASI GAJI GURU =====");
                                System.out.print("Masukkan NIP: ");
                                inputNIP = sc.nextInt();
                                    sc.nextLine();
                                
                                int key = inputNIP;
                                for(int i = 1; i < NIP.length; i++){
                                    if (NIP[i] == key) {
                                        
                                        // NYARI ABSEN TERAKHIR
                                        int panjangAbsen1D = absen.length;
                                        int panjangAbsen2D = absen[i].length;
                                        int absenTerakhir = 0;
                                        // for (int j = 0; j < panjangAbsen2D; j++) {
                                        //     if (absen[i][j] != 0) {
                                        //         absenTerakhir = absen[i][j];
                                        //     }
                                        // }
                                        
                                        for (int j = panjangAbsen2D - 1; j >= 0; j--) {
                                            if (absen[i][j] != 0) {
                                                absenTerakhir = absen [i][j];
                                                break;
                                            }
                                        }
                                        

                                        // // CEK OUTPUT ABSEN SEMENTARA
                                        // System.out.println("Angka terakhir: " + absenTerakhir);

                                        // BULAN
                                        int cariAbsen = absenTerakhir;
                                        int indeksAbsen1D = -1;
                                        int indeksAbsen2D = -1;
                                        // for (int k = 0; k < panjangAbsen1D; k++) {
                                        for (int k = panjangAbsen1D - 1; k >= 0; k--) {
                                            // for (int l = 0; l < panjangAbsen2D; l++) {
                                            for (int l = panjangAbsen2D - 1; l >= 0; l--) {
                                                if (absen[k][l] == cariAbsen) {
                                                    indeksAbsen1D = k;
                                                    indeksAbsen2D = l;
                                                    break;
                                                }
                                            }
                                        }
                                        // indeksAbsen2D itu indeks absensi terakhir
                                        bulan[i] = bulan[indeksAbsen2D];
                                        // System.out.println("Bulan: " + bulan[i]);

                                        // // CEK OUTPUT INDEKS BULAN SEMENTARA
                                        // if (indeksAbsen1D != -1 && indeksAbsen2D != -1) {
                                        //     System.out.println(cariAbsen + " ada di 2D indeks " + indeksAbsen2D);
                                        // }
                                        
                                        //GAJI POKOK
                                        int perJam = 25000;
                                        for (int k = 1; k < panjangAbsen2D; k++) {
                                            gajiPokok[i][k] = absen[i][k] * perJam;
                                        }
                                        // System.out.println("Gaji Pokok: " + gajiPokok[i][indeksAbsen2D]);

                                        //TUNJANGAN
                                        for (int j = 1; j < panjangAbsen2D; j++) {
                                            if(status[i] == "guru part-time"){
                                                tunjangan[i][j] = gajiPokok[i][j] * 1;
                                            } else if(status[i] == "guru kontrak"){
                                                tunjangan[i][j] = (int)(gajiPokok[i][j] * 1.25);
                                            } else {
                                                tunjangan[i][j] = (int)(gajiPokok[i][j] * 1.5);
                                            }
                                        }
                                        // System.out.println("Tunjangan : " + tunjangan[i][indeksAbsen2D]);

                                        //GAJI TOTAL
                                        for (int k = 1; k < panjangAbsen2D; k++) {
                                            gajiTotal[i][k] = gajiPokok[i][k] + tunjangan[i][k];
                                        }
                                        // System.out.println("Gaji Total: " + gajiTotal[i][indeksAbsen2D]);

                                        //KOLOM
                                        System.out.println("-------------------------------------");
                                        System.out.printf("| %-10s | %-20s |%n", "Nama", nama[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Status", status[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Bulan", bulan[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Gaji Pokok", "Rp. " + gajiPokok[i][indeksAbsen2D]);
                                        System.out.printf("| %-10s | %-20s |%n", "Tunjangan", "Rp. " + tunjangan[i][indeksAbsen2D]);
                                        System.out.printf("| %-10s | %-20s |%n", "Gaji Total", "Rp. " + gajiTotal[i][indeksAbsen2D]);
                                        System.out.println("-------------------------------------");
                                        System.out.println();
                                    }
                                }
                                break;
                            case 4: // PELAPORAN GAJI PER BULAN
                                System.out.println("===== PELAPORAN GAJI BULAN INI =====");
                                System.out.print("Masukkan Bulan: ");
                                String inputBulan = sc.next();

                                String key1 = inputBulan;
                                for (int i = 1; i < bulan.length; i++) {
                                    if (bulan[i].equalsIgnoreCase(key1)) {
                                        int perJam = 25000;
                                        for (int k = 1; k < absen.length; k++) {
                                            for (int l = 1; l < absen[k].length; l++) {
                                                gajiPokok[k][l] = absen[k][l] * perJam;
                                            }
                                        }
                                        for (int j = 1; j < gajiPokok.length; j++) {
                                            for (int k = 0; k < gajiPokok[j].length; k++) {
                                                if(status[j] == "Guru Part-Time"){
                                                    tunjangan[j][k] = gajiPokok[j][k] * 1;
                                                } else if(status[j] == "Guru Kontrak"){
                                                    tunjangan[j][k] = (int)(gajiPokok[j][k] * 1.25);
                                                } else {
                                                    tunjangan[j][k] = (int)(gajiPokok[j][k] * 1.5);
                                                }
                                            }
                                        }
                                        for (int l = 1; l < gajiTotal.length; l++) {
                                            for (int m = 1; m < gajiTotal[l].length; m++) {
                                                gajiTotal[l][m] = gajiPokok[l][m] + tunjangan[l][m];
                                            }
                                        }
                                        System.out.println(" ");
                                        System.out.println("--------------------------------------------");
                                        System.out.printf("| %-9s | %-15s | %-10s |%n", "NIP", "Nama", "Gaji Total");
                                        System.out.println("--------------------------------------------");

                                        for (int j = 0; j < gajiTotal.length; j++) {
                                            if (gajiTotal[j][i] != 0 && NIP[j] != 0) {
                                                System.out.printf("| %-9s | %-15s | %-10s | %n", NIP[j], nama[j], gajiTotal[j][i]);
                                                System.out.println("--------------------------------------------");
                                            }                                              
                                        }
                                        System.out.println(" ");
                                    }
                                }
                                break;
                            case 5: // HISTORI
                                break;
                        }
                    } while (menu != 6);
                } else { // menu guru
                    do {
                        System.out.println("===== SELAMAT DATANG DI MENU =====");
                        System.out.println("1. Informasi Data Guru");
                        System.out.println("2. Informasi Gaji Guru");
                        System.out.println("3. Histori");
                        System.out.println("4. LOG OUT");
                        System.out.print("Silahkan pilih menu yang ingin dibuka: ");
                        menu = sc.nextInt();
                        System.out.println(" ");
                        switch (menu) {
                            case 1: //Informasi Data Guru
                                for(int i = 1; i < NIP.length; i++){
                                    if (NIP[i] == loginNIP) {
                                        System.out.println("===== INFORMASI DATA GURU =====");
                                        System.out.println();
                                        System.out.println("-------------------------------------");
                                        System.out.printf("| %-10s | %-20s |%n", "NIP", NIP[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Nama", nama[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Status", status[i]);
                                        System.out.println("-------------------------------------");
                                        System.out.println();
                                    }
                                }
                                break;
                            case 2: //Informasi Gaji Guru
                                System.out.println("===== INFORMASI GAJI GURU =====");
                                System.out.println();
                                
                                for(int i = 1; i < NIP.length; i++){
                                    if (NIP[i] == loginNIP) {
                                        // NYARI ABSEN TERAKHIR
                                        int panjangAbsen1D = absen.length;
                                        int panjangAbsen2D = absen[i].length;
                                        int absenTerakhir = 0;
                                        for (int j = panjangAbsen2D - 1; j >= 0; j--) {
                                            if (absen[i][j] != 0) {
                                                absenTerakhir = absen [i][j];
                                                break;
                                            }
                                        }
                                        // System.out.println("Absensi terakhir: " + absenTerakhir);

                                        // BULAN
                                        int cariAbsen = absenTerakhir;
                                        int indeksAbsen1D = -1;
                                        int indeksAbsen2D = -1;
                                        // for (int k = 0; k < panjangAbsen1D; k++) {
                                        for (int k = panjangAbsen1D - 1; k >= 0; k--) {
                                            // for (int l = 0; l < panjangAbsen2D; l++) {
                                            for (int l = panjangAbsen2D - 1; l >= 0; l--) {
                                                if (absen[k][l] == cariAbsen) {
                                                    indeksAbsen1D = k;
                                                    indeksAbsen2D = l;
                                                    break;
                                                }
                                            }
                                        }
                                        // indeksAbsen2D itu indeks absensi terakhir
                                        bulan[i] = bulan[indeksAbsen2D];
                                        // System.out.println("Bulan: " + bulan[i]);
                                        
                                        //GAJI POKOK
                                        int perJam = 25000;
                                        for (int k = 1; k < panjangAbsen2D; k++) {
                                            gajiPokok[i][k] = absen[i][k] * perJam;
                                        }
                                        // System.out.println("Gaji Pokok: " + gajiPokok[i][indeksAbsen2D]);

                                        //TUNJANGAN
                                        for (int j = 1; j < panjangAbsen2D; j++) {
                                            if(status[i] == "guru part-time"){
                                                tunjangan[i][j] = gajiPokok[i][j] * 1;
                                            } else if(status[i] == "guru kontrak"){
                                                tunjangan[i][j] = (int)(gajiPokok[i][j] * 1.25);
                                            } else {
                                                tunjangan[i][j] = (int)(gajiPokok[i][j] * 1.5);
                                            }
                                        }
                                        // System.out.println("Tunjangan : " + tunjangan[i][indeksAbsen2D]);

                                        //GAJI TOTAL
                                        for (int k = 1; k < panjangAbsen2D; k++) {
                                            gajiTotal[i][k] = gajiPokok[i][k] + tunjangan[i][k];
                                        }
                                        // System.out.println("Gaji Total: " + gajiTotal[i][indeksAbsen2D]);

                                        //KOLOM
                                        System.out.println("-------------------------------------");
                                        System.out.printf("| %-10s | %-20s |%n", "Nama", nama[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Status", status[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Bulan", bulan[i]);
                                        System.out.printf("| %-10s | %-20s |%n", "Gaji Pokok", "Rp. " + gajiPokok[i][indeksAbsen2D]);
                                        System.out.printf("| %-10s | %-20s |%n", "Tunjangan", "Rp. " + tunjangan[i][indeksAbsen2D]);
                                        System.out.printf("| %-10s | %-20s |%n", "Gaji Total", "Rp. " + gajiTotal[i][indeksAbsen2D]);
                                        System.out.println("-------------------------------------");
                                        System.out.println();
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("===== HISTORI =====");
                                System.out.println("-------------------------------------");
                                System.out.printf("| %-10s | %-15s |%n", "Bulan", "Gaji Total");
                                System.out.println("-------------------------------------");

                                for (int i = 1; i < NIP.length; i++) {
                                    if (NIP[i] == loginNIP) {
                                        // NYARI ABSEN TERAKHIR
                                        int panjangAbsen1D = absen.length;
                                        int panjangAbsen2D = absen[i].length;
                                        // int absenTerakhir = 0;
                                        // for (int j = panjangAbsen2D - 1; j >= 0; j--) {
                                        //     if (absen[i][j] != 0) {
                                        //         absenTerakhir = absen [i][j];
                                        //         break;
                                        //     }
                                        // }
                                        // System.out.println("Absensi terakhir: " + absenTerakhir);

                                        // BULAN
                                        // int cariAbsen = absenTerakhir;
                                        // int indeksAbsen1D = -1;
                                        // int indeksAbsen2D = -1;
                                        // // for (int k = 0; k < panjangAbsen1D; k++) {
                                        // for (int k = panjangAbsen1D - 1; k >= 0; k--) {
                                        //     // for (int l = 0; l < panjangAbsen2D; l++) {
                                        //     for (int l = panjangAbsen2D - 1; l >= 0; l--) {
                                        //         if (absen[k][l] == cariAbsen) {
                                        //             indeksAbsen1D = k;
                                        //             indeksAbsen2D = l;
                                        //             break;
                                        //         }
                                        //     }
                                        // }
                                        // indeksAbsen2D itu indeks absensi terakhir
                                        // bulan[i] = bulan[indeksAbsen2D];
                                        // System.out.println("Bulan: " + bulan[i]);
                                        
                                        //GAJI POKOK
                                        int perJam = 25000;
                                        for (int k = 1; k < panjangAbsen2D; k++) {
                                            gajiPokok[i][k] = absen[i][k] * perJam;
                                        }
                                        // System.out.println("Gaji Pokok: " + gajiPokok[i][indeksAbsen2D]);

                                        //TUNJANGAN
                                        for (int j = 1; j < panjangAbsen2D; j++) {
                                            if(status[i] == "guru part-time"){
                                                tunjangan[i][j] = gajiPokok[i][j] * 1;
                                            } else if(status[i] == "guru kontrak"){
                                                tunjangan[i][j] = (int)(gajiPokok[i][j] * 1.25);
                                            } else {
                                                tunjangan[i][j] = (int)(gajiPokok[i][j] * 1.5);
                                            }
                                        }
                                        // System.out.println("Tunjangan : " + tunjangan[i][indeksAbsen2D]);

                                        //GAJI TOTAL
                                        for (int k = 1; k < panjangAbsen2D; k++) {
                                            gajiTotal[i][k] = gajiPokok[i][k] + tunjangan[i][k];
                                        }

                                        System.out.println();
                                        System.out.println("Bulan " + bulan[1] + " gaji total " + gajiTotal[i][1]);
                                        System.out.println("Bulan " + bulan[2] + " gaji total " + gajiTotal[i][2]);
                                        System.out.println("Bulan " + bulan[3] + " gaji total " + gajiTotal[i][3]);
                                        System.out.println("Bulan " + bulan[4] + " gaji total " + gajiTotal[i][4]);
                                        System.out.println();

                                        // INI ERROR GATAU LG INI UDH STUCK
                                        for (int k = 1; k <= gajiTotal.length; k++) {
                                            for (int j = 1 ; j <= bulan.length; j++) {
                                                System.out.println("-------------------------------------");
                                                System.out.printf("| %-10s | %-15s |%n", bulan[j], gajiTotal[j][k]);
                                            }
                                        }
                                        System.out.println();
                                    }
                                }
                                break;
                        }
                    } while (menu != 4);
                }
            } else {
                System.out.println("Username atau Password Anda salah!");
                System.out.println(" ");
                System.out.print("Apakah ingin melanjutkan login? (y/t): ");
                String login = sc.next();
                if (login.equalsIgnoreCase("t")) {
                    break;
                }
            }
        }
        sc.close();
    }
}
