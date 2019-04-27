NAMING


CONVENTIONS

-   такие классы предназначены для продвинутых расширенных сценариев, и потому неинтересны большинству юзеров
        - такие классы должны быть в отдельном неймспейсе, например подпакете основных сценариев


РАСШИРЯЕМОСТЬ

-   нельзя требовать чтобы юзеры: наследовали классы или имплементировали интерфейсы
        - где возможно использовать вместо этого лямбды

-   специально созданы для расширяемости через наследование

-   такие классы сами не подходят на роль интерфейсов тк содержат слишком большой объем реализации

-   помогают имплементировать интерфейсы чтобы юзеры получили часть реализации
        - например если в корне иерархии типов интерфейс:
        - List -> AbstractList(*) -> MyList
        - тк они добавляют еще один уровень иерархии то они усложняют инфраструктуру

-   для каждого абстрактного класса нужно сделать минимум одну имплементацию 
        - это позволяет проверить правильность дизайна и вовремя исправить ошибки

-   должны сопровождаться полным набором справочной документации описывающей необходимую семантику типов реализующих контракт
        - первоклассная документация должна ясно и обстоятельно  объяснить все пред- и пост- условия имплементирования
        - в противном случае пользователи откажутся от использования типа

-   нельзя делать public конструкторы тк нельзя создавать экземпляры абстрактного класса
        - наличие конструктора только запутает
        - следует сделать конструктор protected 

-   абстрактный класс здесь неприменим для моделирования множественного наследования