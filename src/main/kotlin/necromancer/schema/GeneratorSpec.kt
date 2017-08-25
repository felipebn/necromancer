package necromancer.schema

import necromancer.generator.ValueGenerator

class GeneratorSpec(
		val generator : ValueGenerator,
		val args : Array<String>,
		val blankRate : Double
){

	fun generate() : String{
		TODO()
	}	
	
	fun shouldBeBlank() : Boolean{
		TODO()
	}
}