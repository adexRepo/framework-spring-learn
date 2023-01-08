# Life Cycle
- Spring Container/IoC memiliki alur hidup, dan kita kita ingin berinteraksi dengan
    alur hidup nya Spring, kita juga bisa lakukan.
- Alur hidup yang dimaksud disini ialah alur saat spring dijalankan [(run)] dan spring di matikan [(shutdown)]
- Saat pertama kali Spring berjalan dan sudah [selesai][membuat] bean, Spring akan [memberitahu] bean
    tersebut bahwa [bean] tersebut [sudah][siap], artinya semua [dependencies][sudah][dimasukkan].
- Dan ketika apllikasi Spring akan mati, Srping juga akan memberitahu semua bean bahwa bean
    tersebut akan [dihancurkan].

# Life Cycle Callback
- Secara default, bean tidak bisa tahu alur hidup Spring ketika selesai membuat bean dan ketika akan
    menghancurkan bean.
- Jika kita tertarik untuk bereaksi ketika alur hidup Spring terjadi, maka kita bisa implements interface
    InitializingBean dan DisposableBean.

- [IntializingBean] digunakan jika kita ingin bereaksi ketika Spring selesai membuat bean.
    yaitu pada method [afterPropertiesSet()]
- [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html]

- [DisposableBean] digunakan jika kita ingin bereaksi ketika Spring akan menghancurkan bean / shutdown.
    yaitu pada method [destroy()]
- [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html]

- example:
    src\main\java\adexrepo\springbasic\data\Connection.java
    src\main\java\adexrepo\springbasic\config\LifeCycleConfiguration.java
    src\test\java\adexrepo\springbasic\LifeCycleTest.java

# Life Cycle Annotation
- Selain menggunakan interface InitializingBean dan DisposableBean, kita juga bisa menggunakan
    annotation untuk mendaftarkan callback method untuk lifecycle
- Pada annotation [@Bean] terdapat method [initMethod()] dan [destroyMethod()]
- intMethod() digunakan untuk meregistrasikan method yang akan dipanggil ketika [bean][selesai] dibuat.
- destoryMethod() digunakan untuk mergeistrasikan method yang akan dipanggil ketika [bean] akan [dihancurkan].
- Methodnya harus tanpa parameter, dan return valuenya tidak akan dipedulikan, jadi sebaiknya
    gunakan void saja.
- example:
    src\main\java\adexrepo\springbasic\data\Server.java
    src\main\java\adexrepo\springbasic\config\LifeCycleConfiguration.java
    src\test\java\adexrepo\springbasic\LifeCycleTest.java

- ini dipakai saat kita males implement method initializingBean and disposableBean

# PostConstruct and @PreDestroy
- Selain menggunakan annotation @Bean, untuk menandai sebuah method adalah initMethod dan destroy method,
    kita juga bisa menggunakan annotation pada method secara langsung.
- Ini bisa digunakan untuk menghindari kita lupa menyebutkan init dan destroy method ketika membuat bean.
- [@PostConstruct] merupakan method yang ditandai harus dipanggil ketika bean [selesai][dibuat].
- [@PreDestroy] merupakan method yang ditandai harus dipanggil ketika bean [akan][dihancurkan].
- Jika sudah menggunakan annotation ini, kita tidak perlu lagi menyebutkannya di @Bean
- ini opsi saat kita punya kemampuan untuk merubah class tertentu saat dibuat maupun saat dihancurkan.
- but kalo dari library maka kita bisa pakai bean.
- example:
    src\main\java\adexrepo\springbasic\data\Server.java
    src\main\java\adexrepo\springbasic\config\LifeCycleConfiguration.java
    src\test\java\adexrepo\springbasic\LifeCycleTest.java


# Summary
- There is three option
1. Implements InitializingBean and DisposableBean
2. Bean Annotation with method: initMethod() and destroyMethod()
3. Annotation @PostConstruct and @PreDestroy