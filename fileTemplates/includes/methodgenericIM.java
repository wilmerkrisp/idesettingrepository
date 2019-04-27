#if(${uncomment1}==1) 
        //////////////////////////////////////////////////////////////////////////////////
        //  methods                              
        //////////////////////////////////////////////////////////////////////////////////
        
        //<editor-fold desc=".">
        /* method<>
        
        - перегенерировать javadoc MAC8+fixDocComment
        
        - covariance: this overrided method can return subclass unstead class:
              resultSomeSuperclass f_method()
              resultSomeSubclass   f_overrided_method()
        
        
        
        public privateFinal protectedPackage _package_ final 
        throws Exception, VX_myxception 
        @Override  
        */
        //</editor-fold>
#end
        
        /**                         
        *   method test with GENERIC parameter GENERIC result
        *   !CHANGE_ME_DESCRIPTION!
        *
        * <pre>{@code                   
        *
        *
        * example 1
        *
        *           String v_string = v_obj.f_test("str");
        *
         * }</pre>
        */
        public   T     f_test( @NotNull final  T  p_1)
            {
             #if(${uncomment1}==1)
            //<editor-fold desc=".">
            /*
            throw new VX_exception( "vError" );
            log_.debug( "argument type: " + (( p_1 instanceof VV_ ) ? "VV_" : "no") );
            log_.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " +p_1);
            
            !NO new  T () but..
            
            
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
                в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
     
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
            
            this.stringOne_=Objects.requireNonNull( p_1 );
            return this.stringTwo;
            } 
        
            
            
        
        
        
 #if(${uncomment1}==1)        
        //<editor-fold desc=".">
        /* method<?>
        
           - перегенерировать javadoc MAC8+fixDocComment
    
           - covariance: this overrided method can return subclass unstead class:
                  resultSomeSuperclass f_method()
                  resultSomeSubclass   f_overrided_method()
    
    
    
    
         public privateFinal protectedPackage _package_ final 
         throws Exception, VX_myxception 
         @Override  
        */
        //</editor-fold>   
#end
          
        /**                         
        *   method test with argument of GENERIC<anyclass>    
        *                                     <not only T as uppers methods>
        *   !CHANGE_ME_DESCRIPTION!
        *
        * <pre>{@code
        *
        *
        * example 1
        *
        *              ${NAME}< Long >   v_obj1 = new ${NAME}<  >( 12L );
        *              ${NAME}< String > v_obj2 = new ${NAME}<  >( 12L );
        *              v_.f_test_genericlass(v_obj2);
        *              v_.f_test_genericlass(v_obj1);
        *
        *
        *
        *
        * }</pre>
        */
        public void fg_test_genericlass( @NotNull final ${NAME}< ? /* extends super VC_ & VI_ *//* extends super VCG_< T > & VIG_< T >*//* extends super VCG_<String> & VIG_<String> */ > p_1 )
            {
             #if(${uncomment1}==1)
            //<editor-fold desc=".">
            /*
            throw new VX_exception( "vError" );
            log_.debug   ("$class$ f_method f_test_genericlass: "+p_1);
            super.fg_test_genericlass(p_1);
            log_.debug( "argument type: " + (( p_1 instanceof ${NAME}<?> ) ? "VV_" : "no") );
              
            !NO new  T () but..
            
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
     
          (*) для immutable objects and NEW-CALL pattern:
                (1)свойство в конструкторе проверяем  -> в итоговом вызове НЕ проверяем
                Objects.requireNonNull( object.stringTwo );
     
     
          (*) для param receive strategy:
                (1) Objects.requireNonNull(p_1);
	            (2) String p_2= (p_1 == null)? new String() : p_1;

            */
            //</editor-fold>
             #end
             
            Objects.requireNonNull( p_1 );
            
            p_1.f_test( null );
            
            return;
            }