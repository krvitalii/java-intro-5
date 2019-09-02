package lesson04;

import java.util.*;

public class Collection1 {
    public static ArrayList<String> list = new ArrayList<String>(Arrays.asList("cat", "dog", "mouse", "bug", "bird", "lion"));

    public static void printList(String message) {
        System.out.println(message + ": " + String.join(", ", list));
    }

    public static void outList(String message) {
        System.out.print(message + ":");
        list.forEach(item -> System.out.print(" " + item));
        System.out.println();
    }

    public static void main(String[] args) {
        printList("Initial list");
        list.remove("bug");
        printList("List after deletion 'bug'");
        System.out.println();
        outList("List before sorting");
        Collections.sort(list);
        outList("List after sorting");
/*
        1. Создать программу, в которой:
        1.1. Формируется коллекция из строк типа ArrayList (5-6 строк)
        1.2. Из коллекции удаляется одно из значений
        1.3. Выполняется проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
        1.4. Выполняется сортировка объектов коллекции (Collections class в помощь)
        1.5. Выполняется поочередный вывод строк в консоль до сортировки и после (Iterator class в помощь)
        2. Закоммитить изменения и добавить их в репозиторий на GitHub.
        3. Прислать ссылку на репозиторий.
*/
    }
}
