package necromancer.generator

import java.lang.IllegalArgumentException
import java.util.Random

enum class ValueGeneratorType : ValueGenerator{
	
	FIXED_VALUE{
		override fun generate(vararg args: String): String {
			return args[0]
		}
	},
	
	ANY_FROM_LIST{
		override fun generate(vararg args: String): String {
			val list = args[0].split(",").map { it.trim() }
			return list.get(randomInt(list.size))
		}
	},
	
	NUMBER{
		override fun generate(vararg args: String): String {
			TODO("must have a min and max")
		}
	},
	
	DECIMAL{
		override fun generate(vararg args: String): String {
			TODO("must have a min and max")
		}
	},
	
	TEXT{
		override fun generate(vararg args: String): String {
			TODO("Maybe allow to choose the language")
		}
	},
	
	DATE{
		override fun generate(vararg args: String): String {
			TODO("Indicate format")
		}
	},

	COUNTRY_CODE{
		override fun generate(vararg args: String): String {
			TODO()
		}
	},
	
	COUNTRY{
		override fun generate(vararg args: String): String {
			TODO()
		}
	},
	
	FROM_SERVICE_DATASET{
		override fun generate(vararg args: String): String {
			TODO("should receive the dataset code (compay, country, web_address, etc)")
		}
		override fun isFromServiceDataset() : Boolean = true
	},
	
	FROM_FILE_DATASET{
		override fun generate(vararg args: String): String {
			TODO()
		}
	}

	;
	
	fun randomInt() : Int{
		return randomInt(Integer.MAX_VALUE);
	}
	
	fun randomInt(max : Int) : Int{
		return Random(System.currentTimeMillis()).nextInt(max);
	}
	
	open fun isFromServiceDataset() : Boolean = false
}