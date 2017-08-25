package necromancer.schema

class Schema (
		val columns :List<ColumnSpec>,
		val quote :Char? = null,
		val lineBreak : String = "",
		val separator : String = ";"
){

		
}