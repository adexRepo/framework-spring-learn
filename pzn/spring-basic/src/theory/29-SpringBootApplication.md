# Spring Boot Application
- Sebelumnya kita selalu membuat ApplicationContext secara manual,
    dan kita belum menggunakan fitur otomatis SpringBoot.
- Hal ini agar tau cara kerja spring seprti apa.
- Pada saat membuat aplikasi Spring Boot, kita akan mengganti @Configuration
    utama menjadi @SpringBootApplication
- Isi dari @SpringBootApplication itu sendiri sebenarnya gabungan dari
    @Configuration dan banyak hal lain, sperti contohnya @ComponentScan
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html 

- src
    src\main\java\adexrepo\springbasic\application\FooApplication.java

# Spring Application
- Selain @SpringBootApplication, untuk membuat Application Context nya,
    kita tidak perlu membuat manual, kita bisa menggunakan class SpringApplication
- Secara otomatis [SpringApplication] akan [membuat] [ApplicationContext] dan melakukan
    hal-hal yang dibutuhkan secara [otomatis].
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html
- src:
    src\main\java\adexrepo\springbasic\application\FooApplication.java

# Spring Boot Test
- Untuk membuat unit test di Spring Boot, kita bisa menggunakan annotation
    @SpringBootTest(class={YourConfiguration.class})
- Selanjutnya kita tidak perlu lagi mengambil bean secara manual menggunakan ApplicationContext,
    kita bisa menggunakan DI secara langsung di unit test nya menggunakan @Autowired
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/SpringBootTest.html 
- src:
    src\test\java\adexrepo\springbasic\FooApplicationTest.java