package com;

// Data Member
class Mahasiswa{
    String Nama;
    int Nim;

    // Construktor
    Mahasiswa(String inputNama,int inputNIM){
        this.Nama = inputNama;
        this.Nim = inputNIM;


    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("Nim : " + this.Nim);
    }
    // method tanpa return dengan parameter / setter
    void setnama(String nama){
        this.Nama = nama;
    }

    void setnim(int nim){
        this.Nim = nim;
    }


    // Method dengan return tanpa parameter
    String getname(){
        return this.Nama;
    }

    // Method dengan retrun dan parameter
    String nyapa(String isi){
        return isi + "nama saya adalah " + this.Nama;
    }

}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Agus",23123423 );
    
    
        mahasiswa1.show();
        mahasiswa1.setnama("Abdul");
        mahasiswa1.setnim(12345);
        System.out.println();
        System.out.println("Ini setelah di ubah");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getname());
        System.out.println(mahasiswa1.nyapa("Oi "));

    }

}
