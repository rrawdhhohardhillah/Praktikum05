package minggu5;

class DataMahasiswa {
    int nilaiUTS[];
    int nilaiUAS[];

    DataMahasiswa(int jumlahMahasiswa) {
        nilaiUTS = new int[jumlahMahasiswa];
        nilaiUAS = new int[jumlahMahasiswa];
    }

    int cariNilaiUTSTerbesar(int arr[], int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int terbesarKiri = cariNilaiUTSTerbesar(arr, kiri, tengah);
        int terbesarKanan = cariNilaiUTSTerbesar(arr, tengah + 1, kanan);
        return Math.max(terbesarKiri, terbesarKanan);
    }

    int cariNilaiUTSTerkecil(int arr[], int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int terkecilKiri = cariNilaiUTSTerkecil(arr, kiri, tengah);
        int terkecilKanan = cariNilaiUTSTerkecil(arr, tengah + 1, kanan);
        return Math.min(terkecilKiri, terkecilKanan);
    }

    double hitungRataRataNilaiUAS() {
        double total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }
        return total / nilaiUAS.length;
    }
}
