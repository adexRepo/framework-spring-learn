# Application Context
- ApplicationContext adalah sebuah interface representasi container IoC di Spring.
- ApplicationContext adalah inti dari Spring Framework.
- ApplicationContext banyak sekali class implementasinya, secara garis besar dibagi menjadi 2 jenis,
    implementasi XML dan Annotation.
- Pada versi Spring 3, XML masih menjadi pilihan utama, namun sekarang sudah banyak orang beralih dari XML
    ke Annotation, bahkan Spring Boot pun merekomendasikan menggunakan Annotation untuk membuat aplikasi Spring.
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html 

# Create Configuration
- Untuk membuat ApplicationContext menggunakan Annotation, pertama yang perlu dibuat adalah Configuration class.
- Configuration Class adalah sebuah class yang terdapat annotation @Configuration pada class tersebut.
- example: src\main\java\adexrepo\springbasic\config\HelloWorldConfiguration.java

# Create Application Context
- Selanjutnya, setelah membuat Class Configuration, kita bisa menggunakan class AnnotationConfigApplicationContext
    untuk membuat Application Context.
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/AnnotationConfigApplicationContext.html 
- example: src\test\java\adexrepo\springbasic\ApplicationContextTest.java