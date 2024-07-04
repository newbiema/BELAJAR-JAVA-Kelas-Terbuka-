package com;

class Motor{
    String nama;
    int tahun;


    // Construktor dengan parameter
    Motor(String inputNama,int inputTahun){
        nama = inputNama;
        tahun = inputTahun;

        System.out.println(nama);
        System.out.println(tahun);

    }

}

class Mahasiswa{
    String Name;
    int NIM;
    String Jurusan;


    // Construktor dengan paramater

    Mahasiswa(String inputnama,int inputNIM,String inputJurusan){
        Name = inputnama;
        NIM = inputNIM;
        Jurusan = inputJurusan;

        System.out.println(Name);
        System.out.println(NIM);
        System.out.println(Jurusan);

    }

}

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Agus", 2022324, "Ilmu Komputer");
        System.out.println();
        Motor motor1 = new Motor("vario", 2000);

        
    }
}
