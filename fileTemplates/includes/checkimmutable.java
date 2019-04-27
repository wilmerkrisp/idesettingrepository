#if(${uncomment1}==1)
        //<editor-fold desc=".">
        /*  check inconsistency in constructor of immutable object
        
        ПАТТЕРН NEW-CALL В неМУТАБЕЛЬНЫХ КЛАССАХ:
        
        - следует проектировать типы так чтобы объекты не могли существовать в недопустимом состоянии
            - поэтому следует проверять консистентность объекта в конструкторе и вызывать IllegalStateException 
        
        - в конструкторе сразу задаются все параметры требуемые для настройки объекта
          - настройки не могут быть изменены после инициализации в конструкторе
                    
        - throw new IllegalStateException( item1+item2 ); 
        
         (*)use assertions to check method parameters of private methods
 	        - use assertions for situations that can never occur
		    - assert false:"Assert message";
        
        
        
       
          (*) для immutable objects and NEW-CALL pattern:
                (1)свойство в конструкторе проверяем  -> в итоговом вызове НЕ проверяем
                Objects.requireNonNull( object.stringTwo );
                assertForNullProperties_(this);
                assertForValidProperties_(this);
		        assertForConsistencyProperties_(this);
     
          (*) для param receive strategy:
                (1) Objects.requireNonNull(p_1);
	            (2) String p_2= (p_1 == null)? new String() : p_1;
 
 
 
        */
        //</editor-fold>
#end

    