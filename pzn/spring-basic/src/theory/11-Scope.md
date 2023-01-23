# Scope
- Scope merupakan [strategy] / [cara] sebuah object dibuat.
- Secara default strategy object di Spring adalah singleton, artinya hanya [dibuat][sekali],
    dan ketika kita akses, akan mengembalikan object yang sama.
- Namun kita juga bisa mengubah scope bean yang kita mau di Spring.
- Untuk mengubah scope sebuah bean, kita bisa tambahkan annotation [@Scope(value="namaScope")]

# Bean Scope
- [singleton]     ||  (Default) hanya dibuat satu kali dalam Spring IoC.
- [prototyle]     ||  Selalu dibuat object baru setiap kali bean diakses.
- [request]       ||  Dibuat baru per HTTP Request (hanya untuk Web App)
- [session]       ||  Dibuat baru per HTTP Session (hanya untuk Web App)
- [application]   ||  Dibuat baru per ServletContext (hanya untuk Web App)
- [websocket]     ||  Dibuat baru per WebSocket   (hanya untuk WebSocket App)

- example
    src\test\java\adexrepo\springbasic\ScopeTest.java
    src\main\java\adexrepo\springbasic\config\ScopeConfiguration.java

# Membuat Scope Sendiri
- Jika scope yang disediakan oleh Spring tidak bisa memenuhi kebutuhan kita,
    kita juga bisa membuat scope sendiri.
- Caranya dengan membuat class yang [implement] interface Scope.
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/Scope.html 
- Selanjutnya untuk [meregistrasikannya], kita bisa membuat bean [CustomScopeConfigurer]
    addScope(String scopeName,Scope scope)
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/CustomScopeConfigurer.html 
- in the example will tried make a Scope doubleton scope, just can make two time,
    if already two object created, will use that two object ,not make again.
    ::
    src\main\java\adexrepo\springbasic\data\scope\DoubletonScope.java
    src\test\java\adexrepo\springbasic\ScopeTest.java
    src\main\java\adexrepo\springbasic\config\ScopeConfiguration.java