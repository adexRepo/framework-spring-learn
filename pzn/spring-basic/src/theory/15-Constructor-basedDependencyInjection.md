# Dependency Injection
- Sebelumnya untuk melakukan Dependency Injection di @Bean, kita bisa menambah parameter di methodnya.
- Secara otomatis Spring akan memilih bean mana yang cocok untuk parameter tersebut.
- Bagaimana jika menggunakan @Component? apakah bisa? seperti theory 07-DependencyInjection.md
- Untuk @Component kita bisa melakukan beberapa cara untuk Dependency Injection nya.

# melalui Constructor
- Pertama yang bisa kita lakukan untuk Dependency Injection di @Component adalah menggunakan constructor parameter.
- kita bisa menambahkan constructor yang memiliki parameter jika membutuhkan bean lain.
- Secara otomatis [Spring] akan mencarikan bean yang dibutuhkan, dan ketika membuat bean @Component,
    Spring akan menggunakan bean yang dibutuhkan di constructor.
- Constructor-based Dependency Injection hanya mendukung satu constructor, jadi pastikan kita 
    hanya membuat satu constructor.
- src:
    src\test\java\adexrepo\springbasic\ComponentTest.java

# Multiple Constructor
- Seperti diawal disebutkan bahwa Spring hanya mendukung satu constructor untuk Dependency Injection nya.
- Namun bagaimana jika terdapat multiple constructor??
- solusinya kita harus menandai constructor mana yang akan digunakan oleh Spring
- Caranya kita bisa menggunakan annotation @Autowired