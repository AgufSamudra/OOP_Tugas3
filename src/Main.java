public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.nama = "Anton";
        person2.nama = "Riko";

        person1.jenisKelamin = 'L';
        person2.jenisKelamin = 'L';

        person1.umur = 20;
        person2.umur = 25;

        System.out.println("======== Latihan 1 ========");

        // BUAT ANTON
        System.out.println("Nama: " + person1.nama+
                            "\nJenis Kelamin: " + person1.jenisKelamin +
                            "\nUmur: " + person1.umur);

        // BUAT RIKO
        System.out.println("\nNama: " + person2.nama+
                "\nJenis Kelamin: " + person2.jenisKelamin +
                "\nUmur: " + person2.umur);

        // AKUNBANK
        AkunBank bank = new AkunBank();

        System.out.println("\n======== Latihan 2 ========");
        bank.show();
    }
}