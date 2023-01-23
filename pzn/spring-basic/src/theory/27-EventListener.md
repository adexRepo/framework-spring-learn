# Event Listener
- Spring memiliki fitur Event Listener yang bisa digunakan untuk komunikasi antar class menggunakan event.
- [Event] di Spring merupakan object turunan dari [ApplicationEvent], sedangkan
- [listener] di Spring merupakan turunan dari [ApplicationListener]
- docs:
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationEvent.html 
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationListener.html 

# HOW to send Event to ApplicationEvent
- Ketika ingin mengirimkan event ke listener, kita bisa menggunakan object
    ApplicationEventPublisher, dimana ApplicationEventPublisher 
    juga merupakan super [interface][dari] [ApplicationContext].
- Atau kita bisa menggunakan [ApplicationEventPublisherAware] untuk mendapatkan
    object ApplicationEventPublisher.
- docs:
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationEventPublisher.html 
- src:
    src\main\java\adexrepo\springbasic\event\LoginSuccessEvent.java
    src\main\java\adexrepo\springbasic\data\User.java
    src\main\java\adexrepo\springbasic\listener\LoginSuccessListener.java
    src\main\java\adexrepo\springbasic\service\UserService.java
    src\test\java\adexrepo\springbasic\EventListenerTest.java