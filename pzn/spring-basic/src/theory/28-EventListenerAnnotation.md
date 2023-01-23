# Event Listener Annotation
- Selain menggunakan interface ApplicationListener, kita juga bisa menggunakan Annotation untuk membuat Listener.
- Ini lebih flexible dibandingkan menggunakan interface Application Listener.
- Kita bisa menggunakan annotation @EventListener
- docs:
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/event/EventListener.html 
- src
    src\main\java\adexrepo\springbasic\listener\UserListener.java
    src\test\java\adexrepo\springbasic\EventListenerTest.java

# HOW Event Listener Annotation Works?
- Annotation @EventListener berkerja dengan menggunakan Bean Post Processor bernama [EventListenerMethodProcessor]
- EventListenerMethodProcessor mendeteksi jika ada bean yang memiliki method dengan annotation @EventListener,
    maka secara otomatis akan membuat listener baru, lalu meregistrasikannya ke 
    [ApplicationContext.addApplicationListener(applicationListener)]
- docs:
    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/event/EventListenerMethodProcessor.html 