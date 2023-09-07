import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama");
        String nama = input.nextLine();
        System.out.println("Masukan Nilai" +nama);
        int nilai = input.nextInt();

        String predikat = null;
        String kategori = null;

        // 96-100
        if(nilai > 95 && nilai <= 100){
            predikat = "A";
            kategori = "Sangat Baik";
        }
        
        // 91-95
        else if(nilai > 90 && nilai <= 95){
            predikat = "A-";
            kategori = "Sangat Baik";
        }
        
        // 86-90
        else if(nilai > 85 && nilai <= 90){
            predikat = "B+";
            kategori = "Baik";
        }
        
        // 81-85
        else if(nilai > 80 && nilai <= 85){
            predikat = "B-";
            kategori = "Baik";
        }
        
        // 75-80
        else if(nilai > 74 && nilai <= 80){
            predikat = "B";
            kategori = "Baik";
        }
        
        // 70-74
        else if(nilai > 69 && nilai <= 74){
            predikat = "C+";
            kategori = "Cukup";
        }
        
        // 65-69
        else if(nilai > 64 && nilai <= 69){
            predikat = "C";
            kategori = "Cukup";
        }
        
        // 60-64
        else if(nilai > 59 && nilai <= 64){
            predikat = "C-";
            kategori = "Cukup";
        }
        
        // 55-59
        else if(nilai > 54 && nilai <= 59){
            predikat = "D+";
            kategori = "Kurang";
        }
        
        // 0-54
        else if(nilai > 0 && nilai <= 54){
            predikat = "D";
            kategori = "Kurang";
        }

        System.out.println("Nama" + nama);
        System.out.println("Nilai" + nilai);
        System.out.println(predikat);
        System.out.println(kategori);


    }
} 
