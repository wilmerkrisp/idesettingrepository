#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end




#parse("File Header.java")


/**
*   enum simple
*   !CHANGE_ME_DESCRIPTION!
*

   1) you can use extensible interface for enums  (for example pettern operation codes/opcodes)
        then use generic restrictions for variables of such interface type:   <T extends Enum<T> & Operation>



* <pre>{@code
*
*
* example 1
*
*	        ${NAME} v_enum = ${NAME}.ONE;
*	        v_enum.c_test = "newvalue";
*           ${NAME}.TWO.c_test = "newvalue";
*	        v_enum.f_test();
*
*
* example 5
*               import static ${PACKAGE_NAME}.${NAME}.*;
*               ${NAME} v_enum =  ONE;                  //using withowt ${NAME}.ONE
*
*
* example 2
*
*		    switch( v_enum )
*                       {
*                       case ONE:
*                               log_.debug( "${NAME} main switch 1: " );
*                               break;
*                       case TWO:
*                               log_.debug( "${NAME} main switch 2: " );
*                               break;
*                       case THREE:
*                               log_.debug( "${NAME} main switch 3: " );
*                               break;
*                       case FOUR:
*                               log_.debug( "${NAME} main switch 4: " );
*                               break;
*                       default:
*                               log_.debug( "${NAME} main DEFAULT: " );
*                       }
*
*
*
* example 3
*
*               for( ${NAME} v_i : ${NAME}.values( ) )
*                       {
*                       log_.debug( "${NAME} main for: " + v_i +" "+v_i.c_test );
*                       }
*
*
*
*
* example 4
*
*               v_enum == v_enum.TWO
                v_enum.equals(v_enum.TWO)
                v_enum.compareTo(v_enum.TWO)
*

*
* }</pre>
*/
public enum ${NAME}

    {
    
    
    
    /**
    *   enumerations
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code
    *
    *
    *
    * }</pre>
    */

    ONE("a"),TWO("b"),THREE("c"),FOUR("d"),FIVE,SIX
            {
            
				
				public Integer constMethodproperty=13;
				
				
				
				{
				System.out.println( "const Method property" );
				}
				
				
				
				public void constMethod()
					{
					System.out.println( "const Method" );
					}
			};
    
    
    #parse("constants.java")


#parse("log.java")

 
    private String  c_test = new String("test string");
    
    
    
    
    private static String  c_test_s = new String("test string");
    
  
    static
        {
      
		c_test_s="new value";
        }
    
     
    
    /**
    *   constructor default
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code
    *
    *
    * exapmle 1
    *
    *           - automaticly runned for every enum CONSTANTS duering class ${NAME} creation

    *
    *
    * example 2
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
    *
    *
    * }</pre>
    */
  
    private ${NAME} ()
        {
       
        super();


        this.c_test="novalue";
        }
 
    /**
    *   constructor with parameter
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code
    *
    *
    * exapmle 1
    *
    *          - automaticly runned for every enum CONSTANTS duering class ${NAME} creation
    *
    *
    * example 2
    *
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
    *
    *
    *
    * }</pre>
    */
  
    private ${NAME} (@NotNull final String p_1)
        {
        
        super();
        
        this.c_test = p_1;
        }

 
    
    /**
    *   method test
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code
    *
    *
    * example 1
    *
    *           v_obj.f_test();
    *
    *
    * example 2
    *
    *
    *
    * }</pre>
    */
  
    public  void    f_test()
        {
        
 
        return;
        }
    
    }
