public class Laptop {
    String company;
    int ram;
    int diskCapacity;
    String os;
    String color;
    int price;

    public String getCompany(){
        return company;
    }
    public int getRam() {
        return ram;
    }

    public int getDiskCapacity() {
        return diskCapacity;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }


    public String toString() {
        return "Название компании: "+ company + ", ОЗУ: " + ram + ", объём ЖД: " + diskCapacity + ", ОС: " + os +
                ", цвет: " + color + ", цена: " + price;
    }

}



//    Хэшкод, икуалс –?


//    Запрашиваем у пользователя критерии
//    И из множества выводим ноутбуки, которые подходят по критериям