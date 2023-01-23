# Aware
- Spring memiliki sebuat interface bernama Aware
- Aware adalah super interface yang digunakan untuk semua Aware Interface
- Aware ini diperuntukan untuk [penanda] agar Spring melakukan injection object yang kita butuhkan
- [Mirip] seperti yang sudah kita lakukan ketika membuat Id Aware menggunakan IdGenerator Bean Post Processor
- Namun untuk ini, kita tidak perlu lagi membuat Bean Post Processor secara manual 
    karena sudah ditangani oleh Aware.
- lengkapnya
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/Aware.html 
- Aware itu hanya interface kosong.

- Daftar Aware
- ApplicationContextAware        = Untuk mendapat application context dalam bean
- BeanFactoryAware               = Untuk mendapat bean        factory dalam bean
- BeanNameAware                  = Untuk mendapat nama        bean    dalam bean
- ApplicationEventPublisherAware = Untuk mendapat event       publisher
- EnvironmentAware               = Untuk mendapat environment
... dll

- src
    src\main\java\adexrepo\springbasic\service\AuthService.java
    src\test\java\adexrepo\springbasic\AwareTest.java