import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis buah: ");
        System.out.println("1. Apel");
        System.out.println("2. Pisang");
        System.out.println("3. Jeruk");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih apel.");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih pisang.");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih jeruk.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Pilih hari dalam seminggu: ");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        int hari = scanner.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari ini adalah Senin.");
                break;
            case 2:
                System.out.println("Hari ini adalah Selasa.");
                break;
            case 3:
                System.out.println("Hari ini adalah Rabu.");
                break;
            case 4:
                System.out.println("Hari ini adalah Kamis.");
                break;
            case 5:
                System.out.println("Hari ini adalah Jumat.");
                break;
            case 6:
                System.out.println("Hari ini adalah Sabtu.");
                break;
            case 7:
                System.out.println("Hari ini adalah Minggu.");
                break;
            default:
                System.out.println("Pilihan hari tidak valid.");
                break;
        }

        scanner.close();
    }
}