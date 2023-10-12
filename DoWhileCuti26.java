import java.util.Scanner;
public class DoWhileCuti26 {

    public static void main(String[] args) {
        Scanner scan26 =new Scanner (System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan26.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan26.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari: ");
                jumlahHari = scan26.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi. Silahkan masukkan jumlah hari yang sesuai.");
                    continue;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        } while (jatahCuti > 0);
    }
}