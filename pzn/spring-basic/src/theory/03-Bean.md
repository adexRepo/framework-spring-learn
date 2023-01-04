# Bean
- Saat sebuah object kita masukkan kedalam Spring Container, IoC, maka kita sebut object tersebut adalah Bean.
- Secara [default], bean merupakan [singleton], artinya jika kita mengakses bean yang sama,
    maka dia akan mengembalikan object yang sama. Kita juga bisa mengubahnya jika tidak ingin singleton.

# Create Bean
- Untuk membuat bean, kita bisa membuat sebuah method di dalam class Configuration.
- Selanjutnya nama method tersebut akan menjadi nama bean nya, dan return objectnya menjadi object bean nya.
- Method tersebut perlu kita tambahkan annotation [@Bean], untuk menandakan bahwa itu adalah bean.
- Secara [otomatis] Spring akan [mengeksekusi] method tersebut, dan return value nya akan dijadikan
    object bean secara otomatis, dan [disimpan] di container IoC.

# How to access Bean
- Setelah membuat bean, secara otomatis object akan di manage oleh Application Context.
- Untuk mengakses bean, kita bisa menggunakan method getBean milik Application Context.
- Perlu diingat bahwa Bean ini akan diakses [pertama] kali lalu hasil return nya [dimasukkan] kedalam IoC,
    artinya saat application context kita buat, maka saat itu bean sudah ada didalam application context.

# Path example:
- src\main\java\adexrepo\springbasic\data\Foo.java
- src\main\java\adexrepo\springbasic\config\BeanConfiguration.java