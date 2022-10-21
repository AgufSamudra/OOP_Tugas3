public class AkunBank {
    int saldoAwal = 100000;

    public void show(){
        System.out.println("\nSelamat Datang");
        System.out.println("Saldo Saat Ini: "+ cekSaldo());

        System.out.println("\nSimpan uang: Rp.500000");
        System.out.println("Saldo Saat Ini: " + simpanUang());

        System.out.println("\nAmbil Uang: Rp.150000");
        System.out.println("Saldo Saat Ini: " + ambilUang());
    }

    int cekSaldo(){
        return saldoAwal;
    }

    int simpanUang(){
        return saldoAwal + 500000;
    }

    int ambilUang(){
        return simpanUang() - 150000;
    }

}
