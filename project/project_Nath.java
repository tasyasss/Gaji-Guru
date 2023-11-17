package project;
import java.util.Scanner;

public class project_Nath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputPass, inputStatus;
        int menu = 0, opsiLain, employeeCount = 4, inputNIP, loginNIP;

        // String[] usernameArray = { "admin", "guru" };
        String[] passwordArray = { "admin123", "guru1", "guru2", "guru3" };
        
        int[] NIP = new int[6];
        NIP[0] = 123123; //admin
        NIP[1] = 1234501;
        NIP[2] = 1234502;
        NIP[3] = 1234503;
        
        String[] nama = new String[6];
        nama[0] = "Admin"; //admin
        nama[1] = "Agita Putri";
        nama[2] = "Aldo Khrisna W.";
        nama[3] = "An Naastasya";
        
        String[] status = new String[6];
        status[0] = "Admin"; //admin
        status[1] = "Guru Part-Time";
        status[2] = "Guru Kontrak";
        status[3] = "Guru Tetap";

        String[] bulan = {" ", "januari", "februari"};

        int[] absen = new int[6];
        absen[0] = 0;
        absen[1] = 96;

        int[] gajiPokok = new int[6];
        gajiPokok[0] = 0;

        int[] tunjangan = new int[6];
        tunjangan[0] = 0;

        int[] gajiTotal = new int[6];
        gajiTotal[0] = 0;

        System.out.println("------ Login Sistem Penggajian Guru ------");
        // System.out.print("Username: ");
        // inputUname = sc.nextLine();
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
            if (loginNIP == NIP[0]) {
                do {
                    System.out.println(" ");
                    System.out.println("===== SELAMAT DATANG DI SISTEM =====");
                    System.out.println("1. Kelola Data Guru");
                    System.out.println("2. Kelola Absen Guru");
                    System.out.println("3. Informasi Gaji Guru");
                    System.out.println("4. Pelaporan Gaji");
                    System.out.println("5. Histori");
                    System.out.println("6. Ganti Akun");
                    System.out.println("7. Exit");
                    System.out.print("Silahkan pilih menu yang ingin dibuka: ");
                    menu = sc.nextInt();
    
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
        
                                    //scanner mencari data NIP dan looping
                                    int key = inputNIP;
                                    for(int i = 0; i < NIP.length; i++){
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
                            System.out.println(" ");
                            System.out.println("===== KELOLA ABSEN GURU =====");
                            System.out.println();

                            // System.out.println("--------------------------------");
                            // System.out.printf("| %-10s | %-15s |%n", "NIP", "Absen");
                            // System.out.println("--------------------------------");
                            // for (int i = 1; i <= bulan.length; i++) {
                            //     String keyBulan = "januari";
                            //     if (bulan[i] == keyBulan) {
                            //         for (int j = 1; j < NIP.length; j++) {
                            //             if (NIP[i] != 0 && absen[i] != 0 || absen[i] == 0) {
                            //                 System.out.printf("| %-10s | %-15s |%n", NIP[i], absen[i]);
                            //                 System.out.println("--------------------------------"); 
                            //             }
                            //         }
                            //         break;
                            //     }
                            // }

                            System.out.print("Masukkan NIP: ");
                            inputNIP = sc.nextInt();
                                sc.nextLine();

                            //scanner mencari data NIP dan looping
                            int key = inputNIP;
                            int inputAbsen;
                            for(int i = 1; i < NIP.length; i++){
                                if (NIP[i] == key) {
                                    System.out.print("Masukkan Jam Mengajar: ");
                                    inputAbsen = sc.nextInt();
                                    //scan array indeks absen = indeks nip
                                    do {
                                        absen[i] = inputAbsen;
                                        //HITUNG GAJI POKOK
                                        gajiPokok[i] = absen[i] * 25000;
                                        //HITUNG TUNJANGAN
                                        if (status[i].equalsIgnoreCase("guru part-time")){
                                            tunjangan[i] = gajiPokok[i] * 1;
                                        } else if (status[i].equalsIgnoreCase("guru kontrak")){
                                            tunjangan[i] = (int)(gajiPokok[i] * 1.25);
                                        } else {
                                            tunjangan[i] = (int)(gajiPokok[i] * 1.5);
                                        }
                                        //HITUNG GAJI TOTAL
                                        gajiTotal[i] = gajiPokok[i] + tunjangan[i];
                                    } while (absen[i] == NIP[i]);
                                    System.out.println("cek array: " + absen[i]);    
                                }
                            } 
                            // cek array absen udh keisi belom
                            // ALHAMDULILLAAAAHHHHHHHHHH
                            System.out.println(absen[1] +" " + absen[2]+ " " + absen[3] );
                            System.out.println(gajiPokok[1] +" " + gajiPokok[2]+ " " + gajiPokok[3] );
                            System.out.println(tunjangan[1] +" " + tunjangan[2]+ " " + tunjangan[3] );
                            System.out.println(gajiTotal[1] +" " + gajiTotal[2]+ " " + gajiTotal[3] );

                        break;

                        case 3: // INFORMASI GAJI GURU (individu)
                            System.out.println();
                            System.out.println("===== INFORMASI GAJI GURU =====");
                            System.out.print("Masukkan NIP: ");
                            inputNIP = sc.nextInt();
                                sc.nextLine();

                            //scanner mencari data NIP dan looping
                                int key3 = inputNIP;
                                for(int i = 0; i < NIP.length; i++){
                                    if (NIP[i] == key3) {
                                        System.out.println("NIP   : " + NIP[i]);
                                        System.out.println("Nama  : " + nama[i]);
                                        System.out.println("Status: " + status[i]);
                                        //BULAN
                                        // if (bulan[i].equalsIgnoreCase("januari")) {
                                            for (int j = 0; j < bulan.length; j++) {
                                                if (bulan[j].equalsIgnoreCase("januari")){
                                                    System.out.println("Bulan: " + bulan[j]);
                                                }
                                            }
                                        // }
                                        //GAJI POKOK
                                        System.out.println("Gaji Pokok: " + gajiPokok[i]);
                                        //TUNJANGAN
                                        System.out.println("Tunjangan : " + tunjangan[i]);
                                        //GAJI TOTAL
                                        System.out.println("Gaji Total: " + gajiTotal[i]);
                                    }
                                }
                        break;

                        case 4: // PELAPORAN GAJI GURU PER BULAN
                        break;
                        case 5: // HISTORI
                        break;
                        
                    }
                } while (menu != 6);
            } else { // menu guru
                do {
                    System.out.println(" ");
                    System.out.println("===== SELAMAT DATANG DI SISTEM =====");
                    System.out.println("1. Informasi Data Guru");
                    System.out.println("2. Informasi Gaji Guru");
                    System.out.println("3. Histori");
                    System.out.println("4. Ganti Akun");
                    System.out.println("5. Exit");
                    System.out.print("Silahkan pilih menu yang ingin dibuka: ");
                    menu = sc.nextInt();
    
                    switch (menu) {
                        case 1:
                            System.out.println();
                            System.out.println("===== INFORMASI DATA GURU =====");

                            for (int i = 0; i < NIP.length; i++) {
                                if (NIP[i] == loginNIP) {
                                    System.out.println("NIP   : " + NIP[i]);
                                    System.out.println("Nama  : " + nama[i]);
                                    System.out.println("Status: " + status[i]);
                                }
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("===== INFORMASI GAJI GURU =====");
                            for (int i = 0; i < NIP.length; i++) {
                                if (NIP[i] == loginNIP) {
                                    System.out.println("NIP   : " + NIP[i]);
                                    System.out.println("Nama  : " + nama[i]);
                                    System.out.println("Status: " + status[i]);
                                    //BULAN
                                    // if (bulan[i].equalsIgnoreCase("januari")) {
                                        
                                    // }
                                    //GAJI POKOK
                                    System.out.println("Gaji Pokok: " + gajiPokok[i]);
                                    //TUNJANGAN
                                    System.out.println("Tunjangan : " + tunjangan[i]);
                                    //GAJI TOTAL
                                    System.out.println("Gaji Total: " + gajiTotal[i]);
                                }
                            }
                            break;
                        case 3: 
    
                            break;
                        default:
                            break;
                    }
                } while (menu!= 4);
            }
        } else {
            System.out.println("Username atau Password Anda salah!");
        }
        sc.close();
    }
}
