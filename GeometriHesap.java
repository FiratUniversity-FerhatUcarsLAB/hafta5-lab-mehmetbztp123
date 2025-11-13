/*
 * Ad Soyad: [Mehmet Boztepe]
 * Ogrenci No: [240541084]
 * Tarih: [13.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

public class GeometrikSekilHesaplayici {

    // --- Kare Metotları ---

    /**
     * Karenin alanını hesaplar.
     * Alan = kenar * kenar
     * @param kenar Karenin bir kenar uzunluğu.
     * @return Karenin alanı.
     */
    public double calculateSquareArea(double kenar) {
        // Formül: kenar * kenar
        return kenar * kenar;
    }

    /**
     * Karenin çevresini hesaplar.
     * Çevre = 4 * kenar
     * @param kenar Karenin bir kenar uzunluğu.
     * @return Karenin çevresi.
     */
    public double calculateSquarePerimeter(double kenar) {
        // Formül: 4 * kenar
        return 4 * kenar;
    }

    // --- Dikdörtgen Metotları ---

    /**
     * Dikdörtgenin alanını hesaplar.
     * Alan = genişlik * yükseklik
     * @param genislik Dikdörtgenin genişliği.
     * @param yukseklik Dikdörtgenin yüksekliği.
     * @return Dikdörtgenin alanı.
     */
    public double calculateRectangleArea(double genislik, double yukseklik) {
        // Formül: genişlik * yükseklik
        return genislik * yukseklik;
    }

    /**
     * Dikdörtgenin çevresini hesaplar.
     * Çevre = 2 * (genişlik + yükseklik)
     * @param genislik Dikdörtgenin genişliği.
     * @param yukseklik Dikdörtgenin yüksekliği.
     * @return Dikdörtgenin çevresi.
     */
    public double calculateRectanglePerimeter(double genislik, double yukseklik) {
        // Formül: 2 * (genişlik + yükseklik)
        return 2 * (genislik + yukseklik);
    }

    // --- Daire Metotları ---

    /**
     * Dairenin alanını hesaplar.
     * Alan = $\pi \times r^2$
     * Math.PI kullanılarak hesaplanır.
     * @param yaricap Dairenin yarıçapı (r).
     * @return Dairenin alanı.
     */
    public double calculateCircleArea(double yaricap) {
        // Formül: Math.PI * r^2
        return Math.PI * yaricap * yaricap;
    }

    /**
     * Dairenin çevresini (çemberin uzunluğunu) hesaplar.
     * Çevre = $2 \times \pi \times r$
     * Math.PI kullanılarak hesaplanır.
     * @param yaricap Dairenin yarıçapı (r).
     * @return Dairenin çevresi.
     */
    public double calculateCircleCircumference(double yaricap) {
        // Formül: 2 * Math.PI * r
        return 2 * Math.PI * yaricap;
    }

    // --- Üçgen Metotları ---

    /**
     * Üçgenin alanını hesaplar.
     * Alan = (taban * yükseklik) / 2
     * @param taban Üçgenin taban uzunluğu.
     * @param yukseklik Bu tabana ait yükseklik.
     * @return Üçgenin alanı.
     */
    public double calculateTriangleArea(double taban, double yukseklik) {
        // Formül: (taban * yükseklik) / 2
        return (taban * yukseklik) / 2;
    }

    /**
     * Üçgenin çevresini hesaplar (tüm kenarların toplamı).
     * Çevre = a + b + c
     * @param kenarA Birinci kenar uzunluğu (a).
     * @param kenarB İkinci kenar uzunluğu (b).
     * @param kenarC Üçüncü kenar uzunluğu (c).
     * @return Üçgenin çevresi.
     */
    public double calculateTrianglePerimeter(double kenarA, double kenarB, double kenarC) {
        // Formül: a + b + c
        return kenarA + kenarB + kenarC;
    }

    // --- Örnek Kullanım (main metodu) ---

    public static void main(String[] args) {
        GeometrikSekilHesaplayici hesaplayici = new GeometrikSekilHesaplayici();

        // Kare (Kenar: 5.0)
        System.out.println("--- Kare (Kenar: 5.0) ---");
        System.out.println("Alan: " + hesaplayici.calculateSquareArea(5.0)); // 25.0
        System.out.println("Çevre: " + hesaplayici.calculateSquarePerimeter(5.0)); // 20.0
        System.out.println("---");

        // Dikdörtgen (Genişlik: 4.0, Yükseklik: 6.0)
        System.out.println("--- Dikdörtgen (4.0 x 6.0) ---");
        System.out.println("Alan: " + hesaplayici.calculateRectangleArea(4.0, 6.0)); // 24.0
        System.out.println("Çevre: " + hesaplayici.calculateRectanglePerimeter(4.0, 6.0)); // 20.0
        System.out.println("---");

        // Daire (Yarıçap: 3.0)
        double yaricap = 3.0;
        System.out.println("--- Daire (Yarıçap: 3.0) ---");
        System.out.println("Alan: " + hesaplayici.calculateCircleArea(yaricap)); // Yaklaşık 28.27
        System.out.println("Çevre: " + hesaplayici.calculateCircleCircumference(yaricap)); // Yaklaşık 18.85
        System.out.println("---");

        // Üçgen (Taban: 8.0, Yükseklik: 5.0, Kenarlar: 6.0, 8.0, 10.0)
        System.out.println("--- Üçgen (Taban: 8.0, Yükseklik: 5.0) ---");
        System.out.println("Alan: " + hesaplayici.calculateTriangleArea(8.0, 5.0)); // 20.0
        System.out.println("Çevre (Kenarlar: 6, 8, 10): " + hesaplayici.calculateTrianglePerimeter(6.0, 8.0, 10.0)); // 24.0
        System.out.println("---");
    }
}
