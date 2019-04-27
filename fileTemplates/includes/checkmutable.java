#if(${uncomment1}==1)     
        //<editor-fold desc=".">
        /* check inconsistency in method of mutable object
        
        - pattern new-set-call for mutable objects:
        - check integrity of object inside call methods
            throw new IllegalStateException( item1+item2 );
        
        
        
        
          (*) для mutable objects and NEW-SET-CALL pattern:
               свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
               в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
      		        assertForNullProperties_(this);
                    assertForValidProperties_(this);
		            assertForConsistencyProperties_(this);
        
          (*) для param receive strategy:
                (1) Objects.requireNonNull(p_1);
	            (2) String p_2= (p_1 == null)? new String() : p_1;
 
  	      (*)use assertions to check method parameters of private methods
 	        - use assertions for situations that can never occur
	    	- assert false:"Assert message";
 
        */
        //</editor-fold>
#end
 