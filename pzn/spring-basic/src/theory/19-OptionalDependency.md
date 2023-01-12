# Optional Dependency
- Secara default, semua dependency itu wajib.
- Artinya jika Spring tidak menemukan bean yang dibutuhkan pada saat Di Inject
    maka secara otomatis akan terjadi error.
- Namun jika kita memang ingin membuat sebuah dependency menjadi Optional, artinya tidak wajib
- Kita bisa warp dependency tersebut dengan menggunakan java.util.Optional<T>
- Secara otomatis jika ternyata bean yang dibutuhkan tidak ada, maka tidak akan terjadi error.
- Kita bisa gunakan Optional<T> pada @Bean (method parameter) ataupun @Componenet
    (constructor parameter, setter method parameter, dan field.)
- src:
    src\main\java\adexrepo\springbasic\config\OptionalConfiguration.java
    src\test\java\adexrepo\springbasic\OptionalTest.java

# Object Provider
- Selain menggunakan java.util.Optional<T>, kita juga bisa menggunakan ObjectProvider<T>
- Yang [membedakan] pada Object Provider<T> adalah jika ternyata bean nya lebih dari satu,
    ObjectProvider<T> bisa digunakan untuk mengambil semua bean tersebut.
- ambil primarynya atau ambil semua kandidat nya. sedangkan kalo obtional cuman 1
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/ObjectProvider.html 
- Object Provider ini sudah ada sebelum java 8, java 8 itu lahirnya Optional
- src:
    src\main\java\adexrepo\springbasic\config\ComponentConfiguration.java
    src\main\java\adexrepo\springbasic\data\MultiFoo.java
    src\main\java\adexrepo\springbasic\config\configuration\FooConfiguration.java
    src\test\java\adexrepo\springbasic\ComponentTest.java