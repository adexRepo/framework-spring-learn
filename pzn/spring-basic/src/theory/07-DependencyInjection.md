# Dependency Injection
- Saat kita membuat object, sudah pasti kita sering membuat object yang tergantung dengan object lain.
- Dependency Injection (DI) adalah teknik dimana kita bisa mengotomatisasi proses pembuatan
    object tergantung dengan object lain, atau kita sebut dependencies.
- Dependencies akan secara otomatis [di-inject] (dimasukkan) ke dalam object yang membutuhkannya.
- Spring Framework sejak awal dibilang sebuah framework IoC yang memang cara kerjanya
    menggunakan Dependency Injection.

# Without Dependency Injection
- Tanpa Dependency Injection aplikasi tetap bisa dibuat, namun saat relasi antar dependencies sudah kompleks
    akan sangat lama untuk membuat nya, ribet, karena harus manual.
- Oleh karena itu, penggunaan Dependency Injection framework seperti Spring sangat membantu sekali.
- example:
    src\main\java\adexrepo\springbasic\data\FooBar.java
    src\test\java\adexrepo\springbasic\DependencyInjectionTest.java
- imagine if Foo need 5 dependency and bar need 5 dependency also, and Foobar not just need Foo and Bar
    too Arrhhh for making manualy, that's why need

# Spring Dependency Injection
- Spring sejak awal dikenal dengan framework untuk Dependency Injection.
- Ketika kita membuat method untuk bean di Spring, kita bisa menambahkan parameter.
- Secara otomatis Spring akan [mencarikan] bean lain yang sesuai dengan tipe parameter tersebut.
- Jika ternyata [tidak] ada bean yang cocok, maka secara [otomatis] akan terjadi error,
    dan jika ternyata terdapat bean [lebih] dari satu, secara [otomatis] akan terjadi error juga,
    kecuali terdapat primary bean.
- example:
    src\main\java\adexrepo\springbasic\config\DependencyInjectionConfiguration.java
    src\test\java\adexrepo\springbasic\DependencyInjectionTest.java