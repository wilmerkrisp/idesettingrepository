#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end





import java.util.Comparator;

#parse("File Header.java")




/**
 * simple mutable class
 * !CHANGE_ME_DESCRIPTION!
 *
 * inner comments: ${uncomment1}



 *
 #if(${forInheriatance}=="")
 	1) класс сделан final тк класс изначально не предназначался для наследования
 #else
 - этот тип предназанчен для наследования
 
 Конструкторы класса не должны вызывать переопределяемые методы, непосредственно или опосредованно.
    Нарушение этого правила может привестик аварийному завершению программы.
    Тк Конструктор суперкласса выполняется прежде конструктора подкласса,
 
 в джавадоке (в тегах @implSpec  @implNote ) нужно раскрыть детали реализации методов и указать какие из переопределяемых методов он использует сам
    тк наследование нарушает инкапсуляцию
    например, чтобы юзер знал что некоторый добавленный в overrided методы функционал  может сработать два раза (в случае когда AddAll вызывает Add)
 #end

    *   ${T1} ${T2} ${T3} ${T4} ${T5} ${T6} ${T7} ${T8} ${T9}
 
 

 
 
 */
 
 
 #if(${uncomment1}==1)
 //<editor-fold desc=".">
 /*
    
   
    
    
    5) refactor and rename properties
    
   
	j) есть и конструкторы и статик фабрики
	
	
 
 */
//</editor-fold>
#end



public #if(${forInheriatance}=="") final #end class ${NAME}
<
    #if (${T1} != "")   T1 #end
#if (${T2} != "") , T2 #end
#if (${T3} != "") , T3 #end
#if (${T4} != "") , T4 #end
#if (${T5} != "") , T5 #end
#if (${T6} != "") , T6 #end
#if (${T7} != "") , T7 #end
#if (${T8} != "") , T8 #end
#if (${T9} != "") , T9 #end
>
	{
	
    #parse("log.java")





#if (${T1} != "")
	private  T1 item1_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem1();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T1 getItem1()
		{
		return item1_;
		}
	
	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem1("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem1(@Nullable  final T1 item )
		{
		 this.item1_ = item;
		}
#end

#if (${T2} != "")
	private  T2 item2_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
    String v_stringTwo=v_objectTwo.getItem2();

	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T2 getItem2()
		{
		return item2_;
		}
	
	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem2("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem2(@Nullable  final T2 item )
		{
		this.item2_ = item;
		}
		
#end

#if (${T3} != "")
	private  T3 item3_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 *String v_stringTwo=v_objectTwo.getItem3();

	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T3 getItem3()
		{
		return item3_;
		}
	 /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem3("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem3(@Nullable  final T3 item )
		{
		this.item3_ = item;
		}
#end

#if (${T4} != "")
	private  T4 item4_;

	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem4();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T4 getItem4()
		{
		return item4_;
		}
	 /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem4("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem4(@Nullable  final T4 item )
		{
		this.item4_ = item;
		}
#end

#if (${T5} != "")
	private  T5 item5_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem5();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T5 getItem5()
		{
		return item5_;
		}
	 /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem5("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem5(@Nullable  final T5 item )
		{
		this.item5_ = item;
		}
#end

#if (${T6} != "")
	private  T6 item6_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem6();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T6 getItem6()
		{
		return item6_;
		}
	 /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem6("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem6(@Nullable  final T6 item )
		{
		this.item6_ = item;
		}
#end

#if (${T7} != "")
	private  T7 item7_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem7();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T7 getItem7()
		{
		return item7_;
		}
	 /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem7("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem7(@Nullable  final T7 item )
		{
		this.item7_ = item;
		}
#end

#if (${T8} != "")
	private  T8 item8_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem8();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T8 getItem8()
		{
		return item8_;
		}
	 /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem8("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem8(@Nullable  final T8 item )
		{
		this.item8_ = item;
		}
#end

#if (${T9} != "")
	private  T9 item9_;
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem9();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T9 getItem9()
		{
		return item9_;
		}
	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem9("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem9(@Nullable  final T9 item )
		{
		this.item9_ = item;
		}
#end


	//////////////////////////////////////////////////////////////////////////////////
	//  constructors
	//////////////////////////////////////////////////////////////////////////////////


	
	 /**
	 * default constructor
	 
	 * pattern new-set-call:
	 * please use default constructor or constructor with very simple generic params
	 
	 *<pre>{@code
	 *          ${NAME} v_obj = new ${NAME}("Test");
	            ${NAME} v_obj = new ${NAME}();
	 *
	 * }</pre>
	 *
	 * @param
	 */
	public ${NAME}()
		{
		super();
		}
	
	
   
	  #parse("checkmutableconstructor.java")
	
	
	
	/** Constrictor with  ALL PARAMS
	
	
    #parse("constructorallparams.java")
    
    
    (!) Please change also constructor with object
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("Test");
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public ${NAME}(
#if (${T1} != "")  @Nullable final T1 item1 #end
#if (${T2} != ""), @Nullable final T2 item2 #end
#if (${T3} != ""), @Nullable final T3 item3 #end
#if (${T4} != ""), @Nullable final T4 item4 #end
#if (${T5} != ""), @Nullable final T5 item5 #end
#if (${T6} != ""), @Nullable final T6 item6 #end
#if (${T7} != ""), @Nullable final T7 item7 #end
#if (${T8} != ""), @Nullable final T8 item8 #end
#if (${T9} != ""), @Nullable final T9 item9 #end
	               )
		{
		super();
		
#if (${T1} != "")       this.item1_ = item1;#end
#if (${T2} != "")		this.item2_ = item2;#end
#if (${T3} != "")		this.item3_ = item3;#end
#if (${T4} != "")		this.item4_ = item4;#end
#if (${T5} != "")		this.item5_ = item5;#end
#if (${T6} != "")		this.item6_ = item6;#end
#if (${T7} != "")		this.item7_ = item7;#end
#if (${T8} != "")		this.item8_ = item8;#end
#if (${T9} != "")		this.item9_ = item9;#end
		}


	
	/**
	 * constructor with object
	 *
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 = new ${NAME}(v_obj1);
	 *
	 *
	 *
	 *
	 *
	 * }</pre>
	 *
	 * @param tuple
	 */
	public ${NAME}(@NotNull final ${NAME}
	 <
#if (${T1} != "")   ? extends T1 #end
#if (${T2} != "") , ? extends T2 #end
#if (${T3} != "") , ? extends T3 #end
#if (${T4} != "") , ? extends T4 #end
#if (${T5} != "") , ? extends T5 #end
#if (${T6} != "") , ? extends T6 #end
#if (${T7} != "") , ? extends T7 #end
#if (${T8} != "") , ? extends T8 #end
#if (${T9} != "") , ? extends T9 #end
	 >
	 tuple )
		{
  

		#parse("checkimmutable.java")


#parse("constructorwithobject.java")
        
        this(
#if (${T1} != "")  tuple.getItem1()#end
#if (${T2} != ""), tuple.getItem2()#end
#if (${T3} != ""), tuple.getItem3()#end
#if (${T4} != ""), tuple.getItem4()#end
#if (${T5} != ""), tuple.getItem5()#end
#if (${T6} != ""), tuple.getItem6()#end
#if (${T7} != ""), tuple.getItem7()#end
#if (${T8} != ""), tuple.getItem8()#end
#if (${T9} != ""), tuple.getItem9()#end
		 		);
		 		
		 		
		}
	
	
    //////////////////////////////////////////////////////////////////////////////////
	//  fabrics
	//////////////////////////////////////////////////////////////////////////////////

	/**
	 * fabric with parameter
	 *
	<pre>{@code
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public static
<
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
	 >
${NAME}
 <
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
	 >
 of(
#if (${T1} != "")    @Nullable final E1 item1 #end
#if (${T2} != ""),   @Nullable final E2 item2 #end
#if (${T3} != ""),   @Nullable final E3 item3 #end
#if (${T4} != ""),   @Nullable final E4 item4 #end
#if (${T5} != ""),   @Nullable final E5 item5 #end
#if (${T6} != ""),   @Nullable final E6 item6 #end
#if (${T7} != ""),   @Nullable final E7 item7 #end
#if (${T8} != ""),   @Nullable final E8 item8 #end
#if (${T9} != ""),   @Nullable final E9 item9 #end
	               )
		{
		return new ${NAME}<> (
#if (${T1} != "") item1 #end
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
	 * fabric with object
	 *
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
	 *
	  серийные номеры и идентификаторы копировать ненадо
	 
	 
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 =  ${NAME}.of(v_obj1);
	 *
	 * }</pre>
	 *
	 * @param tuple
	 * @return
	 */
	public static
<
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
	 >
${NAME}
 <
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
	 >
 copyOf(@NotNull final ${NAME}
  <
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
	  >
  tuple )
		{
		return new ${NAME}<>  ( tuple);
		}
	
	/**
	 * fabric with object (deep copy)
	 *
	    (!) DEEP copying of MUTABLE-property-objects in constructor
	    
	     серийные номеры и идентификаторы копировать ненадо
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 =  ${NAME}.of(v_obj1);
	 *
	 * }</pre>
	 *
	 * @param tuple
	 * @return
	 */
	public static
<
#if (${T1} != "")   E1   #end
#if (${T2} != "") , E2   #end
#if (${T3} != "") , E3   #end
#if (${T4} != "") , E4   #end
#if (${T5} != "") , E5   #end
#if (${T6} != "") , E6   #end
#if (${T7} != "") , E7   #end
#if (${T8} != "") , E8   #end
#if (${T9} != "") , E9   #end
	 >
${NAME}
 <
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
	 >
 deepCopyOf(@NotNull final ${NAME}
  <
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
>
  tuple )
		{

		return  new ${NAME} <>(  deepCopyOfObject(tuple,  ${NAME}.class ) );
		}
	

	
	//////////////////////////////////////////////////////////////////////////////////
	//  add your own methods
	//////////////////////////////////////////////////////////////////////////////////
	
		private void checkConsistency_()
	    {
        #if (${T1} != "") /*checkState( object.getItem1()  );*/checkNotNull(  getItem1() );  #end
        #if (${T2} != "") /*checkState( object.getItem2()  );*/checkNotNull(  getItem2() );  #end
        #if (${T3} != "") /*checkState( object.getItem3()  );*/checkNotNull(  getItem3() );  #end
        #if (${T4} != "") /*checkState( object.getItem4()  );*/checkNotNull(  getItem4() );  #end
        #if (${T5} != "") /*checkState( object.getItem5()  );*/checkNotNull(  getItem5() );  #end
        #if (${T6} != "") /*checkState( object.getItem6()  );*/checkNotNull(  getItem6() );  #end
        #if (${T7} != "") /*checkState( object.getItem7()  );*/checkNotNull(  getItem7() );  #end
        #if (${T8} != "") /*checkState( object.getItem8()  );*/checkNotNull(  getItem8() );  #end
        #if (${T9} != "") /*checkState( object.getItem9()  );*/checkNotNull(  getItem9() );  #end
	    }
	
     
    private boolean isConsistent()
	    {		
        #if (${T1} != "") if( getItem1()==null ) return false;  #end
        #if (${T2} != "") if( getItem1()==null ) return false;  #end
        #if (${T3} != "") if( getItem1()==null ) return false;   #end
        #if (${T4} != "") if( getItem1()==null ) return false;   #end
        #if (${T5} != "") if( getItem1()==null ) return false;   #end
        #if (${T6} != "") if( getItem1()==null ) return false;   #end
        #if (${T7} != "") if( getItem1()==null ) return false;   #end
        #if (${T8} != "") if( getItem1()==null ) return false;   #end
        #if (${T9} != "") if( getItem1()==null ) return false;   #end
        return true;
	    }
	
 
	
     
    	
	 
	 #parse("checkmutable.java")

#parse("methodcompute.java")


	 /**
	 	  *  1) no method args, because all inside props
 *
 *  2) количество параметров должно быть не более 4-х, иначе:
 *   	- разбить метод на несколько (как например в NEW-SET-CALL для каждого параметра отдельный сетер)
 *   	- вынести группу параметров в value-класс (nested static) (helper class)
 *   	- все параметры зашить в паттерн билдер, где параметры можно присваивать по-очереди (так что билдер применим и на мутабельном объекте)
 *
	 
	 */


#if(${forInheriatance}=="")
 	 
 	 /**
 
     @throws IllegalStateException if some object's property null or empty
     @return empty value if input argument empty (or if one collection's element is empty)
     */
 	 	public Optional<String> compute(@NotNull final String string )
            {
            if (string==null|| string.isBlank() ||!isConsistent_() )
	            return Optional.empty();
           
            return Optional.ofNullable(string);
            }
		
    #else
        
        /**
        * @implSpec !CHANGE_ME_DESCRIPTION!: The method does'not call other public methods.
        * @implNote в джавадоке нужно раскрыть детали реализации методов
                    и указать какие из переопределяемых методов он использует сам
                    
                    здесь используется ПАТТЕРН PIRIVATE/FINAL HELPER МЕТОДОВ ВЫЗЫВАЮЩИХСЯ ИЗ МЕТОДОВ (КОТОРЫЕ БУДУТ ПЕРЕОПРЕДЕЛЯТЬСЯ)
                        - используются в классах спроектированных для наследования, чтобы детали реализации не утекли в подклассы
                        - в классе для наследовния используйте helper method'ы
                            - для каждого открытого метода создайте закрытый аналог(helper method)
                            - внутри каждого открытого метода должны быть только вызовы зарытых аналогов
                            - helper method'ы должны вызывать только друг друга, а не открытые методы чтобы избежать вызова отнаследованного класса
        
        
 
        @throws IllegalStateException if some object's property null or empty
        @return empty value if input argument empty (or if one collection's element is empty)
        */
    
        public Optional<String> compute(@NotNull final String string )
            {
            if (string==null|| string.isBlank() ||!isConsistent_() )
	            return Optional.empty();
            
            
            return compute_(string);
            }
    
     	 private Optional<String> compute_(@NotNull final String string )
            {
            //assert !string.isBlank():"Please put not blank string";
            
            return Optional.ofNullable( string );;
            }
    	
    	
    	/**
    	@throws IllegalStateException if some object's property null or empty
    	*/
    	public void checkConsistency()
            {
            checkConsistency_(object);
            }

    	public boolean isConsistent()
            {
            return isConsistent();
            }
    	
    #end
		
		
		
		
		
	}
