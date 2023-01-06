# Circular Dependencies
- Hati hati dengan circular dependencies.
- Circular dependencies adalah kasus dimana sebuah lingkaran dependency terjadi,
    misal bean A butuh bean B, bean B butuh bean C , dan ternyata bean C butuhnya
    bean A.
- Jika terjadi Cyclic seperti ini, secara otomatis Spring bisa mendeteksinya,
    dan akan menganggap bahwa itu adalah error.