task1401

Поработай обработчиком

Для начала разберись, что делает программа, а затем:

1. В методе addUser обработай значение, возвращаемое методом setName:

        если setName вернул -1, выведи сообщение: "Имя не может быть null."
       
        если -2, выведи сообщение: "Имя не может быть пустым."

        если -3, выведи сообщение: "Имя не может содержать цифры."

        если другое значение, кроме 0, выведи сообщение: "Неизвестная ошибка."

2. В методе addUser обработай значение, возвращаемое методом setAge:

        если setAge вернул -1, выведи сообщение: "Возраст не может быть меньше 0."

        если -2, выведи сообщение: "Возраст не может быть больше 150."

        если другое значение, кроме 0, выведи сообщение "Неизвестная ошибка."

3. В методе findUserIndex обработай значение, возвращаемое методом indexOf:

        если indexOf вернул -1, выведи сообщение "Пользователь '<имя пользователя>' не найден."

        иначе — оставь текущее сообщение

4. Класс User не изменяй.

***

task1402

Помощник преподавателя

Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
Но есть проблема: если в журнале нет студента с нужным номером, программа завершается с исключением 
ArrayIndexOutOfBoundsException. Оберни одну строку в try-catch, чтобы программа продолжала работать.
В блоке catch выведи в консоли сообщение "Студента с таким номером не существует".

***

task1403

Помощник преподавателя-2

Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать. И даже 
обрабатывает некорректные числа.
Но есть еще одна проблема: если введено не целое число, метод parseInt бросает NumberFormatException. Оберни часть кода 
в try-catch так, чтобы программа продолжала работу, даже если было введено не целое число. И если введено не целое 
число, выведи в консоль сообщение: "Нужно ввести целое число" и выполни continue; для корректной работы цикла.

***

task1404

Помощник преподавателя-3

Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
Методы parseInt и get могут бросать исключения NumberFormatException и ArrayIndexOutOfBoundsException. Оберни их одним 
блоком try с двумя блоками catch.
Блок catch для NumberFormatException должен выводить сообщение: "Нужно ввести целое число", а блок catch для 
ArrayIndexOutOfBoundsException должен выводить сообщение: "Студента с таким номером не существует".

***

task1406

Купи слона

Разберись, что делает программа.
В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение.

***

task1407

Еда едой, а сон по расписанию

Запусти программу и посмотри, что происходит.
В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему не удалось перекусить.

Ожидаемый вывод в случае, когда food != null:

    ищет еду
    нашел мясо
    все съел
    лег спать

Ожидаемый вывод когда food == null:

    ищет еду
    ничего не нашел
    лег спать голодным

***

task1408

Проглатываем исключение

Перехвати исключение в методе main, чтобы программа компилировалась.
При возникновении исключения нужно вывести на экран строку errorMessage.

***

task1409

Пропускаем сквозь себя

Сделай так, чтобы программа компилировалась, не используя try-catch.

***

task1410

Оборачивание исключений

В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
Перехваченные исключения оберни в RuntimeException и пробрось дальше.

***

task1411

Распаковка исключений

В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
Если это FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.", а если FileSystemException — 
"Не удалось записать в файл.".

***

task1412

Группировка исключений

Объедини блоки catch с одинаковым кодом.

***

task1413

Лонг дринк

При запуске программа заканчивается исключением. Но из текста исключения в консоли неясно, где оно возникло. В этой 
задаче тебе нужно:

        обернуть в try-catch код методов addIce, addVodka, addJuice и addOrange;
        в блоках catch вызвать метод printBugMethodName и передать в него stack trace.

Если сделаешь все правильно, при запуске программы на экран выведутся имена методов, в которых возникает исключение.

***

task1414

Готовим коктейли

Метод printStackTrace принимает в качестве параметра массив stackTrace. Нужно вывести информацию о каждом элементе 
массива в формате:
"Метод <имя метода> вызван из строки <номер строки> класса <имя класса> в файле <имя файла>."
Информацию о каждом элементе выводи с новой строки.

Пример:

        Метод addJuice вызван из строки 24 класса com.javarush.task.pro.task14.task1414.Solution в файле Solution.java.
        
***

task1415

Стек в домашних условиях

В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе ArrayList.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные методы класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage. Метод pop() возвращает первый элемент списка storage, 
а потом удаляет его из этого списка. Метод peek() возвращает первый элемент списка storage.
Метод empty() проверяет, не пустой ли список storage. Метод search(String) ищет элемент в списке storage и возвращает 
его индекс. Если элемента нет в списке — возвращает -1.

***

task1416

Логирование стектрейса

В методе main перехвати исключение и выведи его стектрейс.