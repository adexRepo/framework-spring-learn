# Optional Dependency
- Secara default, semua dependency itu wajib.
- Artinya jika Spring tidak menemukan bean yang dibutuhkan pada saat Di Inject
    maka secara otomatis akan terjadi error.
- Namun jika kita memang ingin membuat sebuah dependency menjadi Optional, artinya tidak wajib
- Kita bisa warp dependency tersebut dengan menggunakan java.util.Optional<T>
- Secara otomatis jika ternyata bean yang dibutuhkan tidak ada, maka tidak akan terjadi error.
- Kita bisa gunakan Optional<T> pada @Bean (method parameter) ataupun @Componenet
    (constructor parameter, setter method parameter, dan field.)