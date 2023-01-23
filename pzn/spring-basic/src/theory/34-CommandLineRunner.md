# Command Line Runner
- Saat kita membuat aplikasi, kadang kita butuh argument yang diberikan pada main method.
- Spring Application bisa mengirim data argument tersebut secara otomatis ke bean yang kita buat.
- Kita hanya butuh membuat bean dari CommandLineRunner.
- CommandLineRunner Secara otomatis akan dijalankan ketika Spring Application berjalan.
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/CommandLineRunner.html
- src:
    src\main\java\adexrepo\springbasic\comandapp\CommandApplication.java
    src\main\java\adexrepo\springbasic\comandapp\LogCommandLineRunner.java