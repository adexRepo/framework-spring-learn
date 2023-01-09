# Import
- Saat nanti kita membuat aplikasi, tidak mungkin kita hanya akan membuat satu Configurasi Class.
- Biasanya kita akan membuat banyak sekali, tergantung seberapa kompleks aplikasi kita.
- Spring mendukung import Configurasi Class lain jika dibutuhkan.
- Kita bisa menggunakan annotation [@Import], lalu sebutkan Configurasi Class mana yang ingin diimport.
- Ketika kita melakukan import, kita bisa import lebih dari satu class.
- lengkapnya:
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Import.html

- src
    src\main\java\adexrepo\springbasic\config\configuration\FooConfiguration.java
    src\main\java\adexrepo\springbasic\config\configuration\BarConfiguration.java
    src\main\java\adexrepo\springbasic\config\MainConfiguration.java
    src\test\java\adexrepo\springbasic\ImportTest.java