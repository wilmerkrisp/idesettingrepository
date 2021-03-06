NAMING

-   добавить к имени суффикс 
        - Collection
        - Map
        - List
        - Set
        - Queue

-   добавить префикс представляющий собой название типа элемента
        - например AddressCollection для Collection<Address>

-   добавить префикс Immutable для немутабельных коллекций
        - например AddressImmutableCollection для Collection<Address>


CONVENTIONS

-   рекомендуется создавать свои коллекции, наследуемые от базовых тк это позволяет: 
        - давать лучшие названия
        - добавлять свои вспомогательные члены
        - в будущем беcпрепятственно расширять реализацию

-   для высокоуровневых api следует предпочитать коллекции, для низкоуровневых следует предпочитать более быстрые массивы

-   использование немутабельных массивов крайне дорого  тк придется все время клонировать массив

-   нельзя использовать устаревшие типы коллекций без генериков <T>
        - тк они слаботипизированы что является источником ошибок
    
-   коллекция должна быть простым типом, предназначенным для управления группой объектов со сходными характеристиками (хранения элементов, доступа к ним и управления ими и не больше)
        - категорически нельзя использовать коллекции для сложных типов не связанных с вышеизложенными простыми действиями     

-   типы коллекций:
        1) копия (моментальная копия) - коллекция, представляющая состояние в некоторый момент времени
        2) оперативная коллекция - коллекция которая ВСЕГДА представляет текущее состояние    
        
-   для немутабельных коллекций следует ввести метод  bool isReadOnly возвращающий true   

-   предпочитайте использовать Map если если у элементов хранимых в коллекции есть уникальные ключи 