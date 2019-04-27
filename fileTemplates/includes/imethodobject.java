#if(${uncomment1}==1)
        //<editor-fold desc=".">
        /* method with explicit object reference
                   class method, then call with object instalce
                   flg_lambda(VC_ p_1,String p_2)           //define functional interface      (2 parameters)
                   f_method(String p_2)                     //define VC_ method                (1 parameter )
                   ${NAME}<String> l_1=VC_::f_method        //get reference to the VC_ method
                   v_obj=new VC_();
                   l_1.flg_lambda(v_obj,"string");           //call lambda                      (2 parameters)
        
        
        
        
        throws Exception, VX_myxception 
        */
        //</editor-fold>
#end

       /**                         
       *    reference to class method, then call with object instalce
       *    !CHANGE_ME_DESCRIPTION!
       *
        * <pre>{@code                   
        *
        *
        *
        *
        * }</pre>
        */   
        public abstract  T     flg_lambda( @NotNull VC_ p_obj, @NotNull T  p_1);