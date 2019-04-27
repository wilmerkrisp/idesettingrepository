#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;
import java.util.function.BiFunction;
import java.util.function.Function;

import java.util.*;

#parse("File Header.java")


//////////////////////////////////////////////////////////////////////////////////
//  class                              
//////////////////////////////////////////////////////////////////////////////////
//<editor-fold desc="class mutable">
/*


*               VC_somesubclass             extends ${NAME} implements VI_, VI_
*               VC_somesubclass< T >    extends ${NAME} implements VI_, VI_


#parse("classmutable.java")


extends VC_             implements VI_, VI_                                           
extends VCG_<String>    implements VIG_<String>
public class ${NAME}< T >     extends VCG_< T >   implements VIG_< T >                                                                                      
@Override @Deprecated
public _package_ final
*/
//</editor-fold>


/**                             
*   class
    my mutable map "EntryMap"
*
   
    Make class simple without generic:
    1) reformat code
    6) replace all VALUE with Type2     (click MATCH CASE)
    
    

* <pre>{@code
*
* example 1
*
*   ${NAME} v_obj = new ${NAME}();
*   v_obj.oneCompute();

example 1a
		Map.Entry<String,String> v_e1 = Map.entry("01k","01v");
		Map.Entry<String,String> v_e2 = Map.entry("02k","02v");
		My2Map< String, String > m1 = new My2Map<String,String> (v_e1,v_e2);
		m1.put( "03k","03v" );
		My2Map< String, String > m2 = new My2Map<String,String> ("k1","v1","k2","v2");
		m2.put( "03k","03v" );
		

		for( Map.Entry< String, String > i : m2.entrySet() )
			{
			log_.debug   ("Main main for: "+i);
			}


* example 2

     ${NAME} v_obj = new ${NAME}(Map.entry("1",1),Map.entry("2",2));
    
* example 3
    
    ${NAME} v_obj = new ${NAME}(someMap);
    
* example 4    
     ${NAME} v_obj =  ${NAME}.of(Map.entry("1",1),Map.entry("2",2));
    
* example 5    
     ${NAME} v_obj =  ${NAME}.of(someMap);
     
example 5

    ${NAME} v_obj = new ${NAME}("key1","value1");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    

example 7

    ${NAME} v_obj = ${NAME}.of();
    ${NAME} v_obj = ${NAME}.of("key","value");
    ${NAME} v_obj = ${NAME}.of(("key1","value1","key2","value2");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    
    
     
*
*
* }</pre>
*/                                                            
public class ${NAME}  
    extends HashMap< KEY,VALUE >
    implements Serializable
	{
	
	
	
	#parse("log.java")
	
	
	
	/**
	 * Returns flag that the class is read only.
	 *
	 * @return Returns flag that the class is read only.
	 */
	public boolean isReadOnly()
		{
		return false;
		}

	
    //////////////////////////////////////////////////////////////////////////////////
    //  "override" static constructors and fabric of collections                              
    //////////////////////////////////////////////////////////////////////////////////
    
    
    #parse("checkmutableconstructor.java")
    
    
	/**                         
	*   constructor default
	*      
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}();
    *
    *
    * }</pre>
    */ 
	public ${NAME}()
		{
		super();
		}
	
	
	/**                         
	*   constructor with capacity
	*   Analogically to usual collections  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity )
		{
		super( initialCapacity );
		}
	
    
    	/**                         
	*   constructor with capacity and loadfactor
	*   Analogically to usual set  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12,11);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity,float loadFactor )
		{
		super( initialCapacity, loadFactor );
		}
	
  
    
    

	
    /**                         
	*   constructor with vararg(entries)
	*   Analogically to List.of
	*
	*   uses PUT method ot THIS class
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(Map.entry("1",1),Map.entry("2",2));
    *
    *
    * }</pre>
    */ 
	public ${NAME}(Entry<? extends KEY, ? extends VALUE>... entries)
		{
		super(entries.length);
        for (Entry<? extends KEY, ? extends VALUE> entry : entries)
            {
            /* super. is necessary because we should not call overrided methods in constructor*/
            super.put(Objects.requireNonNull( entry.getKey() ),Objects.requireNonNull( entry.getValue() ));
            }
		
		}
   
   
   
	
    
    /**                         
	*   fabric with vararg(entries)
	*   Analogically to List.of    
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.of(Map.entry("1",1),Map.entry("2",2));
    *
    *
    * }</pre>
    */ 
	public static  ${NAME} ofEntries( Entry<? extends KEY, ? extends VALUE>... entries )
		{
		return new ${NAME} ( entries );
		}
    
    
    /**                         
	*   constructor with parameter(map)
	*   Analogically to usual collections  
	*         
	    (!) DEEP copying of MUTABLE-property-objects in constructor
	                
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(someMap);
    *
    *
    * }</pre>
    */ 
	public <T extends Map<? extends KEY, ? extends VALUE> & Serializable >  ${NAME}( T map )
		{
		//we uses Apache Commons library for deep copy
		super(   (T) SerializationUtils.clone( map )  );
		}
    
    
	/**                         
	*   fabric with parameter(map)
	*   Analogically to usual collections  
	*     
	    (!) DEEP copying of MUTABLE-property-objects in constructor
	                    
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.of(someMap);
    *
    *
    * }</pre>
    */ 

	public static  <T extends Map<? extends KEY, ? extends VALUE> & Serializable >  ${NAME} newMap(T map )
		{
		return new ${NAME} ( map );
		}
    
    
    //////////////////////////////////////////////////////////////////////////////////
    //  "of" constructors                              
    //////////////////////////////////////////////////////////////////////////////////

    //<editor-fold desc="helper function">
    /*                         
	*   helper function
	*   Analogically to List.of   
	*                      
        method mast be private or final because it called from constructor
    *
    *
    * }</pre>
    */ 
    //</editor-fold>
    
    
    /**                         
	*   helper method for constructors and fabrics for adding multiple (..Key,Value)
	*
	*   uses PUT method ot THIS class
	*                      
    */ 
        private void MapN(Object... input) {
            if ((input.length & 1) != 0) { // implicit nullcheck of input
                throw new IllegalArgumentException("length is odd");
            }
           

            for (int i = 0; i < input.length; i += 2) {
                //@SuppressWarnings("unchecked")
                    KEY k = Objects.requireNonNull((KEY)input[i]);
                //@SuppressWarnings("unchecked")
                    VALUE v = Objects.requireNonNull((VALUE)input[i+1]);
                    
                boolean isKeyAlreadyExists = super.containsKey(k);
                
                if (isKeyAlreadyExists) {
                    throw new IllegalArgumentException("duplicate key: " + k);
                } else {
                    /* super. is necessary because we should not call overrided methods in constructor*/
                    super.put(k,v);
                }
            }
        }

    
    
  

    /**                         
	*   constructor with paramter 1
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1");
    *
    *
    * }</pre>
    */ 
    public ${NAME} (KEY k1, VALUE v1) {
        super(1);
        MapN(k1, v1);
    }

    
    /**                         
	*   constructor with paramter 2
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2");
    *
    *
    * }</pre>
    */ 
    public ${NAME} (KEY k1, VALUE v1, KEY k2, VALUE v2) {
        super(2);
        MapN(k1, v1, k2, v2);
    }

        /**                         
	*   constructor with paramter 3
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3");
    *
    *
    * }</pre>
    */ 
    public ${NAME} (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3) {
        super(3);
        MapN(k1, v1, k2, v2, k3, v3);
    }

    /**                         
	*   constructor with paramter 4
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4");
    *
    *
    * }</pre>
    */ 
    public ${NAME}  (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4) {
        super(4);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4);
    }

     /**                         
	*   constructor with paramter 5
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    *
    *
    * }</pre>
    */ 
    public ${NAME}  (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5) {
        super(5);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
    }

         /**                         
	*   constructor with paramter 6
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    *
    *
    * }</pre>
    */ 
    public ${NAME}  (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6) {
        super(6);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6);
    }

          /**                         
	*   constructor with paramter 7
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    *
    *
    * }</pre>
    */ 
    public ${NAME} (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7) {
        super(7);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7);
    }

            /**                         
	*   constructor with paramter 8
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    *
    *
    * }</pre>
    */ 
    public ${NAME}  (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7, KEY k8, VALUE v8) {
        super(8);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7, k8, v8);
    }

               /**                         
	*   constructor with paramter 9
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    *
    *
    * }</pre>
    */ 
    public ${NAME}  (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7, KEY k8, VALUE v8, KEY k9, VALUE v9) {
        super(9);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7, k8, v8, k9, v9);
    }

                 /**                         
	*   constructor with paramter 10
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    *
    *
    * }</pre>
    */ 
    public ${NAME} (KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7, KEY k8, VALUE v8, KEY k9, VALUE v9, KEY k10, VALUE v10) {
        super(10);
        MapN(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7, k8, v8, k9, v9, k10, v10);
    }

	
    
    //////////////////////////////////////////////////////////////////////////////////
    //  "of" fabrics                              
    //////////////////////////////////////////////////////////////////////////////////

       /**                         
	*   fabric with paramter 0
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of();
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of() {
        return new ${NAME}();
    }

    /**                         
	*   fabric with paramter 1
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key","value");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of(KEY k1, VALUE v1) {
        return new ${NAME} (k1, v1);
    }

    
    /**                         
	*   fabric with paramter 2
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2) {
        return new ${NAME} (k1, v1, k2, v2);
    }

        /**                         
	*   fabric with paramter 3
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3);
    }

    /**                         
	*   fabric with paramter 4
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME} of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3, k4, v4);
    }

     /**                         
	*   fabric with paramter 5
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
    }

         /**                         
	*   fabric with paramter 6
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    *
    *
    * }</pre>
    */ 
   public  static   ${NAME} of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6);
    }

          /**                         
	*   fabric with paramter 7
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    *
    *
    * }</pre>
    */ 
    public static  ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7);
    }

            /**                         
	*   fabric with paramter 8
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    *
    *
    * }</pre>
    */ 
   public  static   ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7, KEY k8, VALUE v8) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7, k8, v8);
    }

               /**                         
	*   fabric with paramter 9
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7, KEY k8, VALUE v8, KEY k9, VALUE v9) {
        return new ${NAME}(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7, k8, v8, k9, v9);
    }

                 /**                         
	*   fabric with paramter 10
	*   Analogically to Map.of   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    *
    *
    * }</pre>
    */ 
    public static   ${NAME}  of(KEY k1, VALUE v1, KEY k2, VALUE v2, KEY k3, VALUE v3, KEY k4, VALUE v4, KEY k5, VALUE v5,
                               KEY k6, VALUE v6, KEY k7, VALUE v7, KEY k8, VALUE v8, KEY k9, VALUE v9, KEY k10, VALUE v10) {
        return new ${NAME} (k1, v1, k2, v2, k3, v3, k4, v4, k5, v5,
                                               k6, v6, k7, v7, k8, v8, k9, v9, k10, v10);
    }

	
	
	
	
#parse("implementation.java")




#parse("checkmutableequals.java")
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
    //  add your own methods                              
    //////////////////////////////////////////////////////////////////////////////////

 
	
	//<editor-fold desc="some method">
    /* 
    
    public privateFinal protectedPackage _package_ final
    throws Exception, VX_myxception
    @Override
    */
    //</editor-fold>
    
    
	/**
	 * method f_method
	 *
	 *
	 * !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *            - генерирую runtime ошибки программирования
	 *            - генерирую runtime ошибки выполнения метода, если метод не вернет то что должен
	 *
	 *
	 * example 2
	 *
	 *           v_obj.f_method("test");
	 *
	 * example 3
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
	public void compute( final String p_1 )
		{
        #parse("checkmutable.java")


        //<editor-fold desc="additionally">
        /* 
        
        log_.debug( "MyList f_method: " + p_1 );
        super.f_method(p_1);
        
        */
        //</editor-fold>
        
        
		return;
		}
		
		
	}
