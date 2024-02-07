import java.util.UUID

// Enum class representing different types of entities
enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    // Function to capitalize the first letter of the enum constant name
    fun getFormatted() = name.toLowerCase().capitalize()
}

// Object representing a factory to create instances of Entity
object EntityFactory {
    fun create(type: EntityType): Entity {
        // Generate a random UUID for the entity
        val id = UUID.randomUUID().toString()

        // Determine the name of the entity based on the provided type
        val name = when (type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormatted()
            EntityType.HARD -> type.name
            EntityType.HELP->type.getFormatted()
        }

        // Return different types of Entity objects based on the provided EntityType
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP-> Entity.Help
        }
    }
}

// Sealed class representing different types of entities
sealed class Entity {
    // Object representing a Help entity
    object Help: Entity (){
        val name = "HELP"
    }

    // Data class representing an Easy entity
    data class Easy(val id: String, val name: String) : Entity()

    // Data class representing a Medium entity
    data class Medium(val id: String, val name: String) : Entity()

    // Data class representing a Hard entity
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

// Main function demonstrating the creation of different types of entities
fun main() {


    val entity:Entity=EntityFactory.create(EntityType.HELP)
    val msg=when (entity){
        is Entity.Easy -> "easy class"
        is Entity.Hard -> "easy class"
        Entity.Help -> "help class"
        is Entity.Medium -> "hard class"
    }
    println(msg)
}
