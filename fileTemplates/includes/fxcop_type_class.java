NAMING

-   имя класса должно быть существительным или именной группой

-   можно добавить суффикс в виде названия базового класса 
        - тк это очень читаемо и явно объясняет отношения
        - рекомендуется для типов наследованных от типов стандартного джава фреймворка

CONVENTIONS



РАСШИРЯЕМОСТЬ

-   для расширяемости лучше подходят обычные классы
        - не final  
        - без abstract методов 
        - без protected методов  

-   расширяемость должна проектироваться заранее
        - тк юзеры могут расширить способами которые архитекторы предвидеть не могли:
        - поэтому специально для расширяемости рекомендуется использовать интерфейсы и абстрактные классы

-   финализация это механизм предотвращения расширяемости
        - необходимо финализировать только то что необходимо, иначе юзеры будут очень недовольны тк они любят расширять без причин а просто для удобства
        - следует финализировать методы и классы, важные с точки security
         
-   у класса всегда можно убрать final, но обратно уже добавить нельзя    
    
-   нельзя в final классе делать методы protected или abstract
        - тк подразумевается что final классы не наследуются