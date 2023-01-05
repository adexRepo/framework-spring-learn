# Duplicate Bean
- Di Spring, kita bisa mendaftarkan beberapa bean dengan [tipe] yang sama.
- Namun perlu diperhatikan, jika kita membuat bean dengan tipe data yang sama,
    maka kita harus menggunakan [nama] bean yang [berbeda].
- Selain itum saat kita mengakses bean nya, kita wajib [menyebutkan] nama beannya,
    karena jika tidak, Spring akan bingung harus mengakses bean yang mana.
- example : 
    src\main\java\adexrepo\springbasic\config\DuplicateBeanConfiguration.java
    src\test\java\adexrepo\springbasic\DuplicateBeanTest.java