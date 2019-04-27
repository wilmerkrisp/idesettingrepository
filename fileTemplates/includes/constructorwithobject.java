#if(${uncomment1}==1) 
        //<editor-fold desc=".">
        /* transformation class1->class2 exception 
        
        - DEEP COPYING OF OBJECT IN CONSTRUCTOR 
        
        - для операция преобразования типов лучше использовать явный конструктор или фабрику вместо методов трансформации
                - тк нужно показать что в этом случае явно создается объект
                - например, если необъект(элементарный тип) преобразуется в объект
                - в таких операциях можно вызывать ClassCastException
                
        - throw new ClassCastException( tuple); 
        
        */
        //</editor-fold>
#end
