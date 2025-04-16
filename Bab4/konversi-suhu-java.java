public class KonversiSuhu {
    public static void main(String[] args) {
        // 1. Deklarasikan variabel double bernama suhuCelsius dan inisialisasi dengan nilai 25.0
        double suhuCelsius = 25.0;
        
        // 2. Hitung suhu dalam Fahrenheit dan Kelvin dengan rumus yang diberikan
        // 3. Simpan hasil konversi dalam variabel double bernama suhuFahrenheit dan suhuKelvin
        double suhuFahrenheit = (suhuCelsius * 9/5) + 32;
        double suhuKelvin = suhuCelsius + 273.15;
        
        // 4. Tampilkan hasil konversi suhu dalam format yang diminta
        System.out.println("Suhu dalam Celsius: " + suhuCelsius);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);
    }
}
