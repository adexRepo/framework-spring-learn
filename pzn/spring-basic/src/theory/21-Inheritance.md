# Inheritance
- Saat kita mengakses bean, kita bisa langsung menyebutkan tipe class bean tersebut
    dengan parent class/ parent interface bean nya.
- Misal jika kita ingin memiliki sebuah interface bernama MerchantService, lalu kita
    memiliki bean dengan object implementasi class nya MerchantServiceImpl, maka untuk
    bean nya, kita tidak hanya bisa menggunakan tiper MerchantServiceImpl, namun juga
    bisa dengan MerchantService.
- yaa karena MerchantService adalah parent dari MerchantServiceImpl yang menjadi bean.
- Namun perlu hati-hati, jika misal MerchantService memiliki banyak bean turunan,
    pastikan tidak terjadi error duplicate.
- src:
    src\main\java\adexrepo\springbasic\service\MerchantService.java
    src\main\java\adexrepo\springbasic\service\MerchantServiceImpl.java
    src\main\java\adexrepo\springbasic\config\InheritanceConfiguration.java
    src\test\java\adexrepo\springbasic\InheritanceTest.java