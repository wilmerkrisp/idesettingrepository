#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.AbstractCollection;
import java.util.Iterator;


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



public class ${NAME} extends AbstractCollection<String>
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
	
	
	private String[] fakes_ = { "one" ,
	                            "two" ,
	                            "three" ,
	                            "four" };
	                            
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              MUST implemented for collection
	//
	//////////////////////////////////////////////////////////////////////////////////  
	
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
	final public Iterator< String > iterator()
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
		implements Iterator< String >
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
		public boolean hasNext()
			{
			return index_ < fakes_.length;
			}
		
		
		
		@Override
		public String next()
			{
			//здесь можно реализовать паттерн легковес и возвращать всегда одно и то же множество пред-созданных объектов
			return fakes_[index_++];
			}
		
		
		
		/**
		 * deprecated for immutable
		 */
		@Override
		@Deprecated
		public void remove()
			{
			throw new UnsupportedOperationException();
			}
			
			
		}
		
    
		
		
		
		
		
		
		
		
		
	}

















































