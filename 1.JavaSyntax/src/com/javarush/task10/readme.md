task1001

Создадим небоскреб

Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли. Для этого тебе нужно 
вызвать конструктор класса Skyscraper в методе main и в теле конструктора вывести в консоль текст "Небоскреб построен.".

***

task1002

Построим новый жилой комплекс JavaRush Towers

Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:

1.Объявляет о результате постройки.
2.Объявляет о результате и указывает количество этажей.
3.Объявляет о результате и указывает застройщика.

Пример вывода:
Небоскреб построен
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment

Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.

***

task1003

Построим новый бизнес-комплекс JavaRush Business Center

Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить, а второй — на 
этапе планирования, поэтому о нем мало что известно.
Тебе нужно будет создать два конструктора: один с параметрами, второй — без. Они оба должны инициализировать поля 
floorsCount и developer.

***

task1004

Жажда скорости

Почувствуй себя автоконструктором и найди решение, как сделать так, чтобы завод снова заработал. Для этого тебе нужно 
добавить инициализацию полей в конструкторах соответствующими параметрами. Если параметр отсутствует, то нужно 
инициализировать поле значением по умолчанию. Для поля year это текущий год (4321), для поля color — Оранжевый.

***

task1005

Многосерийный предприниматель

Постройка здания планировалась под ресторан и успешно завершилась, но спустя некоторое время собственники решили 
переделать его под барбершоп. Нам нужно сделать так, что бы здание было универсальным, и его назначение можно было 
менять, не создавая нового.
Для этого создай метод initialize, который будет устанавливать значение полю type (определять тип здания), а конструктор 
убери.

***

task1006

Кто тут наследник?

Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя), 
используя super("тип автомобиля"). Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и 
ElectricCar.

Вывод должен быть следующий (последовательность может быть любая):
Привет. Я ElectricCar
Привет. Я GasCar
Привет. Я HybridCar

***

task1007

С крышей или без? Вот в чем вопрос

Ты сделал предзаказ на новенькую Bugatti ровно полгода назад. Сейчас июнь, и было бы неплохо все-таки ездить на 
кабриолете. Но ты забыл, в каком кузове заказывал машину.
Твоя задача — добавить функциональность для получения текущей конфигурации и изменения её при необходимости. Для этого 
создай геттеры и сеттеры.

***

task1008

Зарплата

У нас есть класс Programmer, в котором есть очень важное поле — salary. Наша задача следующая: нужно добавить 
возможность получить и изменить значение этого поля, используя геттер и сеттер.
Но есть нюанс: зарплату можно только повышать. Поэтому тебе нужно добавить проверку в сеттер: если значение аргумента 
больше текущего значения, то поле salary изменяем, иначе — игнорируем.

***

task1009

Сравнение строк

В методе main объявлены переменные типа String. В консоли выводится результат их сравнения: если строки равны, выводится 
true, иначе — false. Тебе нужно раскомментировать одну строку, чтобы получился следующий вывод:
true
true

Тело метода main менять нельзя: можно только раскомментировать одну строку.

***

task1010

Два айфона

В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был 
положительным. Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

***

task1011

Создаем свой hashCode

Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые, то должен 
возвращаться одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
true
true
true
true
false
false

***

task1012

Дефрагментация памяти

Рассмотрим аналог памяти компьютера на примере массива строк. Если удалить некоторые элементы, то в массиве появятся так 
называемые "дыры" - то есть элементы равные null. Метод executeDefragmentation(String[]), принимающий массив строк, 
выполняет его "дефрагментацию", то есть перемещает все объекты в начало массива в таком же порядке, передвинув все 
"дыры" (элементы равные null) в конец массива. В этой задаче тебе нужно реализовать метод 
executeDefragmentation(String[]). Метод main() можешь использовать для проверки результата работы метода 
executeDefragmentation(String[]).

***

task1013

Расставь правильно этажи

В алгоритме работы отельного лифта прописано: чтобы подняться с третьего этажа на шестой, нужно проехать до четвертого, 
затем — до пятого и, наконец, — до шестого.
Но в нашей программе все этажи перепутались! Поэтому сейчас класс Hotel не компилируется. Расставь поля класса в таком 
порядке, чтобы он компилировался и лифт ехал правильно.

***

task1014

Купи 10 батонов

Тебя отправили в магазин за покупками и сказали, что нужно купить батон, а если будут яйца, то взять десять штук.
Разберись, почему метод makePurchases независимо от переданных аргументов всегда выводит в консоль "Купил 10 батонов", 
и исправь его.
Метод main не участвует в проверке.

***

task1015

Ежик и яблоко

Наша задача — накормить ежика. Нужно в методе main создать один объект Apple и один объект Hedgehog, у которого вызвать 
метод eat и передать нужный аргумент — яблоко.

***

task1016

Прогноз погоды

У класса City есть два поля - название города и текущая температура воздуха. Также в классе Solution есть метод 
showWeather: он выводит в консоли информацию о погоде в городе, который передан в качестве аргумента метода. Реализуй 
метод showWeather, который должен выводить в консоли информацию в таком формате: В городе "название города" сегодня 
температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40

***

task1017

Создание материков

Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс. В каждом классе должно 
быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.

***

task1018

Геттер и сеттер в деле

В классе Coordinate есть 2 геттера и 2 сеттера, но значения переменным сеттеры не устанавливают.
Разберись, почему так происходит и исправь. Метод main не участвует в проверке.

***

task1019

Текущий год

В классе Solution есть поле currentYear, которое должно инициализироваться значением текущего года
(Calendar.getInstance().get(Calendar.YEAR)) при создании нового объекта типа Solution.
Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса Solution поле currentYear 
правильно инициализировалось.

***

task1020

Собираем компьютер

Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь. В классе компьютер в 
конструкторе создай объекты классов-составляющих компьютера.

***

task1021

Давай создадим каталог новых моделей авто у нас на производстве. Для этого нам нужно создать один метод initialize, 
который будет инициализировать такие поля объекта типа Car: модель, год выпуска, цвет.