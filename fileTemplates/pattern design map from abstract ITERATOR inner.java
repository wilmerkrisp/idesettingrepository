#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


#parse("File Header.java")






/**
 * my collection extended from abstract
 * <p>
 * <pre>{@code
 *
 * example1
 *                      1) change String to myType
 *                      2) remove or change c_fake property
 *
 * }</pre>
 */



public class ${NAME}
	extends AbstractMap< Integer, String >
	{
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              my props and methods
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	//<editor-fold desc="my private property">
		/*
		 - отсюда будем брать фейковые элементы, lazy load
		 */
	//</editor-fold>
	
	
	private String[][] fakes_ = { { "1" ,
	                                "one" } ,
	                              { "2" ,
	                                "two" } ,
	                              { "3" ,
	                                "three" } ,
	                              { "4" ,
	                                "four" } };
	
	//<editor-fold desc="my private property">
		/*
		 - set-синглетон
		 */
	//</editor-fold>
	
	
	private final Set< Entry< Integer, String > > instance_= new EntrySet();
	
	
	
	/**
	 *
	 *  1 overrided method
	 *
	 * <p>
	 * <pre>{@code
	 *
	 * example1
 
	 *
	 *
	 * }</pre>
	 * <p>
 
 
	 */
	@Override
	public Set< Entry< Integer, String > > entrySet()
		{
		return instance_;
		}
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              MUST implemented for collection
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	private class EntrySet
		extends AbstractSet< Entry< Integer, String > >
		{
		
		
		
		/**
		 * get collection size
		 * <p>
		 * <pre>{@code
		 *
		 * example1
		 *
		 *
		 * }</pre>
		 */
		@Override
		final public int size()
			{
			return fakes_.length;
			}
		
		
		
		/**
		 * method iterator (adapter2collection)
		 * <p>
		 * <pre>{@code
		 *
		 *
		 * example 1
		 *           0) add to class declaration
		 *              implements Iterable< elements >
		 *           1) change c_fake property to something useful
		 *           2) use iterator in LOOPs
		 *              for( Integer v_i : new thisclass( ) )
		 *                  log.debug   ("mainclass main for: "+v_i);
		 *
		 * }</pre>
		 */
		@Override
		final public Iterator< Entry< Integer, String > > iterator()
			{
			return new DefaultItrator();
			}
		
		
		
		//<editor-fold desc="iterator inner class for method iterator">
        /*
         - класс сделан приватным,тк будем возвращать только интерфейс Iterator<E>
         - класс inner (НЕ nested) чтобы иметь доступ к обычным свойствам внешнего класса
         
         
         */
		//</editor-fold>
		
 	
		
		private class DefaultItrator
			implements Iterator< Entry< Integer, String > >
			{
			
			
			
			//<editor-fold desc="my private property">
            /*
             - объект итератора хранит индекс текущего элемента во время итерирования
             - а сами элементы берет их внешнего класса
             */
			//</editor-fold>
			
			
			
			private int index_ = 0;
			
			
			
			//implemented methods from interface
			@Override
			public final boolean hasNext()
				{
				return index_ < fakes_.length;
				}
			
			
			
			@Override
			public final Entry< Integer, String > next()
				{
				//здесь можно реализовать паттерн легковес и возвращать всегда одно и то же множество пред-созданных объектов
				String[]                tuple = fakes_[index_];
				Entry< Integer, String > e     = Map.entry( Integer.parseInt( tuple[0] )  ,
				                                           tuple[1] );
				index_++;
				return e;
				}
			
			
			
			/**
			 * deprecated for immutable
			 */
			@Override
			@Deprecated
			public final void remove()
				{
				throw new UnsupportedOperationException();
				}
				
				
			}
			
		}
		
	}






