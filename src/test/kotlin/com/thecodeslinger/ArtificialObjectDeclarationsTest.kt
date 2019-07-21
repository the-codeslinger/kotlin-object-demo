package com.thecodeslinger

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ArtificialObjectDeclarationsTest {

    private val expectedAnswer = 42

    @Test
    fun test_companion_object() {
        assertThat(ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION)
            .isEqualTo(expectedAnswer)
    }

    @Test
    fun test_named_object() {
        assertThat(ArtificialObjectDeclarations.NamedObject.NAMED_ANSWER_TO_THE_ULTIMATE_QUESTION)
            .isEqualTo(expectedAnswer)
    }

    @Test
    fun test_java_artificial_static() {
        assertThat(ArtificialExampleJ.THE_ANSWER_TO_THE_ULTIMATE_QUESTION)
            .isEqualTo(expectedAnswer)
    }

    @Test
    fun test_singleton() {
        assertThat(ArtificialSingleton.tellMeTheValue()).isEqualTo(0)
        assertThat(ArtificialSingleton.tellMeTheValue()).isEqualTo(1)
    }

    @Test
    fun test_inner_singleton() {
        // Not compiling.
        // val artificial = ArtificialObjectDeclarations()
        // artifical.InnerSingleton.tellMeTheValue
        //          ^ InnerSingleton cannot be accessed through instance of parent.

        // Nested objects are accessed through the parent class' name. They are singletons.
        val inner1 = ArtificialObjectDeclarations.InnerSingleton
        val inner2 = ArtificialObjectDeclarations.InnerSingleton

        assertThat(inner1.tellMeTheValue()).isEqualTo(0)
        assertThat(inner2.tellMeTheValue()).isEqualTo(1)
        assertThat(inner1).isEqualTo(inner2)

        // This is the same as...
        assertThat(ArtificialObjectDeclarations.InnerSingleton.tellMeTheValue()).isEqualTo(2)
        assertThat(ArtificialObjectDeclarations.InnerSingleton.tellMeTheValue()).isEqualTo(3)
    }
}
