# coffee-maker
The program for the operation of a coffee-maker and controlled through a browser.

Для запуска программы:

1)Поднимите базу данных PostgreSQL;


2)Сделайте сборку проекта (mvn clean package), проект будет находиться в папке target с названием coffee-maker-0.0.1-SNAPSHOT.jar;


3)Запустите приложение (при использовании консоли, зайдите в папку с файлом .jar и выполните команду java -jar -DDB_URL=(адрес вашей базы данных PostgreSQL) -DDB_USERNAME=(логин вашей базы данных PostgreSQL) -DDB_PASSWORD=(пароль вашей базы данных PostgreSQL) coffee-maker-0.0.1-SNAPSHOT.jar

(Пример: java -jar -DDB_URL=jdbc:postgresql://localhost:5432/postgres?currentSchema=coffeemaker -DDB_USERNAME=postgres -DDB_PASSWORD=postgres coffee-maker-0.0.1-SNAPSHOT.jar).
