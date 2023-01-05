# Mengubah Nama Bean
- Secara default, nama bean diambil dari nama method.
- Namun kadang-kadang kita ingin menggunakan nama method untuk nama bean.
- Saat project kita sudah besar, bisa jadi akan ditemukan nama method yang sama, walaupun isi bean nya berbeda,
    dan di Spring, nama bean itu unik, tidak boleh sama.
- Jika kita ingin mengubah nama bean, kita bisa menggunakan method [value()][milik] annotation [@Bean]