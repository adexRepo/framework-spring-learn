# Factory Bean
- Kadang ada kasus dimana sebuah class misalnya bukanlah milik kita,
    misalnya class [third][party] library.
- Sehingga agak [sulit] jika kita harus [menambahkan] [annotation] pada class tersebut.
- Pada kasus seperti ini, cara terbaik untuk membuat bean nya adalah dengan menggunakan
    @Bean method.
- Atau di Spring, kita juga bisa menggunakan @Component, namun perlu wrap dalam class
    [Factory][Bean]
- Syaratnya membuat class dengan implement FactoryBean.class
    - getObject
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/FactoryBean.html 
- src:
    src\main\java\adexrepo\springbasic\client\PaymentGatewayClient.java
    src\main\java\adexrepo\springbasic\config\FactoryConfiguration.java
    src\test\java\adexrepo\springbasic\FactoryTest.java