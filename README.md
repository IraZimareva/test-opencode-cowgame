# Тестовое задание в компанию OpenCode
**Игра бык-корова с web интерфейсом**

Компьютер загадывает 4-х значное число. Цифры загаданного числа не
повторяются. Задача пользователя угадать загаданное число. У
пользователя неограниченное число попыток. В каждую попытку
пользователь дает компьютеру свой вариант числа. Компьютер сообщает
сколько цифр точно угадано (бык) и сколько цифр угадано без учета
позиции (корова). По ответу компьютера пользователь должен за
несколько ходов угадать число.

Пример:  
7328 -- загаданное число  
0819 -- 0Б1К  
4073 -- 0Б2К  
5820 -- 1Б1К  
3429 -- 1Б1К  
5960 -- 0Б0К  
7238 -- 2Б2К  
7328 -- 4Б0К (число угадано) 

Стартовый url 
GET .../users/1

**Стек технологий** <br>
Backend: Java8, H2 database, Hibernate, SpringBoot <br>
Frontend: HTML, Bootstrap, Thymeleaf 

