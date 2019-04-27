#if(${uncomment1}==1) 
       //<editor-fold desc=".">
        /* 
        
        log_.debug( "MyList f_method: " + p_1 );
        super.f_method(p_1);
 
 
            (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
                в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
                if (stringTwo==null) log_.info( "Input parameter is null." );
     
          (*) для immutable objects and NEW-CALL pattern:
                (1)свойство в конструкторе проверяем  -> в итоговом вызове НЕ проверяем
                Objects.requireNonNull( object.stringTwo );
     
     
          (*) для param receive strategy:
                (1) Objects.requireNonNull(p_1);
	            (2) String p_2= (p_1 == null)? new String() : p_1;
 
        
          (*)use assertions to check method parameters of private methods
 	        - use assertions for situations that can never occur
		    - assert false:"Assert message";
        */
        //</editor-fold>
#end
    