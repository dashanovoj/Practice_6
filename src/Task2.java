import java.util.Scanner;
public class Task2 {

    // Создаём интерфейс Convertable
    public interface Convertable {

        double convert(double value); // добавляем абстрактный метод

    }

    // Класс, реализующий интерфейс Convertable
    public static class KelvinConverter implements Convertable {

        // Реализация метода интерфейса
        @Override
        public double convert(double celsius) {
            return  (celsius + 273.15);
        }
    }

    // Класс, реализующий интерфейс Convertable
    public static class FahrenheitConverter implements Convertable {

        // Реализация метода интерфейса
        @Override
        public double convert(double celsius) {
            return ((celsius * 9/5) + 32);
        }
    }

    public static void main(String[] args) {
        // Создаём экземпляры классов, реализующих интерфейс Convertable
        Convertable toKelvin = new KelvinConverter();
        Convertable toFahrenheit = new FahrenheitConverter();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение температуры в Цельсиях ℃: ");
        double celsius = sc.nextDouble(); // с потока ввода получаем значение температуры

        // с помощью методов классов, реализующих интерфейс, конвертируем полученное значение
        double kelvin = toKelvin.convert(celsius);
        double fahrenheit = toFahrenheit.convert(celsius);

        System.out.println("Температура в Цельсиях: " + celsius + " ℃");
        System.out.println("Температура в Кельвинах: " + kelvin + " K");
        System.out.println("Температура в Фаренгейтах: " + fahrenheit + " ℉");
    }

}
