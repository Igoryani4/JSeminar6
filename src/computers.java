/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class noteBook {

    public static void main(String[] args) {
        pc pc1  = new pc("Laptop", "Dell", 13.3 , 4 , 4, "SSD",
                512 , "Windows", 56000);
        pc pc2 = new pc("Ultrabook", "Huawey", 17.3, 6, 16,
                "SSD", 16, "Windows 11", 62999);
        pc pc3 = new pc("Laptop", "GIGABYTE", 15.6, 12, 16, "SSD",
                512, "null", 74999);
        pc pc4 = new pc("Laptop", "Apple", 16.2,10, 16, "SSD",
                512, "Mac OS", 208999);

    }
}

class pc {
    String type;
    String stamp;
    double diagonal;
    int countCores;
    int RAM;
    String typeHDD;
    int hardDiskCapacity;
    String typeOS;
    int price;

    public pc(String type, String stamp, double diagonal, int countCores, int RAM, String typeHDD,
                     int hardDiskCapacity, String typeOS, int price){
        this.type = type;
        this.stamp = stamp;
        this.diagonal = diagonal;
        this.countCores = countCores;
        this.RAM = RAM;
        this.typeHDD = typeHDD;
        this.hardDiskCapacity = hardDiskCapacity;
        this.typeOS = typeOS;
        this.price = price;
        System.out.println("-------------------------------------");
        System.out.println("Type PC : " + type + "\n" + "Stamp : " + stamp + "\n" + "Diagonal : "+ diagonal + " inch \n"+
                "Count of Cores : " + countCores + "\n" + "RAM : " + RAM + " GB\n" + "Type Hard Disk : "+ typeHDD + "\n" +
                "Hard Disk Capacity : " + hardDiskCapacity + " GB\n" + "Type Operation System : " + typeOS + "\n" +
                "Is price : " + price + " Rub");
        System.out.println("-------------------------------------");


    }
}