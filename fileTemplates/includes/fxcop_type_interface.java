NAMING

-   для интерфейсов предоставляющих возможности имя должно быть прилагательным
        -  прилагательное+существительное, но прилагательное является главным словом (так называемое адьюктивное прилагательное)
        
-   класс имплементирующий интерфейс должен использовать суффикс в виде имени интерфейса
        - например Default+имяИнтерфейса для реализации по-умолчанию        

CONVENTIONS

-   интерфейс делает в точности одну вещь, если у интерфейса несколько функциональных возможностей то это плохо

-   нельзя создавать пустые маркерные интерфейсы без членов
        - вместо них нужно использовать маркерные аннотации

-   легче понять интерфейс понимая как он вписывается в более широкую картину имплементаций этого интерфейса и кода вызывающего этот интерфейс
        - для каждого интерфейса нужно сделать минимум одну реализацию обычного класса, юзер может отнаследовать имплементацию и получить реализацию бесплатно
        - для каждого интерфейса должен быть минимум один использующий его метод или свойство
        - также нужно предоставлять тесткейсы чтобы юзер мог проверить правильно ли он понимает интерфейс


РАСШИРЯЕМОСТЬ

-   нельзя требовать чтобы юзеры: наследовали классы или имплементировали интерфейсы
        - где возможно использовать вместо этого лямбды

-   специально созданы для расширяемости через наследование
        - следует выбирать интерфейс если прогеру нужен общий api

-   интерфейсы используются для моделирования множественного наследования

-   лучше всего подходят для создания корня иерархии типов
        - List(*) -> AbstractList -> MyList

-   для каждого интерфейса нужно сделать минимум одну имплементацию 
        - это позволяет проверить правильность дизайна и вовремя исправить ошибки

-   должны сопровождаться полным набором справочной документации описывающей необходимую семантику типов реализующих контракт
        - первоклассная документация должна ясно и обстоятельно  объяснить все пред- и пост- условия имплементирования
        - в противном случае пользователи откажутся от использования типа

-   нельзя создавать конструкторы тк нельзя создавать объекты интерефейсов

-   после того как интерфейс разработан, множество его public abstract членов установлено навсегда и не меняется
        - поэтому основная трудность в проектировании правильного набора abstract методов интерфейса
        - для расширения можно добавлять опциональные public default методы
        
-   количество public методов        
        - если у интерфейса слишком много методов то его трудно или даже невозможно имплементировать
        - если у интерфейса слишком мало методов для обещанного функционала, то он становится бесполезным во многих интересных сценариях
    
