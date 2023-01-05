# Primary Bean
- Jika terjadi duplicate bean, selain kita sebutkan nama bean nya saat ingin mengakses bean nya,
    kita juga bisa pilih salah satu bean menjadi primary / default.
- Dengan memilih salah satunya menjadi primary, jika kita mengakses bean tanpa
    menyebutkan nama bean nya, secara otomatis primary bean yang akan dipilih
- Untuk memilih primary bean, kita bisa menambahkan annotation @Primary
example
    src\main\java\adexrepo\springbasic\config\DuplicateBeanConfiguration.java [foo1]