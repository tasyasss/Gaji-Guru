package project;
import java.util.Scanner;

public class ProjectAkhirAldo {
    static int[][] gajiPokok = new int[6][7];
    static int[][] tunjangan = new int[6][7];
    static int[][] gajiTotal = new int[6][7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputPass, inputStatus;
        int menu = 0, opsiLain, opsiAbsen, employeeCount = 4, inputNIP, loginNIP;

        String[] password = new String[6];
        password[0] = "admin123";
        password[1] = "guru1";
        password[2] = "guru2";
        password[3] = "guru3";

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

        String[] bulan = { " ", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" };
        int[][] absen = new int[6][13];
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


        while (true) {
            System.out.println("============================================================");
            System.out.println("|         Selamat Datang di Sistem Penggajian Guru         |");
            System.out.println("============================================================");
            System.out.println("1. LogIn");
            System.out.println("2. Exit");
            System.out.print("Pilih Opsi: ");
            int opsi = sc.nextInt();
            System.out.println();
            
            if (opsi == 1) {
                System.out.println("============================================================");
                System.out.println("|               Login Sistem Penggajian Guru               |");
                System.out.println("============================================================");
                System.out.print("Username: ");
                loginNIP = sc.nextInt();
                System.out.print("Password: ");
                inputPass = sc.next();
    
                boolean isUsernameValid = false, isPasswordValid = false;
    
                for (int i = 0; i < NIP.length; i++) {
                    if (NIP[i] == loginNIP) {
                        isUsernameValid = true;
                        if (password[i].equals(inputPass)) {
                            isPasswordValid = true;
                            break;
                        }
                    }
                }
    
                if (isUsernameValid && isPasswordValid) {
                    System.out.println("Login berhasil!");
                    System.out.println(" ");
    
                    int key4 = loginNIP;
                    for (int i = 0; i < NIP.length; i++) {
                        if (NIP[i] == key4) {
                            System.out.println("============================================================");
                            System.out.printf("|              %-30s              |%n", "SELAMAT DATANG " + nama[i]);
                            System.out.println("============================================================");
                            System.out.println();
                        }
                    }
                    if (loginNIP == NIP[0]) {
                        do {
                            System.out.printf("                            %-4s                            %n", "MENU");
                            System.out.println("============================================================");
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
                                System.out.printf("                      %-16s                      %n", "KELOLA DATA GURU");
                                System.out.println("============================================================");
                                    do {
                                        System.out.println(" ");
                                        System.out.println("=======================================================");
                                        System.out.printf("| %-10s | %-20s | %-15s |%n", "NIP", "Nama", "Status");
                                        System.out.println("=======================================================");
        
                                        for (int i = 1; i < NIP.length; i++) {
                                            if (NIP[i] != 0 && nama[i] != null && status[i] != null) {
                                                System.out.printf("| %-10s | %-20s | %-15s |%n", NIP[i], nama[i], status[i]);
                                                System.out.println("=======================================================");
                                            }
                                        }
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
                                            System.out.println(" ");
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
                                                System.out.print("Masukkan Password: ");
                                                password[employeeCount] = sc.next();
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
                                    System.out.printf("                     %-18s                     %n", "KELOLA ABSENSI GURU");
                                    System.out.println("============================================================");
                                    do {
                                        System.out.println(" ");
                                        for (int i = 1; i < 2; i++) {
                                            System.out.println("=====================================================================================");
                                            System.out.printf("| %-9s ", "NIP");
                                            System.out.print("|");
                                            for (int j = 1; j < bulan.length; j++) {
                                                System.out.printf(" %-9s |", bulan[j]);
                                            }
                                            System.out.println();
                                            System.out.println("=====================================================================================");
                                        }
                                        for (int i = 1; i < absen.length; i++) {
                                            int nipIndex = i;
                                            if (NIP[i] == 0) {
                                                System.out.printf("| %-9s ", " ");
                                            } else if (NIP[i] != 0) {
                                                System.out.printf("| %-9s ", NIP[nipIndex]);
                                            }
    
                                            System.out.print("|");
    
                                            for (int j = 1; j < absen[i].length; j++) {
                                                if (NIP[j] != 0, absen[i][j] == 0) {
                                                    System.out.printf(" %-9s |", " ");
                                                } else if (bulan[i] != null && absen[i][j] != 0) {
                                                    System.out.printf(" %-9s |", absen[i][j]);
                                                }
                                            }
                                            System.out.println();
                                            System.out.println("=====================================================================================");
                                        }
    
                                        System.out.println(" ");
                                        System.out.println("Pilih Opsi Kelola Absensi");
                                        System.out.println("1. Input Absensi");
                                        System.out.println("2. Kembali ke Menu");
                                        System.out.print("Pilih Opsi: ");
                                        opsiAbsen = sc.nextInt();
                                        System.out.println(" ");
    
                                        if (opsiAbsen == 1) {
                                            System.out.println(" ");
                                            System.out.println("===== INPUT ABSENSI GURU =====");
                                            System.out.println(" ");
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
    
                                case 3:
                                    System.out.printf("                    %-20s                    %n", "INFORMASI GAJI GURU");
                                    System.out.println("============================================================");
                                    System.out.println();
                                    System.out.print("Masukkan NIP: ");
                                    inputNIP = sc.nextInt();
                                    System.out.println();
    
                                    int key2 = inputNIP;
                                    for (int i = 0; i < NIP.length; i++) {
                                        if (NIP[i] == key2) {
    
                                            hitungGajiPokok(absen, status);
                                            hitungTunjangan(gajiPokok, status);
                                            hitungGajiTotal(gajiPokok, tunjangan);
    
                                            for (int j = bulan.length - 1; j >= 0; j--) {
                                                if (nama[i] != null && status[i] != null && bulan[i] != null && gajiPokok[i][j] != 0 && tunjangan[i][j] != 0 && gajiTotal[i][j] != 0) {
                                                    System.out.println("=====================================");
                                                    System.out.printf("|             %-9s             |%n", "Slip Gaji");
                                                    System.out.println("=====================================");
                                                    System.out.printf("| %-10s | %-20s |%n", "Nama", nama[i]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Status", status[i]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Bulan", bulan[j]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Gaji Pokok", "Rp. " + gajiPokok[i][j]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Tunjangan", "Rp. " + tunjangan[i][j]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Gaji Total", "Rp. " + gajiTotal[i][j]);
                                                    System.out.println("=====================================");
                                                    System.out.println();
                                                    break;
                                                }   
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.printf("                       %-14s                       %n", "PELAPORAN GAJI");
                                    System.out.println("============================================================");
                                    System.out.println(" ");
    
                                    System.out.print("Masukkan Bulan: ");
                                    String inputBulan = sc.next();
    
                                    String key1 = inputBulan;
                                    for (int i = 1; i < bulan.length; i++) {
                                        if (bulan[i].equalsIgnoreCase(key1)) {
    
                                            hitungGajiPokok(absen, status);
                                            hitungTunjangan(gajiPokok, status);
                                            hitungGajiTotal(gajiPokok, tunjangan);
    
                                            System.out.println(" ");
                                            System.out.println("============================================");
                                            System.out.printf("| %-9s | %-15s | %-10s |%n", "NIP", "Nama", "Gaji Total");
                                            System.out.println("============================================");
    
                                            for (int j = 0; j < gajiTotal.length; j++) {
                                                if (gajiTotal[j][i] != 0 && NIP[j] != 0) {
                                                    System.out.printf("| %-9s | %-15s | %-10s |%n", NIP[j], nama[j], gajiTotal[j][i]);
                                                    System.out.println("============================================");
                                                }                                              
                                            }
                                            System.out.println(" ");
                                        }
                                    }
                                    
                                    break;
                                case 5: 
                                    System.out.printf("                          %-8s                          %n", "HISTORI");
                                    System.out.println("============================================================");
                                    System.out.print("Masukkan NIP: ");
                                    inputNIP = sc.nextInt();
    
                                    int key3 = inputNIP;
                                    for (int i = 0; i < NIP.length; i++) {
                                        if (NIP[i] == key3) {
    
                                            hitungGajiPokok(absen, status);
                                            hitungTunjangan(gajiPokok, status);
                                            hitungGajiTotal(gajiPokok, tunjangan);
    
                                            System.out.println();
                                            System.out.println("Nama: " + nama[i]);
                                            System.out.println("===========================================================");
                                            System.out.printf("| %-10s | %-12s | %-12s | %-12s |%n", "Bulan", "Gaji Pokok", "Tunjangan", "Gaji Total");
                                            System.out.println("===========================================================");
                                            // LOOPING MENAMPILKAN DATA PER BARIS
                                            for (int j = 1; j < bulan.length; j++) {
                                                if (nama[i] != null && status[i] != null && bulan[i] != null && gajiPokok[i][j] != 0 && tunjangan[i][j] != 0 && gajiTotal[i][j] != 0) {
                                                    System.out.printf("| %-10s | %-12s | %-12s | %-12s |%n", bulan[j], gajiPokok[i][j], tunjangan[i][j], gajiTotal[i][j]);
                                                    System.out.println("===========================================================");
                                                }   
                                            }
                                            System.out.println();
                                        }
                                    }
                                    break;
                            }
                        } while (menu != 6);
                    } else { // menu guru
                        do {
                            System.out.printf("                            %-4s                            %n", "MENU");
                            System.out.println("============================================================");
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
                                        // AMBIL INDEKS NIP
                                        if (NIP[i] == loginNIP) {
                                    System.out.printf("                    %-20s                    %n", "INFORMASI DATA GURU");
                                    System.out.println("============================================================");
                                            System.out.println();
                                            System.out.println("=====================================");
                                            System.out.printf("| %-10s | %-20s |%n", "NIP", NIP[i]);
                                            System.out.printf("| %-10s | %-20s |%n", "Nama", nama[i]);
                                            System.out.printf("| %-10s | %-20s |%n", "Status", status[i]);
                                            System.out.println("=====================================");
                                            System.out.println();
                                        }
                                    }
                                    break;
                                case 2: //Informasi Gaji Guru
                                    System.out.printf("                    %-20s                    %n", "INFORMASI GAJI GURU");
                                    System.out.println("============================================================");
                                    System.out.println();
                                    
                                    for(int i = 1; i < NIP.length; i++){
                                        // AMBIL INDEKS NIP
                                        if (NIP[i] == loginNIP) {
    
                                            hitungGajiPokok(absen, status);
                                            hitungTunjangan(gajiPokok, status);
                                            hitungGajiTotal(gajiPokok, tunjangan);
    
                                            // LOOPING MENAMPILKAN DATA (DECREMENT)
                                            for (int j = bulan.length - 1; j >= 0; j--) {
                                                if (nama[i] != null && status[i] != null && bulan[i] != null && gajiPokok[i][j] != 0 && tunjangan[i][j] != 0 && gajiTotal[i][j] != 0) {
                                                    System.out.println("=====================================");
                                                    System.out.printf("|             %-9s             |%n", "Slip Gaji");
                                                    System.out.println("=====================================");
                                                    System.out.printf("| %-10s | %-20s |%n", "Nama", nama[i]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Status", status[i]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Bulan", bulan[j]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Gaji Pokok", "Rp. " + gajiPokok[i][j]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Tunjangan", "Rp. " + tunjangan[i][j]);
                                                    System.out.printf("| %-10s | %-20s |%n", "Gaji Total", "Rp. " + gajiTotal[i][j]);
                                                    System.out.println("=====================================");
                                                    System.out.println();
                                                    break;
                                                }   
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.printf("                          %-8s                          %n", "HISTORI");
                                    System.out.println("============================================================");
                                    // BARIS JUDUL KOLOM
                                    System.out.println("===========================================================");
                                    System.out.printf("| %-10s | %-12s | %-12s | %-12s |%n", "Bulan", "Gaji Pokok", "Tunjangan", "Gaji Total");
                                    System.out.println("===========================================================");
    
                                    for (int i = 1; i < NIP.length; i++) {
                                        // AMBIL INDEKS NIP
                                        if (NIP[i] == loginNIP) {
    
                                            hitungGajiPokok(absen, status);
                                            hitungTunjangan(gajiPokok, status);
                                            hitungGajiTotal(gajiPokok, tunjangan);
    
                                            // LOOPING MENAMPILKAN DATA PER BARIS
                                            for (int j = 1; j < bulan.length; j++) {
                                                if (nama[i] != null && status[i] != null && bulan[i] != null && gajiPokok[i][j] != 0 && tunjangan[i][j] != 0 && gajiTotal[i][j] != 0) {
                                                    System.out.printf("| %-10s | %-12s | %-12s | %-12s |%n", bulan[j], gajiPokok[i][j], tunjangan[i][j], gajiTotal[i][j]);
                                                    System.out.println("===========================================================");
                                                    
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
                } 
            } else {
                break;
            }
        }
        sc.close();
    }
    public static void hitungGajiPokok(int[][] absen, String[] status) {
        for (int k = 1; k < absen.length; k++) {
            for (int l = 1; l < absen[k].length; l++) {
                int perJam;
                if(status[k] == "Guru Part-Time"){
                    perJam = 15000;
                    gajiPokok[k][l] = absen[k][l] * perJam;
                } else if(status[k] == "Guru Kontrak"){
                    perJam = 20000;
                    gajiPokok[k][l] = absen[k][l] * perJam;
                } else {
                    perJam = 25000;
                    gajiPokok[k][l] = absen[k][l] * perJam;
                }
            }
        }
    }
    public static void hitungTunjangan(int[][] gajiPokok, String[] status) {
        for (int j = 1; j < gajiPokok.length; j++) {
            for (int k = 1; k < gajiPokok[j].length; k++) {
                if(status[j] == "Guru Part-Time"){
                    tunjangan[j][k] = gajiPokok[j][k] * 1;
                } else if(status[j] == "Guru Kontrak"){
                    tunjangan[j][k] = (int)(gajiPokok[j][k] * 1.25);
                } else {
                    tunjangan[j][k] = (int)(gajiPokok[j][k] * 1.5);
                }
            }
        }
        
    }
    public static void hitungGajiTotal(int[][] gajiPokok, int[][] tunjangan) {
        for (int l = 1; l < gajiTotal.length; l++) {
            for (int m = 1; m < gajiTotal[l].length; m++) {
                gajiTotal[l][m] = gajiPokok[l][m] + tunjangan[l][m];
            }
        }
    }
}