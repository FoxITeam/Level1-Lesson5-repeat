package ru.foxit.grayfox;

import java.text.MessageFormat;

/**
* todo | Что такое объект - объект это предмет, если класс это чертеж машины, данной модели, то данная модель машины тойота камри - это вполне себе автомобиль, который
* todo | едет по улице, у него есть свой номер, он поехал - это объект - Собранный объект класса! Уже собран по чертежу!
* todo | Каждый объект имеет состояние и поведение, то есть тойота камри, 5 летний тойота камри с двигателем 2 литра.
* todo | У каждого этого тойота камри (у каждого объекта) в баки может быть разное кол-ва топлива, но при этом они все являются объектом 1 класса, хотя и разными объектами.
* todo | Каждый объект имеет свой уникальный адрес в памяти, объект является экземпляром класса (new).
*/
public class Main {
    public static void main(String[] args) {
        // Создадим экземпляр нашего класса!
        // Создание объекта выглядит следующим образом, выше я скопировал инфу про объект!
        Car logan = new Car(); // Объявления переменной типа объекта, знак присваивания, оператор new, и соответственно класс с круглыми скобками.
        Car lancer = new Car(); // То-есть Car название класса, lancer переменная (это переменная которая содержит ссылку на объект с ссылкой на объект Car), new (оператор который создает объект) - экземпляр класса, Car() название класса.
        // Вот например Player player = new Player();
        // Мы обращаемся к классу Player, создаем переменную player и создаем экземпляр класса Player(), чтобы воспользоваться возможностями класса Player(), которые написали ранее за нас программисты.
        // Данная запись Car logan = new Car(); а именно Car() - Вызов конструктора по умолчанию.

        // Чтобы получить доступ к полям объекта, набираем:
        //logan.
        logan.setModel("Logan");
        logan.setYear(2004);
        logan.setColor("White");
        // Вот мы задали индивидуальные значения, теперь она выглядит индивидуально!

        // Аналогия 1
        lancer.setModel("Lancer");
        lancer.setYear(2005);
        lancer.setColor(null);

        // Аналогия 2
        Car lada = new Car("Vesta");
        //System.out.println(lada.carModel("Vesta"));

        Car honda = new Car("Civic", 2010, "Block");

        // Можем вот так создать метод в классе Car, написать переменную lancer и вызвать метод printInfo.
        lancer.printInfo();
        lada.printInfo();
        honda.printInfo();


        //* todo | Класс MessageFormat и его статический метод format позволяет подставлять аргументы
        //* todo | переданные в данный метод. Данный метод формат уже принимает 2 аргумента (строку Pattern и имя str)
        //* todo | Pattern = шаблон, это шаблон проектирования или паттер проектирования.
        // Используем Format
        String pattern = "Наша марка машины {0}, год выпуска {1}, цвет машины {2}";
        System.out.println(MessageFormat.format(pattern, logan.getModel(), logan.getYear(), logan.getColor()));
        System.out.println(MessageFormat.format(pattern, lancer.getModel(), lancer.getYear(), lancer.getColor()));
        System.out.println(MessageFormat.format(pattern, honda.getModel(), honda.getYear(), honda.getColor()));
    }
}
