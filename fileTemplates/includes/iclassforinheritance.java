- этот тип предназанчен для наследования

 
 
 Конструкторы класса не должны вызывать переопределяемые методы, непосредственно или опосредованно. 
    Нарушение этого правила может привестик аварийному завершению программы. 
    Тк Конструктор суперкласса выполняется прежде конструктора подкласса, 
 
 
 в джавадоке (в тегах @implSpec  @implNote ) нужно раскрыть детали реализации методов и указать какие из переопределяемых методов он использует сам
    тк наследование нарушает инкапсуляцию
    например, чтобы юзер знал что некоторый добавленный в overrided методы функционал  может сработать два раза (в случае когда AddAll вызывает Add)
