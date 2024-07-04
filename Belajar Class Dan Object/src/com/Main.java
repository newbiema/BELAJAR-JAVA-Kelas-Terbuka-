package com;





class Mahasiswa {
    String nama;
    int nim;
    String asal;


    
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa1.nama = "Ali";
        mahasiswa1.nim = 232134;
        mahasiswa1.asal = "Lombok";

        System.out.println("Nama : " + mahasiswa1.nama);
        System.out.println("Nim : " + mahasiswa1.nim);
        System.out.println("Asal : " + mahasiswa1.asal);

        mahasiswa2.nama = "Agus";
        mahasiswa2.nim = 234;
        mahasiswa2.asal = "Sulawesi";

        System.out.println("Nama : " + mahasiswa2.nama);
        System.out.println("Nim : " + mahasiswa2.nim);
        System.out.println("Asal : " + mahasiswa2.asal);


    }
    
}
