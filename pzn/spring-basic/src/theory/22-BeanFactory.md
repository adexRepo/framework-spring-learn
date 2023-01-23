# Bean Factory
- [ApplicationContext] adalah [interface][turunan] dari BeanFactory
- Bean Factory merupakan kontrak untuk management bean di Spring
- Method-method yang sebelumnya kita gunakan untuk mengambil bean,
    sebenarnya merupakan method kontrak dari interface BeanFactory
    ingat ini [getBean()], yap that from BeanFactory
- Bean Factory ini cuman bisa [mengakses] [satu] saja.
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html

# [Listable] Bean Factory
- Bean Factory [hanya] bisa digunakan untuk mengakses [single][bean], artinya jika terdapat bean
    dengan tipe yang sama, kita harus sebutkan satu per satu nama bean nya.
- [Listable] Bean Factory adalah [turunan] dari [BeanFactory] yang bisa kita gunakan untuk [mengakses]
    [beberapa][bean] sekaligus.
- Dalam beberapa kasus, ini sangat berguna, seperti misal kita ingin [mengambil] 
    [semua] bean [dengan] [tipe] [tertentu].
- [ApplicationContext] juga merupakan [turunan] [dari] [interface] [Listable] Bean Factory
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/ListableBeanFactory.html 