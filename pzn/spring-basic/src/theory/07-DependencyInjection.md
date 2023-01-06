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

# Memilih Dependency
- Kadang kita menggunakan Dependency Injection, ingin memilih object yang ingin digunakan.
- Saat terdapat duplicate bean dengan tipe data yang sama, secara otomatis Spring akan memilih
    bean yang primary.
- Namun kita juga bisa memilih secara manual jika memang kita inginkan.
- Kita bisa menggunakan annotation [@Qualifier(value="namaBean")] pada paramater di methodnya.
- Saat ada kata primary maka default nya jika ada method yang butuh bean tersebut tapi duplicate
    maka akan manggil bean dengan annotation primary tersebut. Tapi, jika ada annotation Qualifier
    pada sebuah paramter yang butuh bean tapi beannya ternyata duplikat type maka primary tidak
    lagi dpanggil melainkan yang dipanggil adalah yang ada di qulifier.
- Kyk gini hitunggannya [MANUAL]