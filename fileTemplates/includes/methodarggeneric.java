#if(${uncomment1}==1) 
        //////////////////////////////////////////////////////////////////////////////////
        //   special cases
        ////////////////////////////////////////////////////////////////////////////////// 
        //<editor-fold desc=".">
        /* method test with argument of ANYTYPE
        
         example 2
        
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
         *      method test with argument of ANYTYPE
         *      !CHANGE_ME_DESCRIPTION!
         * 
         * <pre>{@code
         *
         * 
         * example 1
         * 
         *           v_obj.f_testanyarg("stroka");
         *           v_obj.f_testanyarg(12);
         *
         * 
         * 
         *
         * }</pre>
         */
        public < E   /* extends super VC_ & VI_ */ /* extends super VCG_<?> & VIG_<?> */ /* extends super VCG_< E > & VIG_< E > */ /* extends super VCG_<String> & VIG_<String> */ >void fg_testanyarg( @NotNull final  E  p_1 )
            {
             #if(${uncomment1}==1)
            //<editor-fold desc=".">
            /*
            throw new VX_exception( "vError" );
            super.fg_testanyarg(p_1);
            log_.debug( "argument type: " + (( p_1 instanceof VV_ ) ? "VV_" : "no") );
            log_.debug( "$class$  f_testanyarg: "+p_1 );
            !NO new  E ()
            
            
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
            
            Objects.requireNonNull( p_1 );
            }
