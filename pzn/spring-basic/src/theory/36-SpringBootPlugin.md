# Spring Boot Plugin
- Saat kita membuat project Spring Boot, secara otomatis terdapat spring-boot-plugin
    di project maven kita
- Plugin ini bisa digunakan untuk mempermudah kita saat menjalankan aplikasi Spring kita
- Kita bisa gunakan perintah:
    mvn spring-boot:run
- Untuk menjalankan SpringBoot kita, kita harus pastikan bahwa hanya ada 1 main class
- running di command-promnt

-- disini saya comment beberapa file yang ada main methodnya
note: ini hanya untuk development saat di production/live harus pakai distribution file

# Distribution File
- Spring boot plugin juga sudah menyediakan cara membuat distribusi file aplikasi kita
- Plugin ini akan mendeteksi main class di project kita, lalu membundle aplikasi kita
    beserta dependency yang dibutuhkan dalam satu file jar
- Pastikan hanya terdapat satu main class, karena jika lebih dari satu, maka spring boot
    plugin akan melakukan complaint
- Kita cukup gunakan perintah:
    mvn package
- Secara otomatis akan terbuat single jar application
- bisa di check di target disitu ada snapsot.jar
- cara runningnya:
    java -jar target/spring-basic-0.0.1-SNAPSHOT.jar 
    java -jar target/spring-basic-0.0.1-SNAPSHOT.jar --profiles=adek --profiles=joni


