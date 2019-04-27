	/** {@inheritDoc}
	  *
	 * method f_method
	 *
	 *
	 * 
	 *
	 
	  * @implSpec !CHANGE_ME_DESCRIPTION!: The method does'not call other public methods.
      * @implNote в джавадоке нужно раскрыть детали реализации методов 
                    и указать какие из переопределяемых методов он использует сам
                    
                    здесь используется ПАТТЕРН PIRIVATE/FINAL HELPER МЕТОДОВ ВЫЗЫВАЮЩИХСЯ ИЗ МЕТОДОВ (КОТОРЫЕ БУДУТ ПЕРЕОПРЕДЕЛЯТЬСЯ)
                        - используются в классах спроектированных для наследования, чтобы детали реализации не утекли в подклассы
                        - в классе для наследовния используйте helper method'ы
                            - для каждого открытого метода создайте закрытый аналог(helper method)
                            - внутри каждого открытого метода должны быть только вызовы зарытых аналогов
                            - helper method'ы должны вызывать только друг друга, а не открытые методы чтобы избежать вызова отнаследованного класса

	 
	 
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *            - генерирую runtime ошибки программирования
	 *            - генерирую runtime ошибки выполнения метода, если метод не вернет то что должен
	 *
	 *
	 * example 2
	 *
	 *           v_obj.f_method("test");
	 *
	 * example 3
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
 
	public void compute(@NotNull final String string )
		{
		
        compute(string);

		}
		
		
	private void compute_(@NotNull final String string )
		{
		
        #parse("checkmutable.java")


#parse("methodcompute.java")

         
        Objects.requireNonNull( string );
		
		setDefaultValuesForUnsettedProperties_();
		assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();
		}	