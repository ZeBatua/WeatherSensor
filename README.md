# Датчик погоды (Rest API)

## Введение
В этом проекте будет сымитирована работа датчика погоды, двумя основными функциями которого являются
считывания показаний температуры и отслеживание дождя (идет или нет).
Проект разделен на 2 части (модуля). Первая - Rest API часть (backend).
Вторая - клиентская часть, посылающая запросы.

## Задачи

1) Создание REST API приложения с помощью Spring REST
2) Создание Java клиента, который бы отправлял данные на
   REST API приложение - с помощью класса RestTemplate.

## Стек технологий 
1) Spring (Rest, Web, Boot, JPA, Core)
2) Model mapper (быстрый свап данных из подобных классов)
3) Validator (валидация данных)
4) XChart (отрисовка графика)
5) JSON/Jackson (контейнеризация объектов между микросервисами)
6) PostgreSQL

## Запуск
1)  Запустите RestAPI_Service/src/main/java/rest/app/WeatherSensorRestApiApplication.java для старта сервера.
2)  Запустите SensorClient/src/main/java/sensor/client/Client.java, чтобы зарегистрировать датчик и считать показания.
3)  Запустите SensorClient/src/main/java/sensor/client/DrawGraph.java, чтобы нарисовать график данных.
4)  Следуйте комментариям в Client.java, чтобы регистрировать новые сенсоры и изменять количество измерений.