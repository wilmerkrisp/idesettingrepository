#if(${uncomment1}==1)
    //<editor-fold desc=".">
    /* constructor with parameter
    
    - ! ПОВЕРХНОСТНОЕ КОПИРОВАНИЕ
    - constructor is a static method
    - constructor is not template method, inside constructor CALL only final,private,super methods
    
    public privateFinal protectedPackage _package_
    throws Exception, VX_myxception  
    */
    //</editor-fold>
#end

   /**                         
        Constructor with ALL parameters
        
        1) shallow copy
        2) main constructor, dependent methods:
            - constructor with all parameters
            - fabric      with all parameters
            - constructor with object
            - fabric with object  
             
     <pre>{@code                   
    
    
     exapmle 1
    
              ${NAME}<String> v_obj = new ${NAME}<>("test value");
    
    
     }</pre>
    */
     public ${NAME} ( @NotNull final  T  stringTwo)
        {
         #if(${uncomment1}==1)
        //<editor-fold desc=".">
		/* 
        super(p_1);
		this(p_1,"")
        log_.debug   ( stringTwo);
        
        0) //!NO new  T () but..
        
        throw new VX_onCreation_exception( " specialno v kinstruktore " );
        
        
           (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
               в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
 
     
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
        
        super();
        
        this.stringTwo =  stringTwo ;
        assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();        
        }
   
   
    /**
	 * fabric with ALL parameters
	 *
	 <pre>{@code                   
    
    
     exapmle 1
	 *
	 * }</pre>
	 *
	 * @param 
	 */
	public static < T > ${NAME}< T > of( @NotNull final  T  stringTwo   )
		{
		 #if(${uncomment1}==1)
		 
		//<editor-fold desc=".">
		/* 
 
        log_.debug   ( stringTwo);
        
        0) //!NO new  T () but..
        
        throw new VX_onCreation_exception( " specialno v kinstruktore " );
        
        
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
                в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
 
     
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
        
		return new ${NAME}<> (  stringTwo    );
		
		}
   
    #if(${uncomment1}==1)
    //<editor-fold desc=".">
	/* constructor with parameter
	0) constructor is a static method
    0) constructor is not template method, inside constructor CALL only final,private,super methods
	*/
	#end

	/**
	 * constructor with 1 parameter
	 *
       (1) uses default values from initializer or property definition
       (2) uses super default constructor
	 *

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("Test");
	 *
	 * }</pre>
	 *
	 * @param 
	 */
	  #if(${uncomment1}==1)
	//public ${NAME}( final T1 item1    )
	//	{
         //<editor-fold desc=".">
		/* 
        super(p_1);
		this(p_1,"")
        log_.debug   ( stringTwo);
        
        0) //!NO new  T () but..
        
        throw new VX_onCreation_exception( " specialno v kinstruktore " );
        
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
                в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
     
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
        
        
	    //	this.item1 = item1 ;
	    //assertForNullProperties_(this);
	    //        assertForValidProperties_(this);
		//assertForConsistencyProperties_(this);
	//	}
	//</editor-fold>
    #end
    
 	/**
	 * fabric with object
	 *
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 =  ${NAME}.of(v_obj1);
	 *
	 * }</pre>
	 *
	 * @param  
	 * @return
	 */
	public static < T > ${NAME}< T > copyOf( @NotNull final ${NAME}< T > object )
		{
		 #if(${uncomment1}==1)
		 //<editor-fold desc=".">
		/*
          
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
               в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
      
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
		
		return new ${NAME}<> (  (${NAME}< T >)  object    );
		}
    
    
    
    /**
	 * fabric with object_deep
	 *
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 =  ${NAME}.of(v_obj1);
	 *
	 * }</pre>
	 *
	 * @param  
	 * @return
	 */
	public static < T > ${NAME}< T > deepCopyOf( @NotNull final ${NAME}< T > object )
		{
		 #if(${uncomment1}==1)
		 //<editor-fold desc=".">
		/*
          
          (*) для mutable objects and NEW-SET-CALL pattern:
                свойство в конструкторе не проверяем -> проверяем в итоговом вызове метода
               в сетере даем возможность обнулить параметр  -> потом в методе для него выставим дефолтное значение
      
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
	
        //we uses Apache Commons library for deep copy
		return new ${NAME}<>  (  (${NAME}< T >) SerializationUtils.clone( object )  );		

		}