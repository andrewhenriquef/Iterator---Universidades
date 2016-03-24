# Iterator---Universidades

O Padrão Iterator fornece uma maneira para acessar os elementos de um
objeto agregado sequencialmente sem expor a sua representação

A tarefa de travessia fica com o objeto Iterator, o que simplifica a
interface agregada e a implementação


“A responsabilidade fica com quem de direito”

Com o padrão Iterator, tiramos a responsabilidade de iterar sob uma
coleção de objetos de uma classe “container” e passamos a uma classe
específica – Iterator


Reformulamos nossas classes: deixamos de programar para a
implementação para programar para a interface