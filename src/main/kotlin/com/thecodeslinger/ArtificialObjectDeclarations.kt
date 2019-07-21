package com.thecodeslinger

class ArtificialObjectDeclarations {

    /**
     * Can be used to mimic Java static, but an actual object is created.
     */
    companion object {
        const val THE_ANSWER_TO_THE_ULTIMATE_QUESTION = 42

        fun companionFunction() : Int {
            return THE_ANSWER_TO_THE_ULTIMATE_QUESTION
        }
    }


    object NamedObject {
        const val NAMED_ANSWER_TO_THE_ULTIMATE_QUESTION = 42
    }

    object InnerSingleton {
        private var c = 0

        fun tellMeTheValue() : Int {
            return c++
        }
    }
}

/**
 * This object only exists once because it is a singleton. And you didn't have to do
 * anything fancy.
 */
object ArtificialSingleton {
    private var c = 0

    fun tellMeTheValue() : Int {
        // I even managed to get some c++ into Kotlin.
        return c++
    }
}