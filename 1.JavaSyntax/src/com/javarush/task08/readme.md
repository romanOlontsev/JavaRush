task0801

Утильный класс: часть 1

Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно, 
полученного как параметр. Угол задан в градусах.
В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.

***

task0802

Утильный класс: часть 2

Исправь методы класса Solution, используя класс Math:
sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.

***

task0803

Минимальный элемент массива

В этой задаче тебе нужно:
Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).

***

task0804

Randomizer

В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().

***

task0805

Magic 8 ball

В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, 
который будет работать как шар предсказаний.
Он случайным образом возвращает фразу-ответ на заданный вопрос. 
В методе getPrediction() нужно использовать метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
0 -> Бесспорно
1 -> Определённо да
2 -> Вероятнее всего
3 -> Хорошие перспективы
4 -> Спроси позже
5 -> Попробуй снова
6 -> Мой ответ — нет
7 -> Весьма сомнительно
Иначе вернуть null.

***

task0806

Импорты: Part 1

В классе Solution замени все короткие имена классов в коде на полные.

***

task0807

Импорты: Part 2

В классе Solution замени все полные имена классов в коде на короткие.

***

task0808

Обратный отсчет

В классе Solution в методе countDown() происходит обратный отсчет. Тебе нужно сделать так, 
чтобы между выводом текста в консоль была пауза в 1 секунду. В этом тебе поможет метод sleep(long) класса Thread.

***

task0809

Counter

В классе Solution реализуй метод printNumbers(), который выводит числа от 1 до 10 включительно 
с паузой между выводом каждого числа — 1,3 миллисекунды. В этом тебе поможет метод sleep(long, int) класса Thread.

***

task0810

Таймер

В классе Solution реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время, 
используя соответствующие методы java.util.concurrent.TimeUnit.

***

task0811

Побитовые операции

Закомментируй ненужные строки кода, чтобы на экран вывелась цифра 5.
Примечание: нужно закомментировать только две строки.

***

task0812

Swap по-новому

В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
Можно использовать только операции:
Исключающее или.
Присваивание.
Исключающее или с присваиванием.
Не оставляй комментарии, не меняй остальной код.

***

task0813

Степень двойки

Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.

***

task0814

Флаги

Реализуй методы:
setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number 
и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number 
и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, 
если значение "1" и false, если "0".

***

task0815

Логические операторы

Внеси исправления в метод taskForCondition(), чтобы он выводил в консоли число 30. 
Изменять можно только логические операторы: && на & и || на |.

***

task0816

Приоритеты

Внеси исправления в метод main(), чтобы он выводил в консоли число 12.

***

task0817

Инкременты

Внеси исправления в метод main(), чтобы он выводил в консоли число 20.
В методе можно изменять только постинкремент на преинкремент и наоборот, 
а также постдекремент на предекремент и наоборот.
