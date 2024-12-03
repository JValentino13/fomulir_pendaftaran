import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
      /*  try (Scanner input = new Scanner(System.in)) {

            System.out.println("Masukan NilaiA");
            int nilaiA= input.nextInt();

        System.out.println("Masukan NIlaiB");
               int nilaiB= input.nextInt();
               System.out.println();

               System.out.println("Nilai A ="+ nilaiA);
               System.out.println("Nilai B ="+ nilaiB);
               System.out.println();

               //penjumlahan
               int hasilPenjumlahan = nilaiA + nilaiB;

               System.out.println("Hasil Penjumlahan ="+ hasilPenjumlahan);

               //pengurangan
               int hasilPengurangan = nilaiA - nilaiB;

               System.out.println("Hasil Pengurangan ="+ hasilPengurangan);

               //perkalian
               int hasilPerkalian = nilaiA * nilaiB;

               System.out.println("Hasil Perkalian ="+ hasilPerkalian);

               //pembagian
               int hasilPembagian = nilaiA / nilaiB;

               System.out.println("Hasil Pembagian ="+ hasilPembagian);*/


       /*  Scanner input = new Scanner(System.in);//untuk input
        char golongan;
        int jam= 0, upah= 0, total;
        String nama;
        System.out.println("Nama Karyawan =");
        nama = input.nextLine();//input string

        System.out.println("Golongan =");
        golongan = input.next().charAt(0);//input char

        System.out.println("Jam Kerja =");
        jam = input.nextInt();//input int

        switch (golongan) {
            case 'A':
                upah = 5000;
            case 'B':
                upah= 7000;
            case 'C':
                upah = 8000;
            case 'D':
                upah = 10000;
                break;
        }

        total= jam*upah;

        if ((jam-48)>0) {
            total = total+((jam-48)* 4000);
        }*/

            /*Soal Potongan Harga
            Scanner input = new Scanner(System.in);

            System.out.println("Masukan Total Belanjaan Anda");
            double total = input.nextDouble();

            if ((total>= 100000)&&(total<500000)) {
                System.out.println("Total Belanjaan : Rp."+total);
                total= total-(total*0.1);
                System.out.println("Selamat, anda mendapat diskon 10%");
                System.out.println("Total Bayar : Rp."+ total);
            }
            else if ((total>= 500000)&&(total<1000000)) {
                System.out.println("Total Belanjaan : Rp."+total);
                total= total-(total*0.2);
                System.out.println("Selamat, anda mendapat diskon 20%");
                System.out.println("Total Bayar : Rp."+ total);
            }
            else if (total>=1000000) {
                System.out.println("Total Belanjaan : Rp."+total);
                total= total-(total*0.3);
                System.out.println("Selamat, anda mendapat diskon 30%");
                System.out.println("Total Bayar : Rp."+ total);
            }
            else{
                System.out.println("Total Bayar : Rp."+total);
            }*/

            //scanner
            Scanner input = new Scanner(System.in);
            int User;
            int Pass;

            System.out.println("Masukan Username anda");
            User = input.nextInt();
            System.out.println("Masukan Password anda");
    }
}