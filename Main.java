import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS", 8, 240, "WINDOWS", "Золотой");
        Laptop laptop2 = new Laptop("APPLE", 4, 120, "MAC OS", "Бронзовый");
        Laptop laptop3 = new Laptop("SONY", 8, 240, "WINDOWS", "Золотой");
        Laptop laptop4 = new Laptop("DELL", 16, 480, "WINDOWS", "Серебряный");
        Laptop laptop5 = new Laptop("YANDEX", 2, 120, "LINUX", "Бронзовый");
        Laptop laptop6 = new Laptop("SAMSUNG", 16, 240, "WINDOWS", "Платиновый");
        boolean check = true;
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        System.out.println("Здравствуйте, в наличии имеются следующие ноутбуки:");
        for (Laptop laptop: laptops){
            System.out.println(laptop);
        }
        while (check){
            System.out.println("По какому параметру желаете произвести отбор?:");
            System.out.println("1 - Объём ОЗУ.");
            System.out.println("2 - Объём ПЗУ.");
            System.out.println("3 - ОС.");
            System.out.println("4 - Цвет.");
            System.out.println("5 - Выход.");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    List<Integer> list = new ArrayList<>();
                    System.out.println("В наличии следующие объёмы ОЗУ:");
                    for (Laptop laptop: laptops){
                        if (!list.contains(laptop.getValueRAM())){
                            list.add(laptop.getValueRAM());
                        }
                    }
                    for (int i = 1; i <= list.size(); i++ ){
                        System.out.println(i + " - " + list.get(i - 1));
                    }
                    System.out.print("Выберите подходящий объём: ");
                    number = scanner.nextInt();

                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    check = false;
                    break;
            
                default:
                    break;
            }
            

        }

        
    }
}