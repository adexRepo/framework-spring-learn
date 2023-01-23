# Spring Application Event (just for SpringBoot)
- Di SpringBoot, terdapat banyak sekali event yang dikirim ketika aplikasi SpringBoot berjalan.
- Jika kita ingin, kita bisa membuat Listener untuk menerima event tersebut
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/event/SpringApplicationEvent.html 

# Daftar Event
ApplicationStartingEvent           = Dikirim ketika start aplikasi, cannot be bean.
ApplicationContextInitializedEvent = Dikirim ketika ApplicationContext sudah di initialisasi
ApplicationStartedEvent            = Dikirim ketika aplikasi sudah berjalan
ApplicationFailedEvent             = Dikirim ketika aplikasi gagal berjalan
dan lain-lain

# Menambah Listener
- Beberapa Event di SpringBoot Application Event di [trigger] bahkan [sebelum] Spring membuat [ApplicationContext]
- Oleh karena itu, jika kita buat menggunakan bean, bisa saja beberapa listener tidak akan dipanggil
    karena bean nya belum dibuat.
- Agar lebih aman, kita bisa menambahkan listener ketika membuat SpringApplication.
- Cara registrasi nya pakai Spring Application 
- src:
    src\main\java\adexrepo\springbasic\application\FooApplication.java
    src\main\java\adexrepo\springbasic\listener\AppStartingListener.java