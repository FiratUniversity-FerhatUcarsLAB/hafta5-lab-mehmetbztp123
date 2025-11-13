/*
 * Ad Soyad: [Mehmet Boztepe]
 * Ogrenci No: [240541084]
 * Tarih: [13.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

public class FizikFormulAsistani {

    /** Yerçekimi ivmesi sabiti. (9.8 m/s^2) */
    public final static double GRAVITY = 9.8;

    public double calculateVelocity(double mesafe, double zaman) {
        return mesafe / zaman; // v = s / t
    }

    public double calculateAcceleration(double hizDegisimi, double zaman) {
        return hizDegisimi / zaman; // a = $\Delta v$ / t
    }

    public double calculateForce(double kutle, double ivme) {
        return kutle * ivme; // F = m $\times$ a
    }

    public double calculateWork(double kuvvet, double mesafe) {
        return kuvvet * mesafe; // W = F $\times$ d
    }

    public double calculatePower(double is, double zaman) {
        return is / zaman; // P = W / t
    }

    public double calculateKineticEnergy(double kutle, double hiz) {
        return 0.5 * kutle * Math.pow(hiz, 2); // KE = 0.5 $\times$ m $\times$ $v^2$
    }

    public double calculatePotentialEnergy(double kutle, double yukseklik) {
        return kutle * GRAVITY * yukseklik; // PE = m $\times$ g $\times$ h
    }

    public double calculateMomentum(double kutle, double hiz) {
        return kutle * hiz; // p = m $\times$ v
    }
}
