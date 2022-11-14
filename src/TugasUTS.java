import java.util.*;
public class TugasUTS {

    int jumlahcupkopi = 4;
    public static String[] kopidontbelatte = new String[400];
    public static String[] kopigoncangjiwa = new String[300];
    public static String[] kopijalankenangan = new String[300];
    public static String[] kopitanparasa = new String[250];

    public static int stoKopi = kopidontbelatte.length + kopigoncangjiwa.length + kopijalankenangan.length + kopitanparasa.length;
    public static int sisaKopi = stoKopi;


    public static void printinfotrnsaksi() {
        int totalkopidontbelatte = 0;
        int totaltransaksi = 0;
        for (int index = 0; index < kopidontbelatte.length; index++) {
            if (kopidontbelatte[index] != null) {
                totalkopidontbelatte++;
            }
        }
        int totalkopikopigoncanganjiwa = 0;
        for (int index = 0; index < kopigoncangjiwa.length; index++) {
            if (kopigoncangjiwa[index] != null) {
                totalkopikopigoncanganjiwa++;

            }
        }
        int totalkopijalankenangan = 0;
        for (int index = 0; index < kopijalankenangan.length; index++) {
            if (kopijalankenangan[index] != null) {
                totalkopijalankenangan++;

            }
        }
        int totalkopitanparasa = 0;
        for (int index = 0; index < kopitanparasa.length; index++) {
            if (kopitanparasa[index] != null) {
                totalkopitanparasa++;
            }
        }
        sisaKopi = stoKopi - kopidontbelatte.length - kopijalankenangan.length - kopigoncangjiwa.length - kopitanparasa.length;
        System.out.println("dont be late terjual" + totalkopidontbelatte + " dan tersisa" + (kopidontbelatte.length - totalkopidontbelatte) + "cup");
        System.out.println("kopi Gonjcang Jiwa" + totalkopikopigoncanganjiwa + " dan tersisa " + (kopigoncangjiwa.length - totalkopikopigoncanganjiwa) + "cup");
        System.out.println("kopi jalan kenangan" + totalkopijalankenangan + " dan tersisa " + (kopijalankenangan.length - totalkopijalankenangan) + "cup");
        System.out.println("kopi pahit tanpa rasa" + totalkopitanparasa + "dan tersisa" + (kopitanparasa.length - totalkopitanparasa));

        ArrayList<Integer> penjualan = new ArrayList<Integer>();
        penjualan.add(totalkopidontbelatte);
        penjualan.add(totalkopikopigoncanganjiwa);
        penjualan.add(totalkopijalankenangan);
        penjualan.add(totalkopitanparasa);
//urutan nilai
        Collections.sort(penjualan, Collections.reverseOrder());
        System.out.println("=================================================================================================================================");
        System.out.println("kopi paliung banyak disukai");

        if (totalkopidontbelatte == penjualan.get(0)) {
            System.out.println("- dont be late");
        }
        if (totalkopikopigoncanganjiwa == penjualan.get(0)) {
            System.out.println("- Goncang jiwa");
        }
        if (totalkopijalankenangan == penjualan.get(0)) {
            System.out.println(" Jalan Kenangan");
        }
        if (totalkopitanparasa == penjualan.get(0)) {

        }
//tidak disukai
        if (totalkopidontbelatte == penjualan.get(3)) {
            System.out.println("- dont be late");
        }
        if (totalkopikopigoncanganjiwa == penjualan.get(3)) {
            System.out.println("- Goncang jiwa");
        }
        if (totalkopijalankenangan == penjualan.get(3)) {
            System.out.println(" Jalan Kenangan");
        }
        if (totalkopitanparasa == penjualan.get(3)) {

        }
        System.out.println("Total Terjual : " + (totalkopidontbelatte + totalkopikopigoncanganjiwa + totalkopijalankenangan + totalkopitanparasa) + " cup ");
        System.out.println("Total sisa " + sisaKopi + "cup");
        System.out.println("=============================================================================================================================");
    }

    public static void inputdata(String[] jeniskopi, String Customer) {
        for (int i = 0; i < jeniskopi.length; i++) {
            if (jeniskopi[i] == null) {
                jeniskopi[i] = Customer;
                break;
            }
        }
    }

    public static void dataorderan(int jeniskopi, String Customer) {
        System.out.println(Customer);
        switch (jeniskopi) {
            case 1:
                inputdata(kopidontbelatte, Customer);
                System.out.println("dont be late");
                break;
            case 2:
                inputdata(kopigoncangjiwa, Customer);
                System.out.println("gonjang jiwa");
                break;
            case 3:
                inputdata(kopijalankenangan, Customer);
                System.out.println("jalan kenangan");
                break;
            case 4:
                inputdata(kopitanparasa, Customer);
                System.out.println("pait tanpa rasa");
                break;

        }

            Scanner pembeli = new Scanner(System.in);
            while (true) {
                System.out.println("masukan nama :");
                String namaPembeli = pembeli.nextLine();

                if (namaPembeli.isBlank()) {
                    System.out.println("harus isi nama pembeli");

                } else if (sisaKopi == 0) {
                    System.out.println("maaf semua kopi sudah habis");
                } else {
                    Random a = new Random();
                    int jenisrandom = a.nextInt(4) + 1;
                    dataorderan(jeniskopi, Customer);

            }
        }
    }
}