	/**
	 * Check properties of object for null value
	 * return true if object is valid and properties is NOT null
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForNullProperties(   )
		{
		assertForNullProperties_( );
		return true;
		}
	
	
	
	/**
	 * Check properties of object for valid value
	 * return true if object is valid and properties is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForValidProperties(   )
		{
		assertForValidProperties_(  );
		return true;
		}
	
	
	
	/**
	 * Check consistency of properties of object
	 * return true if object is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForConsistencyProperties( )
		{
		assertForConsistencyProperties_(  );
		return true;
		}
	
	
	 
	
	private ${NAME}  assertForNullProperties_( )
		{
    
		#if (${T1} != "") Objects.requireNonNull( item1 ); #end
        #if (${T2} != "") Objects.requireNonNull( item2 ); #end
        #if (${T3} != "") Objects.requireNonNull( item3 ); #end
        #if (${T4} != "") Objects.requireNonNull( item4 ); #end
        #if (${T5} != "") Objects.requireNonNull( item5 ); #end
        #if (${T6} != "") Objects.requireNonNull( item6 ); #end
        #if (${T7} != "") Objects.requireNonNull( item7 ); #end
        #if (${T8} != "") Objects.requireNonNull( item8 ); #end
        #if (${T9} != "") Objects.requireNonNull( item9 ); #end
     
		
		return this;
		}
	
	
	 

	private ${NAME}   assertForValidProperties_(  )
		{
#if (${T1} != "")
		if( item1.equals(item1DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item1Message_()) );
#end
	    
#if (${T2} != "")
        if( item2.equals(item2DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item2Message_()) );
#end

#if (${T3} != "")  
		if( item3.equals(item3DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item3Message_()) );
#end

#if (${T4} != "")
		if( item4.equals(item4DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item4Message_()) );
#end

#if (${T5} != "")
		if( item5.equals(item5DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item5Message_()) );
#end

#if (${T6} != "")
		if( item6.equals(item6DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item6Message_()) );
#end

#if (${T7} != "")
		if( item7.equals(item7DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item7Message_()) );
#end

#if (${T8} != "")
		if( item8.equals(item8DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item8Message_()) );
#end

#if (${T9} != "")
		if( item9.equals(item9DefaultValue_()) )
		     throw new IllegalArgumentException( argumentIsDefaultMessage_(item9Message_()) );
#end
	
 	    return this;
		}
	
	
	 

	private ${NAME}  assertForConsistencyProperties_( )
		{
		return this;
		}
	
	
	 
	
	private ${NAME}   logForNullProperties_()
		{	
#if (${T1} != "")		
		if(  item1 == null )
			{
			log_.info( argumentIsNullMessage_( item1Message_()) );
			}
#end
#if (${T2} != "")			
		if(  item2 == null )
			{
			log_.info( argumentIsNullMessage_(item2Message_()) );
			}
#end
#if (${T3} != "")			
		if(  item3 == null )
			{
			log_.info( argumentIsNullMessage_(item3Message_()) );
			}
#end
#if (${T4} != "")			
		if(  item4 == null )
			{
			log_.info( argumentIsNullMessage_(item4Message_()) );
			}
#end
#if (${T5} != "")			
		if(  item5 == null )
			{
			log_.info( argumentIsNullMessage_(item5Message_()) );
			}
#end
#if (${T6} != "")			
		if(  item6 == null )
			{
			log_.info( argumentIsNullMessage_(item6Message_()) );
			}
#end
#if (${T7} != "")			
		if(  item7 == null )
			{
			log_.info( argumentIsNullMessage_(item7Message_()) );
			}
#end
#if (${T8} != "")			
		if(  item8 == null )
			{
			log_.info( argumentIsNullMessage_(item8Message_()) );
			}

#end
#if (${T9} != "")			
		if(  item9 == null )
			{
			log_.info( argumentIsNullMessage_(item9Message_()) );
			}
#end		
		return this;
		}
	
	
	 
	
	private ${NAME}   logForValidProperties_()
		{
		#if (${T1} != "")
		if( item1.equals(item1DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_( item1Message_())  );
			}
		#end
#if (${T2} != "")	
		if( item2.equals(item2DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ (item2Message_ ()) );
			}
			#end
#if (${T3} != "")
		if( item3.equals(item3DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item3Message_())  );
			}
			#end
#if (${T4} != "")	
		if( item4.equals(item4DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item4Message_())  );
			}
        #end
#if (${T5} != "")
        if( item5.equals(item5DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item5Message_())  );
			}
			#end
#if (${T6} != "")
		if( item6.equals(item6DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item6Message_())  );
			}
#end
#if (${T7} != "")
		if( item7.equals(item7DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item7Message_())  );
			}
#end
#if (${T8} != "")	

		if( item8.equals(item8DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item8Message_()) );
			}
#end
#if (${T9} != "")
		if( item9.equals(item9DefaultValue_()) )
			{
			log_.info( argumentIsDefaultMessage_ ( item9Message_())  );
			}
		#end
		return this;
		}
	
	
	 
	
	private ${NAME}   logForConsistencyProperties_( )
		{
		//log_.info( "Object inconsistent." );
		return this;
		}
	
	
	
