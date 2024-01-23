import java.util.HashMap;
import java.util.Map;

public class SiparisAnaliz {
    //toplamTutar icin gerekli Java Fonksiyonu
    public static int toplamTutar(Siparis[] siparisler){
        int toplamTutar = 0;
        for(Siparis siparis: siparisler){
            toplamTutar += siparis.getAdet() * siparis.getBirimFiyati();
        }
        return toplamTutar;
    }

    //ortalamaFiyat icin gerekli Java Fonksiyonu
    public static double ortalamaFiyat(Siparis[] siparisler){
        int toplamAdet=0;
        int toplamTutar=0;

        for(Siparis siparis:siparisler){
            toplamAdet+=siparis.getAdet();
            toplamTutar+=siparis.getAdet() * siparis.getBirimFiyati();
        }
        return (double) toplamTutar/toplamAdet;
    }

    //malBazliOrtalamaFiyat icin gerekli Java Fonksiyonu
    public static Map<Integer,Double> malBazliOrtalamaFiyat(Siparis[] siparisler){
        Map<Integer,Double> malBazliOrtalamaFiyatlar = new HashMap<>();
        Map<Integer, Integer> malAdetleri = new HashMap<>();
        for(Siparis siparis:siparisler){
            int malNumarasi=siparis.getMalNumarasi();
            int adet=siparis.getAdet();
            double birimFiyat=siparis.getBirimFiyati();
            double toplamTutar=adet * birimFiyat;

            malBazliOrtalamaFiyatlar.merge(malNumarasi,toplamTutar,Double::sum);
            malAdetleri.merge(malNumarasi, adet, Integer::sum);
        }

        for(Map.Entry<Integer,Double> entry:malBazliOrtalamaFiyatlar.entrySet()){
            int malNumarasi=entry.getKey();
            double toplamTutar=entry.getValue();
            int adet = malAdetleri.get(malNumarasi);
            double ortalamaFiyat = toplamTutar / adet;
            System.out.println("Mal " + malNumarasi + " için ortalama fiyat: " + ortalamaFiyat);
        }
        return malBazliOrtalamaFiyatlar;
    }

    //malSiparisAdet icin gerekli Java Fonksiyonu
    public static Map<Integer, Integer> malSiparisAdet(Siparis[] siparisler) {
        Map<Integer, Integer> malSiparisAdetleri = new HashMap<>();
        for (Siparis siparis : siparisler) {
            int malNumarasi = siparis.getMalNumarasi();
            int adet = siparis.getAdet();

            malSiparisAdetleri.merge(malNumarasi, adet, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : malSiparisAdetleri.entrySet()) {
            int malNumarasi = entry.getKey();
            int adet = entry.getValue();

            System.out.println("Mal " + malNumarasi + " için toplam sipariş adeti: " + adet);
        }
        return malSiparisAdetleri;
    }
}
