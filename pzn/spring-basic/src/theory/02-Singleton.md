# Singleton
- Singleton adalah salah satu Design Pattern Creational untuk pembuatan object,
    dimana sebuah object hanya dibuat satu kali saja lalu digunakan berulang.
- Dan ketika kita membutuhkan object tersebut, kita hnaya akan menggunakan object yang sama.
- https://refactoring.guru/design-patterns/singleton 

# Create Singleton in Java
- Ada banyak cara membuat singleton object di Java.
- Cara paling sederhana dan sering digunakan adalah membuat class yang berisikan static method untuk
    membuat object nya sendiri.
- Selanjutnya constructor nya dibuat private, agar tidak bisa diakses dari luar
- Sehingga user terpaksa menggunakan method static tersebut ketika ingin membuat objectnya.

# Path example:
    src\main\java\adexrepo\springbasic\data\Database.java
    src\test\java\adexrepo\springbasic\DatabaseTest.java