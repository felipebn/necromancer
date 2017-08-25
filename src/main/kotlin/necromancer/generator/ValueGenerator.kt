package necromancer.generator

interface ValueGenerator {
	fun generate(vararg args : String) : String
}