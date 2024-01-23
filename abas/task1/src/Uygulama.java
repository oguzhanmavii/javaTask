public class Uygulama {
    public static void main(String[] args) {
        Siparis[] siparisler = {
                new Siparis(1000, 2000, 12, 100.51),
                new Siparis(1000, 2001, 31, 200.00),
                new Siparis(1000, 2002, 22, 150.86),
                new Siparis(1000, 2003, 41, 250.00),
                new Siparis(1000, 2004, 55, 244.00),
                new Siparis(1001, 2001, 88, 44.531),
                new Siparis(1001, 2002, 121, 88.110),
                new Siparis(1001, 2004, 74, 211.00),
                new Siparis(1001, 2002, 14, 88.110),
                new Siparis(1002, 2003, 2, 12.10),
                new Siparis(1002, 2004, 3, 22.30),
                new Siparis(1002, 2003, 8, 12.10),
                new Siparis(1002, 2002, 16, 94.00),
                new Siparis(1002, 2005, 9, 44.10),
                new Siparis(1002, 2006, 19, 90.00)
        };
        // a. Üç siparişteki malların toplam tutarının çıktısı
        int toplamTutar = SiparisAnaliz.toplamTutar(siparisler);
        System.out.println("a. Üç siparişteki malların toplam tutarı: " + toplamTutar);

        // b. Üç siparişteki bütün malların ortalama fiyatını bulan çıktı
        double ortalamaFiyat = SiparisAnaliz.ortalamaFiyat(siparisler);
        System.out.println("b. Üç siparişteki bütün malların ortalama fiyatı: " + ortalamaFiyat);

        // c. Üç siparişteki bütün malların tek tek mal bazlı ortalama fiyatını bulan çıktı
        SiparisAnaliz.malBazliOrtalamaFiyat(siparisler);

        // d. Tek tek mal bazlı, malların hangi siparişlerde kaç adet olduğunun çıktısı
        SiparisAnaliz.malSiparisAdet(siparisler);
    }
}