# language: ru
@testEmpty
Функция: Ввод текста в поле поиска яндекса и нажатие кнопки найти без запроса

Сценарий: Пустой поиск
    Дано пользователь заходит на сайт яндекса и ничего "" не ввёл в строку поиска
    Когда пользователь нажимает на кнопку найти с пустой строкой поиска
    Тогда на экран выводится сообщение "Задан пустой поисковый запрос"