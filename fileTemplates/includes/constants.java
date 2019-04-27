
      
private static final String ARGUMENT_IS_NULL_MESSAGE_ = "Argument is null: ";       

        
private static final String ARGUMENT_IS_DEFAULT_MESSAGE_ = "Argument is empty/default: ";       

    	
private static final String FORMAT_STRING_ = "{0}[  #if (${T1} != "") item1:{1} #end    #if (${T2} != "") |item2:{2}    #end  #if (${T3} != "") |item3:{3}    #end  #if (${T4} != "") |item4:{4}    #end  #if (${T5} != "") |item5:{5}    #end  #if (${T6} != "") |item6:{6}    #end  #if (${T7} != "")  |item7:{7}   #end  #if (${T8} != "")  |item8:{8}   #end   #if (${T9} != "")  |item9:{9}   #end  ]";

    
    
 /**
	 * classic overrided method
	 * toString
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public String toString()
		{
        var this_addr=Integer.toHexString(System.identityHashCode(this));
        return MessageFormat.format(FORMAT_STRING_,this_addr
#if (${T1} != ""), item1 #end
#if (${T2} != ""),item2 #end
#if (${T3} != ""),item3 #end
#if (${T4} != ""),item4 #end
#if (${T5} != ""),item5 #end
#if (${T6} != ""),item6 #end
#if (${T7} != ""),item7 #end
#if (${T8} != ""),item8 #end
#if (${T9} != ""),item9 #end 
                                );
		
		}
    
    
    
    
 
 
 
 
 
 
 
 
	
	
	
	/**
	 * classic overrided method
	 * hashCode
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public int hashCode()
		{
		return Objects.hash(
#if (${T1} != "")   Objects.hashCode( item1 )#end
#if (${T2} != "") ,  Objects.hashCode( item2 )#end
#if (${T3} != "") ,  Objects.hashCode( item3 )#end
#if (${T4} != "")  , Objects.hashCode( item4 )#end
#if (${T5} != "")  , Objects.hashCode( item5 )#end
#if (${T6} != "")  , Objects.hashCode( item6 )#end
#if (${T7} != "") ,  Objects.hashCode( item7 )#end
#if (${T8} != "")  , Objects.hashCode( item8 )#end
#if (${T9} != "")  , Objects.hashCode( item9 ) #end
         );
		}
	
	           