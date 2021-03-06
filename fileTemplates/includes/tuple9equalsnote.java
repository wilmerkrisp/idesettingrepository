	-   Если класс реализует интерфейс, который уточняет соглашения для метода equals, то в качестве типа указывайте этот интерфейс, что позволит выполнять сравнение классов, реализующих этот интерфейс. 
	    - вы должны получать доступ к значимым полям аргумента, используя методы самого интерфейса. 
	    - Если же тип аргумента определен как класс, то, в зависимости от условий, вам, возможно, удастся получить прямой доступ к полям аргумента

    -  фундаментальная проблема эквивалентных отношений в объектно ориентированных языках. 
	    - Не существует способа расширить класс, порождающий экземпляры, и добавить к нему компонент значения, сохранив при этом соглашения для метода equals. 
	    - Проблема решается заменой наследования на композицию

    -  Чтобы добиться наилучшей производительности, вы должны в первую очередь сравнивать те поля, которые будут различаться с большей вероятностью, либо те, которые сравнивать проще.
    