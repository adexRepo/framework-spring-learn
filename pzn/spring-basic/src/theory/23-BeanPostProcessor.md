# Bean Post Processor
- Bean Post Processor merupakan sebuah interface yang bisa kita gunakan untuk
    memodifikasi proses pembuatan bean di Application Context.
- Bean Post Processor [mirip] seperti [Middleware], yang diakses sebelum bean 
    di initialized dan setelah bean di initialized
- Karena sangat [flexible], bahkan [Bean] [Post][Processor] bisa [memodifikasi] hasil object bean nya.
- but tidak direkomendasikan memodifikasi karena membingungkan object akan berubah.
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html 

# case: Bean Id Generator
- Misalnya kita akan coba membuat id unique untuk bean
- Dimana kita akan membuat sebuah interface bernama IdAware, lalu memiliki method setId(String)
- Kita akan membuat Bean Post Processor, dimana jika bean yang di implements IdAware, kita akan
    setId(String) nya menggunakan UUID.
- src :
    src\main\java\adexrepo\springbasic\aware\IdAware.java
    src\main\java\adexrepo\springbasic\processor\IdGeneratorBeanPostProcessor.java
    src\main\java\adexrepo\springbasic\data\Car.java
    src\test\java\adexrepo\springbasic\BeanPostProcessorTest.java
    