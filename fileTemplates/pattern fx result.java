
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.jetbrains.annotations.*;                     //@NotNull
import java.util.function.*;                            //producer supplier
 

#parse("File Header.java")



/**
 * interface GENERIC
 * !CHANGE_ME_DESCRIPTION!

 */
public interface ${NAME} <T>
	{
	
	
	
		
	
	
	public static <T> ${NAME}<T> error( T immutableResult )
		{
		return new Error<T>( immutableResult );
		}
	
	
	
	public static <T> ${NAME}<T> success( T immutableResult )
		{
		return new Success<T>( immutableResult );
		}
	
	
	
	public   ${NAME}<T> onSuccess( Consumer<T> consumer );//{return this;};
	
	
	
	public   ${NAME}<T> onError( Consumer<T> consumer );//{return this;};
	
	
	
	public class Success<E>
		implements ${NAME}<E>
		{
		
		
		
		private final E result;
		
		
		
		public Success(@NotNull  final E immutableResult )
			{
			if( immutableResult == null )
				{
				throw new NullPointerException();
				}
			
			this.result = immutableResult;
			}
		
		
		
		@Override
		public ${NAME}<E> onSuccess( Consumer<E> consumer ) {consumer.accept( result );return this;}
		
		
		
		@Override
		public ${NAME}<E> onError( Consumer<E> consumer ){return this;};
		
		}
	
	
	
	
	
	
	
	
	
	public class Error<E>
		implements ${NAME}<E>
		{
		
		
		
		private final E result;
		
		
		
		public Error( @NotNull  final E immutableResult )
			{
			if( immutableResult == null )
				{
				throw new NullPointerException();
				}	 
			
			this.result = immutableResult;
			}
		
		
		
		@Override
		public ${NAME}<E> onSuccess( Consumer<E> consumer ) {return this;};
		
		
		
		@Override
		public ${NAME}<E> onError( Consumer<E> consumer ) {consumer.accept( result );return this;}
		
		}
		
		
	}