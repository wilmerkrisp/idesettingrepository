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
    
  
    ONE,TWO,THREE,FOUR,FIVE;
    
    
  
    }
