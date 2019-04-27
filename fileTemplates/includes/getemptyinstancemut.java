#if(${uncomment1}==1)
	//<editor-fold desc=".">
	/* empty instance singleton
	
    1) ! замечаение для мутабельных классов: пожалуйста переделайте так чтобы переменная возвращала немутабельную версию класса
    2) ! пожалуйста укажите корректные пустые значения свойств
	*/
	//</editor-fold>	
#end
	
	private static final ${NAME} emptyInstance = new ${NAME}() { public boolean isDefault() { return true; } };
	
	/**
	 * fabric  = empty object
	 *
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj2 =  ${NAME}.getEmptyInstance();
	 *
	 * }</pre>
	 *
	 * @param  
	 * @return
	 */
	public static  ${NAME} getEmptyInstance( )
		{
		return emptyInstance;
		}