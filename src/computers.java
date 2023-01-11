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

import java.util.*;

public class computers {

    public static void main(String[] args) {
        int id  = 0;
        pc pc1  = new pc("Laptop", "Dell", 13.3 , 4 , 4, "SSD",
                512 , "Windows", 56000);
        pc pc2 = new pc("Ultrabook", "Huawey", 17.3, 6, 16,
                "SSD", 16, "Windows", 62999);
        pc pc3 = new pc("Laptop", "GIGABYTE", 15.6, 12, 16, "SSD",
                512, "null", 74999);
        pc pc4 = new pc("Laptop", "Apple", 16.2,10, 16, "SSD",
                512, "Mac OS", 208999);
        pc pc5 = new pc("Mono Block", "Ispiron", 18.6, 2, 4, "HHD",
                1024, "Linux", 23560);
        //ArrayList <String> comp = new ArrayList<>(Arrays.asList("pc1", "pc2", "pc3", "pc4", "pc5"));
        pc1.display();
        pc2.display();
        pc3.display();
        pc4.display();
        pc5.display();

        while (true){
            Scanner sc = new Scanner(System.in);
            ArrayList <String> searchMenu = new ArrayList<>(Arrays.asList("1. Search with type PC",
                    "2. Search with Operation System",
                    "3. Search with price", "4. Search with RAM", "5. Search with Stamp"));
            System.out.println("This is Search Menu \nPlease input number :");
            for (int i = 0 ; i < searchMenu.size() ; i++){
                System.out.println(searchMenu.get(i));
            }
            int num = sc.nextInt();
            sc.nextLine();
            if (num <= 5 && num > 0){
                if ( num == 1){
                    System.out.println("You want sorted with Type Personal Computers");
                    System.out.println("Please input type PC: ");
                    String t = sc.nextLine();
                    System.out.println((pc1.type.equalsIgnoreCase(t))? pc1.display() : "");
                    System.out.println((pc2.type.equalsIgnoreCase(t))? pc2.display() : "");
                    System.out.println((pc3.type.equalsIgnoreCase(t))? pc3.display() : "");
                    System.out.println((pc4.type.equalsIgnoreCase(t))? pc4.display() : "");
                    System.out.println((pc5.type.equalsIgnoreCase(t))? pc5.display() : "");
                }
                if ( num == 2){
                    System.out.println("You want sorted with Operation System Personal Computers");
                    System.out.println("Please input Operation System: ");
                    String op = sc.nextLine();
                    System.out.println((pc1.typeOS.equalsIgnoreCase(op))? pc1.display() : "");
                    System.out.println((pc2.typeOS.equalsIgnoreCase(op))? pc2.display() : "");
                    System.out.println((pc3.typeOS.equalsIgnoreCase(op))? pc3.display() : "");
                    System.out.println((pc4.typeOS.equalsIgnoreCase(op))? pc4.display() : "");
                    System.out.println((pc5.typeOS.equalsIgnoreCase(op))? pc5.display() : "");
                }
                if ( num == 3){
                    System.out.println("You want sorted with price Personal Computers");
                    System.out.println("Please input you're maximum price: ");
                    Integer pr = sc.nextInt();
                    sc.nextLine();
                    System.out.println((pc1.price <= pr)? pc1.display() : "");
                    System.out.println((pc2.price <= pr)? pc2.display() : "");
                    System.out.println((pc3.price <= pr)? pc3.display() : "");
                    System.out.println((pc4.price <= pr)? pc4.display() : "");
                    System.out.println((pc5.price <= pr)? pc5.display() : "");
                }
                if ( num == 4){
                    System.out.println("You want sorted with RAM Personal Computers");
                    System.out.println("Please input you're maximum RAM: ");
                    Integer rm = sc.nextInt();
                    sc.nextLine();
                    System.out.println((pc1.RAM >= rm)? pc1.display() : "");
                    System.out.println((pc1.RAM >= rm)? pc2.display() : "");
                    System.out.println((pc1.RAM >= rm)? pc3.display() : "");
                    System.out.println((pc1.RAM >= rm)? pc4.display() : "");
                    System.out.println((pc1.RAM >= rm)? pc5.display() : "");
                }
                if ( num == 5){
                    System.out.println("You want sorted with Stamps");
                    System.out.println("Please input Stamp: ");
                    String st = sc.nextLine();
                    System.out.println((pc1.stamp.equalsIgnoreCase(st))? pc1.display() : "");
                    System.out.println((pc2.stamp.equalsIgnoreCase(st))? pc2.display() : "");
                    System.out.println((pc3.stamp.equalsIgnoreCase(st))? pc3.display() : "");
                    System.out.println((pc4.stamp.equalsIgnoreCase(st))? pc4.display() : "");
                    System.out.println((pc5.stamp.equalsIgnoreCase(st))? pc5.display() : "");
                }
            }
            else System.out.println("ERROR You input not true value. Please try again");
        }
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



    }
    public Void display(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Type PC : " + type + ", " + "Stamp : " + stamp + ", " + "Diagonal : "
                + diagonal + " inch , "+"Count of Cores : " + countCores + ", " + "RAM : " + RAM
                + " GB, \n" + "Type Hard Disk : "+ typeHDD + ", " +"Hard Disk Capacity : " + hardDiskCapacity
                + " GB, " + "Type Operation System : " + typeOS + ", " +
                "Is price : " + price + " Rub.");
        System.out.println("----------------------------------------------------------------------------------");

        return null;
    }
    /*public Map <String, String > addMap(){
        Map <String, String> a = new HashMap<>();
        a.put(this.type, type);
        a.put(this.stamp, stamp);
        a.put(toString(this.diagonal), toString(diagonal));
        a.put(this.type, type);
        a.put(this.type, type);
        a.put(this.type, type);
        a.put(this.type, type);
        a.put(this.type, type);
        this.diagonal = diagonal;
        this.countCores = countCores;
        this.RAM = RAM;
        this.typeHDD = typeHDD;
        this.hardDiskCapacity = hardDiskCapacity;
        this.typeOS = typeOS;
        this.price = price;
        return a;
    }

    private String toString(double diagonal) {
    }*/
}