# Application Runner
- Selain CommandLineRunner, SpringBoot menyediakan fitur Application Runner
- Penggunaan ApplicationRunner sama seperti CommandLineRunner, hanya saja argument
    nya sudah di warp dalam object ApplicationArguments
- Yang menarik dari ApplicationArguments adalah memiliki fitur parsing untuk command line argument
- docs:
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationArguments.html 
    https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationRunner.html 
    .vscode\launch.json 
    "args": ["--profiles=arg2", "--profiles=arg3"],