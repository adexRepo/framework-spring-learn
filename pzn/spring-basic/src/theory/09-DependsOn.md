# Depends On
- Saat sebuah bean membutuhkan bean lain, secara otomatis bean tersebut [akan][dibuat]
    [setelah][bean] yang [dibutuhkan][dibuat].
- Namun bagaimana jika bean tersebut tidak [membutuhkan] [bean] lain. tapi kita ingin sebuah
    bean dibuat [setelah] bean lain [selesai] dibuat?
- Jika ada kasus tersebut, kita bisa menggunakaan annotation [@DependsOn(value={"namaBean"})]
- Secara otomatis, Spring akan memprioritaskan pembuatan bean yang terdapat di DependOn terlebih dahulu.
- Karena by default dia akan membuat secara random( jika di file yang sama maka akan sycronus).
- misal kita ingin buat si A itu saat buat si X selesai.. atau setelah selesai X kita tolong
    buatkan si A
- example:
    src\test\java\adexrepo\springbasic\DependsOnTest.java
    src\main\java\adexrepo\springbasic\config\DependsOnConfiguration.java