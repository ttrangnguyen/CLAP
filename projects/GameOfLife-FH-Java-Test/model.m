GameOfLife : Composed* [Options] View Model :: _GameOfLife ;

Composed : UndoRedoGenerator
	| UndoRedoTest
	| UndoRedoGuiBase ;

Options : [UndoRedo] [Test] Generator [IO] [PopUpMenu] :: _Options ;

Generator : [GeneratorSelection] DefaultGenerator ConcretGenerator+ AbstractGenerator :: _Generator ;

DefaultGenerator : RandomDefaultGenerator
	| FormDefaultGenerator ;

ConcretGenerator : RandomGenerator
	| FormGenerator ;

View : [GuiBase] :: _View ;

Model : [ModelBase] :: _Model ;

%%

UndoRedo and AbstractGenerator iff UndoRedoGenerator ;
UndoRedo and Test iff UndoRedoTest ;
UndoRedo and GuiBase iff UndoRedoGuiBase ;
RandomGenerator and FormGenerator iff GeneratorSelection ;
RandomGenerator and not FormGenerator implies RandomDefaultGenerator ;
FormGenerator and not RandomGenerator implies FormDefaultGenerator ;
FormGenerator and RandomGenerator implies FormDefaultGenerator or RandomDefaultGenerator ;
GeneratorSelection implies GuiBase ;

##

Composed { hidden } 
Model { hidden } 
