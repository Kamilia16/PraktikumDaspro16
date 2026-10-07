import java.util.Scanner;

public class StudiKasus216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis  kegiatan (BELAMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim().toLowerCase();

         if (jenis.equals("belmawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();
        }
    }
}