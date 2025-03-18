package minggu5;

public class MainDaftarNilaiMahasiswa {
    public static void main(String[] args) {
      
        DataMahasiswa data = new DataMahasiswa(8);
        
        data.nilaiUTS = new int[]{78, 85, 90, 76, 92, 88, 80, 82};
        data.nilaiUAS = new int[]{82, 88, 87, 79, 95, 85, 83, 84};

        System.out.println("Nilai UTS tertinggi: " + data.cariNilaiUTSTerbesar(data.nilaiUTS, 0, data.nilaiUTS.length - 1));
        System.out.println("Nilai UTS terendah : " + data.cariNilaiUTSTerkecil(data.nilaiUTS, 0, data.nilaiUTS.length - 1));
        System.out.println("Rata-rata nilai UAS: " + data.hitungRataRataNilaiUAS());
    }
}
