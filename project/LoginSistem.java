import java.util.Scanner;
public class LoginSistem {
    public static void main(String[] args) {
        String[][] Data = {
            {"1234501", "pass1"},
            {"1234502", "pass2"},
            {"1234503", "pass3"}
        };
        
        performLogin(Data);
    }

    public static void performLogin(String[][] Data) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("                     SELAMAT DATANG DI SISTEM PENGGAJIAN GURU");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("Masukkan NIP : ");
        String NIP = sc.nextLine();
        System.out.print("Masukkan Password : ");
        String Password = sc.nextLine();

        if (isValidLogin(Data, NIP, Password)) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("                            LOGIN BERHASIL");
            System.out.println("-------------------------------------------------------------------------------------");
        } else {
            System.out.println("Login gagal, NIP dan Password salah.");
        }
    }
    public static boolean isValidLogin(String[][] Data, String NIP, String Password) {
        for(String[] baris : Data) {
            if(baris[0].equals(NIP) && baris[1].equals(Password)) {
                return true;
            }
        }
        return false;  
    } 
    
}

