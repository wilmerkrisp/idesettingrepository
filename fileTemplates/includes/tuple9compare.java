
		var c = 0;

#if (${T1} != "")		
		c = item1.compareTo( o.getItem1() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T2} != "")		
		c = item2.compareTo( o.getItem2() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T3} != "")		
		c = item3.compareTo( o.getItem3() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T4} != "")		
		c = item4.compareTo( o.getItem4() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T5} != "")
		c = item5.compareTo( o.getItem5() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T6} != "")			
		c = item6.compareTo( o.getItem6() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T7} != "")			
		c = item7.compareTo( o.getItem7() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T8} != "")			
		c = item8.compareTo( o.getItem8() );
		
		if( c != 0 )
			{
			return c;
			}
#end
#if (${T9} != "")		
		c = item9.compareTo( o.getItem9() );
		
		if( c != 0 )
			{
			return c;
			}
#end		
		return 0;

	