#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


#parse("File Header.java")




/**
			 *                      PROXY pattern USE REFLECTION DYNAMIC PROXY
 * <pre>{@code
 *
 *
 * example 1
 *              VI_SomeInterface v_realObj = new VC_someclass();
 *              VI_SomeInterface v_proxyObj=(VI_SomeInterface)VC_handler.f_getProxyObject(VI_SomeInterface.class,v_realObj);
 *              v_realObj.f_method();
 *              v_proxyObj.f_method();

 *
 *
 * }</pre>
 */
public class ${NAME} implements InvocationHandler
	{
	
	
	#parse("fields.java")
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              variables
	//
	//////////////////////////////////////////////////////////////////////////////////  
	/**
	 * log4j debug massage
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *
	 *           log.debug   ( "app5 life.expert.packk.dynam VC_handler:  " );
	 * 	        log.info    ( "app5 life.expert.packk.dynam VC_handler:  " );
	 * 	        log.warn    ( "app5 life.expert.packk.dynam VC_handler:  " );
	 * 	        log.error   ( "app5 life.expert.packk.dynam VC_handler:  " );
	 *
	 * example 2
	 *
	 *
	 *
	 *
	 * }</pre>
	 */
	private static final Logger log = LogManager.getLogger( ${NAME}.class );
	
	/**
	 * variable test
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *
	 *           this.c_test
	 *
	 *
	 * example 2
	 *
	 *           - property not overrided, instead use getters/seters
	 *
	 *
	 *
	 * }</pre>
	 */
	//      privateFinal public protectedPackage _package_ NOFINAL   
	private final Object c_proxied_object;
	
	
	
	#parse("constructors.java")
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              constructors/initializers
	//
	//////////////////////////////////////////////////////////////////////////////////  
	
	
	
	
	/**
	 * constructor WITHOWT PARAMETERS NOT ALLOWED
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */
	private ${NAME}( )
		{
		//super();  OR this("")
		//log.debug   ( "app5 life.expert.packk.dynam VC_handler  CONSTRUCTOR: " );
		this.c_proxied_object = null;
		}
	
	
	
	
	/**
	 * constructor with parameter
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           VC_handler v_obj = new VC_handler("param");
	 *
	 *
	 * example 2
	 *
	 *           - constructor is a static method
	 *           - constructor is not template method, inside constructor CALL only final,private,super methods
	 *
	 *
	 *
	 * }</pre>
	 */
	private ${NAME}( final Object p_proxiedObject )
		{
		
		this.c_proxied_object = p_proxiedObject;
			
		}
	
	
	
	
	/**
	 * FABRIC METHOD get proxy
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *              VI_SomeInterface v_realObj = new VC_someclass();
	 *              VI_SomeInterface v_proxyObj=(VI_SomeInterface)VC_handler.f_getProxyObject(VI_SomeInterface.class,v_realObj);
	 *              v_realObj.f_method();
	 *              v_proxyObj.f_method();
	 *
	 *
	 * }</pre>
	 */
	public static final Object f_getProxyObject( final Class< ? > p_interfaceClass ,
	                                             Object p_proxiedObject )
		{
		Class[] v_interface = { p_interfaceClass };
		${NAME} v_1 = new ${NAME}( p_proxiedObject );
		Object v_proxy = Proxy.newProxyInstance( p_interfaceClass.getClassLoader( ) ,
		                                         v_interface ,
		                                         v_1 );
		
		//
		return v_proxy;
		}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              methods
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	/**
	 * Processes a method invocation on a proxy instance and returns
	 * the result.  This method will be invoked on an invocation handler
	 * when a method is invoked on a proxy instance that it is
	 * associated with.
	 *
	 * @param proxy  the proxy instance that the method was invoked on
	 * @param method the {@code Method} instance corresponding to
	 *               the interface method invoked on the proxy instance.  The declaring
	 *               class of the {@code Method} object will be the interface that
	 *               the method was declared in, which may be a superinterface of the
	 *               proxy interface that the proxy class inherits the method through.
	 * @param args   an array of objects containing the values of the
	 *               arguments passed in the method invocation on the proxy instance,
	 *               or {@code null} if interface method takes no arguments.
	 *               Arguments of primitive types are wrapped in instances of the
	 *               appropriate primitive wrapper class, such as
	 *               {@code java.lang.Integer} or {@code java.lang.Boolean}.
	 *
	 * @return the value to return from the method invocation on the
	 * proxy instance.  If the declared return type of the interface
	 * method is a primitive type, then the value returned by
	 * this method must be an instance of the corresponding primitive
	 * wrapper class; otherwise, it must be a type assignable to the
	 * declared return type.  If the value returned by this method is
	 * {@code null} and the interface method's return type is
	 * primitive, then a {@code NullPointerException} will be
	 * thrown by the method invocation on the proxy instance.  If the
	 * value returned by this method is otherwise not compatible with
	 * the interface method's declared return type as described above,
	 * a {@code ClassCastException} will be thrown by the method
	 * invocation on the proxy instance.
	 *
	 * @throws Throwable the exception to throw from the method
	 *                   invocation on the proxy instance.  The exception's type must be
	 *                   assignable either to any of the exception types declared in the
	 *                   {@code throws} clause of the interface method or to the
	 *                   unchecked exception types {@code java.lang.RuntimeException}
	 *                   or {@code java.lang.Error}.  If a checked exception is
	 *                   thrown by this method that is not assignable to any of the
	 *                   exception types declared in the {@code throws} clause of
	 *                   the interface method, then an
	 *                   {@link UndeclaredThrowableException} containing the
	 *                   exception that was thrown by this method will be thrown by the
	 *                   method invocation on the proxy instance.
	 * @see UndeclaredThrowableException
	 */
	@Override
	public Object invoke( final Object p_proxy ,
	                      final Method p_method ,
	                      final Object[] p_args ) throws Throwable
		{
		//log invokation
		log.debug( "PROXY{{  " + p_proxy.getClass( ) + "  }} METHOD{{  " + p_method +"  }}");
		// get args
		if( p_args != null )
			{
			for( Object v_i : p_args )
				{
				//log args
				log.debug( "                PARAM{{ " + v_i +" }}");
				}
			}
		// call real object
		Object v_rezult = p_method.invoke( c_proxied_object ,
		                                   p_args );
		
		return null;
		}
	}
