/*
 * Ad Soyad: [Mehmet Boztepe]
 * Ogrenci No: [240541084]
 * Tarih: [13.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

public class ETicaretSepetHesaplayici {

    // Sabitler
    public final static double VAT_RATE = 0.18;      // %18 KDV Oranı
    public final static double SHIPPING_FEE = 29.99; // Sabit Kargo Ücreti

    // 1. Ürün Satış Toplamı (Fiyat $\times$ Adet)
    public double calculateProductSalesTotal(double fiyat, int adet) {
        return fiyat * adet;
    }

    // 2. Ara Toplam (3 ürünün toplamı)
    public double calculateSubtotal(double top1, double top2, double top3) {
        return top1 + top2 + top3;
    }

    // 3. İndirim Tutarı (Ara Toplam $\times$ % / 100)
    public double calculateDiscountAmount(double subtotal, double discountRate) {
        return subtotal * (discountRate / 100.0);
    }

    // 4. İndirimli Toplam (Ara Toplam - İndirim)
    public double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5. KDV Tutarı (İndirimli Toplam $\times$ VAT_RATE)
    public double calculateVATAmount(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // 6. Genel Toplam (İndirimli Toplam + KDV + Kargo)
    public double calculateGrandTotal(double discountedTotal, double vatAmount) {
        return discountedTotal + vatAmount + SHIPPING_FEE;
    }

    // --- Örnek Kullanım ---
    public static void main(String[] args) {
        ETicaretSepetHesaplayici hesaplayici = new ETicaretSepetHesaplayici();
        double indirimYuzdesi = 15.0; // %15 indirim

        // Ürün Satış Toplamları
        double top1 = hesaplayici.calculateProductSalesTotal(250.0, 2); // 500.0
        double top2 = hesaplayici.calculateProductSalesTotal(80.0, 3);  // 240.0
        double top3 = hesaplayici.calculateProductSalesTotal(10.0, 10); // 100.0

        // Sepet Hesaplamaları
        double araToplam = hesaplayici.calculateSubtotal(top1, top2, top3);
        double indirimTutari = hesaplayici.calculateDiscountAmount(araToplam, indirimYuzdesi);
        double indirimliToplam = hesaplayici.calculateDiscountedTotal(araToplam, indirimTutari);
        double kdvTutari = hesaplayici.calculateVATAmount(indirimliToplam);
        double genelToplam = hesaplayici.calculateGrandTotal(indirimliToplam, kdvTutari);

        System.out.println("--- Sepet Sonuçları (Örnek) ---");
        System.out.printf("Ara Toplam: %.2f TL\n", araToplam);            // 840.00 TL
        System.out.printf("İndirim Tutarı (%%%.0f): -%.2f TL\n", indirimYuzdesi, indirimTutari); // 126.00 TL
        System.out.printf("İndirimli Toplam: %.2f TL\n", indirimliToplam); // 714.00 TL
        System.out.printf("KDV Tutarı (%%%.0f): +%.2f TL\n", ETicaretSepetHesaplayici.VAT_RATE * 100, kdvTutari); // 128.52 TL
        System.out.printf("Kargo Ücreti: +%.2f TL\n", ETicaretSepetHesaplayici.SHIPPING_FEE); // 29.99 TL
        System.out.println("------------------------------------");
        System.out.printf("**Genel Toplam:** %.2f TL\n", genelToplam); // 872.51 TL
    }
}
}
