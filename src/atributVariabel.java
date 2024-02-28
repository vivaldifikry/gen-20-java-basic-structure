//library
import java.util.Scanner;

//class java
public class atributVariabel {
    //method java
    public static void main(String[] args){
        //input user berisi string nama dan integer usia
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();

        //output string dan integer
        System.out.println("Nama Anda " + nama + ", usia anda " + usia + " tahun.");
    }
}
