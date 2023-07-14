public class BiznetBeraksi {
        public static void main(String[] args) {

            Biznet biznet1 = new Biznet();
            biznet1.paket = "Paket Biznet 1";
            biznet1.harga = 3250000;
            biznet1.kecepatan = 75;

            Biznet biznet2 = new Biznet();
            biznet2.paket = "Paket Biznet 2";
            biznet2.harga = 500000;
            biznet2.kecepatan = 150;

            Biznet biznet3 = new Biznet();
            biznet3.paket = "Paket Biznet 3";
            biznet3.harga = 600000;
            biznet3.kecepatan = 170;

            System.out.println("List Harga Paket Biznet (1P Internet Only)");
            System.out.println();
            biznet1.info();
            System.out.println("Harga Setelah PPN 11%: " + (biznet1.harga + (biznet1.harga * 0.11)));
            System.out.println();

            biznet2.info();
            System.out.println("Harga Setelah PPN 11%: " + (biznet2.harga + (biznet2.harga * 0.11)));
            System.out.println();

            biznet3.info();
            System.out.println("Harga Setelah PPN 11%: " + (biznet3.harga + (biznet3.harga * 0.11)));
        }
    }

