import java.util.*;

public class Main {
    public static void main(String[] args) {

        createLaptop(); // создаём ноутбуки

        System.out.println(userChoice());  // общаемся с пользователем, собираем критерии в map

        }


    static void createLaptop() {
        String[] myString_1 = new String[]{"Asus", "Lenovo", "Dell", "Apple", "HP"};
        String[] myString_2 = new String[]{"4", "8", "16", "32", "64"};
        String[] myString_3 = new String[]{"Linux", "Windows", "iOS"};
        String[] myString_4 = new String[]{"red", "blue", "yellow", "black", "white"};

        Laptop note_1 = new Laptop();
        note_1.company = randomQuantity(myString_1);
        note_1.ram = Integer.parseInt(randomQuantity(myString_2));
        note_1.diskCapacity = randomSize(100, 1000);
        note_1.os = randomQuantity(myString_3);
        note_1.color = randomQuantity(myString_4);
        note_1.price = randomSize(15000, 100000);

        Laptop note_2 = new Laptop();
        note_2.company = randomQuantity(myString_1);
        note_2.ram = Integer.parseInt(randomQuantity(myString_2));
        note_2.diskCapacity = randomSize(100, 1000);
        note_2.os = randomQuantity(myString_3);
        note_2.color = randomQuantity(myString_4);
        note_2.price = randomSize(15000, 100000);

        Laptop note_3 = new Laptop();
        note_3.company = randomQuantity(myString_1);
        note_3.ram = Integer.parseInt(randomQuantity(myString_2));
        note_3.diskCapacity = randomSize(100, 1000);
        note_3.os = randomQuantity(myString_3);
        note_3.color = randomQuantity(myString_4);
        note_3.price = randomSize(15000, 100000);

        Laptop note_4 = new Laptop();
        note_4.company = randomQuantity(myString_1);
        note_4.ram = Integer.parseInt(randomQuantity(myString_2));
        note_4.diskCapacity = randomSize(100, 1000);
        note_4.os = randomQuantity(myString_3);
        note_4.color = randomQuantity(myString_4);
        note_4.price = randomSize(15000, 100000);


        Set<Laptop> notes = new HashSet<>();
        notes.add(note_1);
        notes.add(note_2);
        notes.add(note_3);
        notes.add(note_4);

        System.out.println(notes);

    }

    static String randomQuantity(String[] myString) {
        int n = (int) Math.floor(Math.random() * myString.length);
        return myString[n];
    }

    static int randomSize(int a, int b) {
        int number = (int) (a + Math.random() * b);
        return number;
    }


    static Map<String, String> userChoice() {
        System.out.println("""
                Выберите критерии ноутбука: 
                1 - Компания производитель
                2 – ОЗУ
                3 - Объём ЖД
                4 - Операционная система
                5 - Цвет
                6 – Цена
                0 – Показать ноутбуки по выбранным критериям""");
        Map<String, String> criterion = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer num = scanner.nextInt();
            if (num.equals(1)) {
                System.out.println("Напишите компанию производителя: ");
                Scanner scanner_2 = new Scanner(System.in);
                String input_1 = scanner_2.nextLine();
                criterion.put("company", input_1);
                System.out.println("Выберите следующий критерий: ");
            } else if (num.equals(2)) {
                System.out.println("Напишите минимальный объём ОЗУ (от 4 до 64 Гб): ");
                Integer input_2 = scanner.nextInt();
                criterion.put("ram", String.valueOf(input_2));
                System.out.println("Выберите следующий критерий: ");
            } else if (num.equals(3)) {
                System.out.println("Напишите минимальный объём ЖД: ");
                Integer input_3 = scanner.nextInt();
                criterion.put("diskCapacity", String.valueOf(input_3));
                System.out.println("Выберите следующий критерий: ");
            } else if (num.equals(4)) {
                System.out.println("Напишите операционную систему: ");
                Scanner scanner_3 = new Scanner(System.in);
                String input_4 = scanner_3.nextLine();
                criterion.put("os", input_4);
                System.out.println("Выберите следующий критерий: ");
            } else if (num.equals(5)) {
                System.out.println("Напишите цвет: ");
                Scanner scanner_4 = new Scanner(System.in);
                String input_5 = scanner_4.nextLine();
                criterion.put("color", input_5);
                System.out.println("Выберите следующий критерий: ");
            } else if (num.equals(6)) {
                System.out.println("Напишите минимальную цену: ");
                Integer input_6 = scanner.nextInt();
                criterion.put("price", String.valueOf(input_6));
                System.out.println("Выберите следующий критерий: ");
            } else if (num.equals(0)) {
                return criterion;
            } else {
                System.out.println("Вы ввели некорректное значение. Выберите цифру от 0 до 6.");
            }
        }
    }
}












