#if(${uncomment1}==1)
        //<editor-fold desc=".">
        /* optional for new-set-call: constructor with parameter for mutable
        
        ПАТТЕРН NEW-SET-CALL В МУТАБЕЛЬНЫХ КЛАССАХ
        
        - всегда должна быть возможность выбора:
            1) вызвать конструктор с параметрами
            2) вызвать дефолтный конструктор но затем установить свойства
        
        - constructor is a static method
        - constructor is not template method, inside constructor CALL only final,private,super methods
        
        
        
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
                 в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
    
     
        */
        //</editor-fold>
#end

