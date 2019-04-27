#if(${uncomment1}==1)
        //////////////////////////////////////////////////////////////////////////////////
        //  methods                              
        //////////////////////////////////////////////////////////////////////////////////
        
        //<editor-fold desc=".">
        /* public method
            0) перегенерировать javadoc MAC8+fixDocComment
    
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
        *   public method description
        *   !CHANGE_ME_DESCRIPTION!
        *
        * <pre>{@code 
        *                  
        * example 1
        *
        *           v_object.oneCompute();
        *
         * }</pre>
        */
        public  void    oneCompute()                   
            {
             #if(${uncomment1}==1)
            //<editor-fold desc=".">
            /*
            throw new VX_exception( "vError" );
            log_.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " );
            
            #parse("fxcop_method.java")
           
               
            */
            //</editor-fold>
            #end

            #parse("methodcompute.java")
            
            
                        
            setDefaultValuesForUnsettedProperties_();
            logForNullProperties_();
            logForValidProperties_();
		    logForConsistencyProperties_();
            
            
            return;
            } 
    
    
     #if(${uncomment1}==1)
        //<editor-fold desc=".">
        /* protected method
    
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
        *   protected method description
        *   !CHANGE_ME_DESCRIPTION!
        *
        * <pre>{@code 
        *                  
        * example 1
        *
        *           v_object.twoCompute();
        *
         * }</pre>
        */
        protected  void    twoCompute()                   
            {
            
            #parse("methodcompute.java")
            
             
            
            setDefaultValuesForUnsettedProperties_();
            logForNullProperties_();
            logForValidProperties_();
		    logForConsistencyProperties_();
            
            return;
            } 
    
    
    
    
     #if(${uncomment1}==1)
        //<editor-fold desc=".">
        /* private method
                
           - covariance: this overrided method can return subclass unstead class:
                  resultSomeSuperclass f_method()
                  resultSomeSubclass   f_overrided_method()
    
    
    
        public privateFinal protectedPackage _package_ final 
        throws Exception, VX_myxception 
        @Override  
        */
        //</editor-fold>
#end

        private  void    threeCompute_()                   
            {
             #if(${uncomment1}==1)
            //<editor-fold desc=".">
            /*
            throw new VX_exception( "vError" );
            log_.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " );
            
             (*)use assertions to check method parameters of private methods
 	            - use assertions for situations that can never occur
		        - assert false:"Assert message";
		
            */
            //</editor-fold>
            #end
            
            return;
            } 
