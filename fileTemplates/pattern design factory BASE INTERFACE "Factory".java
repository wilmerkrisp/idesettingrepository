#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end


#parse("File Header.java")


/**
 * interface FACTORY
 * <pre>{@code
 *
 *
 * example 1
 *
 *              VC_somesubclass                  implements Factory<String>
 *              VI_somesubinterface              extends    Factory<String>
 *              VCG_somesubclass< T >        implements Factory< T >
 *              VIG_somesubinterface< T >    extends    Factory< T >
 *
 *
 *              NO NEW(). Need implementation.
 *              NO constructors
 *              NO propertes  (only static final constants allowed)
 *              static methods allowed
 *
 *
 *
 * example 3
 *
 *               boolean v_check = v_obj instanceof Factory<?> ;
 *               !no instanceof Factory<String>
 *
 *
 *
 * }</pre>
 */

public interface ${NAME}<  T  >
	{
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              methods for implementation
	//
	//////////////////////////////////////////////////////////////////////////////////  
	
	/**
	 * method need implementation (with GENERIC parameter GENERIC result)
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *
	 *           String v_string = v_obj.f_test("str");
	 *
	 *
	 * example 2
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 *
	 *
	 * }</pre>
	 */
	//      throws Exception, VX_myxception 
	//      @Override  
	public  T  create( );
		
		
	}
    
 