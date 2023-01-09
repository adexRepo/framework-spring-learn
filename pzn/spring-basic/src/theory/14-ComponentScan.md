# Component Scan
- Import adalah hal yang sangat menarik, karena kita bisa memecah Configuration Class menjadi banyak class.
- Namun semakin lama, pasti aplikasi kita akan semakin besar, dan secara otomatis Configurasi
    Class nya akan semakin banyak.
- Melakukan import satu per satu sudah tidak menyenangkan lagi jika terlalu banyak.
- Spring memiliki fitur [component] [scan], dimana kita bisa secara [otomatis][mengimport]
    Configuration [di] sebuah [package] dan [subpackage] nya secara [otomatis].
- Untuk melakukan itu, kita bisa menggunakan annotation [@ComponenScan]
- lengkapnya:
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/ComponentScan.html 

src:
    src\test\java\adexrepo\springbasic\ScanTest.java

# Component
- Sebelumnya kita sudah belajar membuat bean menggunakan method di configuration dengan annotation @Bean
- Spring juga menyediakan cara yang lebih otomatis lagi, tanpa harus kita membuat method @Bean
- Kita bisa menandai sebuah class dengan annotation @Component, secara otomatis Spring akan membuatkan bean
    untuk class tersebut.
- @Component hanya mendukung pembuatan satu bean, jadi jika kita ingin membuat beberapa bean
    dengan tipe yang sama, kita tetap harus menggunakan @Bean method.

# Component Bean Name
- Saat kita menggunakan @Component, nama bean akan dibuatkan secara otomatis oleh Spring.
- Jika kita ingin menggunakan @ComponentScan yg otomatis, bean name secara otomatis akan menggunakan
    nama class namun menjadi camelCase, misalnya CategoryService menjadi categoryService,
    class ProductGame menjadi productGame.
- Jika kita menggunakan @Import, secara otomatis bean name akan menjadi NamaClass.class.getName()
- Namun jika ingin membuat nama berbeda, kita juga bisa gunakan @Component(value="namaBean")

// belum test