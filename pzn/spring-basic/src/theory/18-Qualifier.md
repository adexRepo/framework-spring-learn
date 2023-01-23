# Qualifier
- Seperti yang sudah dijelaskan diawal, jika terdapat [bean] dengan tipe data yang sama
    lebih dari satu, maka secara otomatis Spring akan bingung memilih bean mana yang akan
    digunakan.
- Kita perlu memilih salah satu menjadi primary, yang secara otomatis akan dipilih oleh Spring
- Namun jika kita ingin memilih bean secara manual, kita juga bisa menggunakan [@Qualifier] atau di field.
- src:
    src\test\java\adexrepo\springbasic\ComponentTest.java
    src\main\java\adexrepo\springbasic\service\CustomerService.java
    src\main\java\adexrepo\springbasic\repository\CustomerRepository.java
    src\main\java\adexrepo\springbasic\config\configuration\CustomerConfiguration.java