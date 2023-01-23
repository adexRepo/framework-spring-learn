# Field-based Dependency Injection
- Selain constructor dan setter, kita juga bisa melakukan dependency injection
    langsung menggunakan fieldnya.
- Caranya sama dengan setter, kita bisa tambahkan @Autowired pada fieldnya
- Secara otomatis Spring akan mencari bean dengan tipe data tersebut.
- Field-based DI bisa digabung sekaligus dengan Setter-based DI dan Constructor-based DI.
- Khusus Field-based DI, Spring sendiri sudah [tidak][merekomendasikan] penggunaan
    cara mealukan DI dengan field.
- src:
    src\main\java\adexrepo\springbasic\service\CustomerService.java
    src\main\java\adexrepo\springbasic\repository\CustomerRepository.java

- sudah tidak direkomendasikan lagi!!