package necromancer.schema

import necromancer.Transformation
import necromancer.generator.ValueGenerator

class ColumnSpec(
		val header : String,
		val generator : ValueGenerator,
		val transformation : Transformation
){
	
}