# Startup Failure
- Salah satu yang menarik di SpringBoot adalah Spring Boot memiliki fitur FailureAnalyzer.
- FailurAnalyzer digunakan untuk melakukan analisa ketika terjadi [error] startup
    yang menyebabkan aplikasi tidak mau berjalan.
- Spring sudah menyediakan banyak sekali class implementasi FailurAnalyzer yang bisa
    mempermuda kita menganalisa kesalahan ketika terjadi startup failure
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/diagnostics/FailureAnalyzer.html 

- src:
    src\test\java\adexrepo\springbasic\application\WithoutSpringBootTest.java