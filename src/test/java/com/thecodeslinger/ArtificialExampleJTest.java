package com.thecodeslinger;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtificialExampleJTest {

    private final int EXPECTED_ANSWER = 42;

    @Test
    public void test_static_member() {
        assertThat(ArtificialExampleJ.THE_ANSWER_TO_THE_ULTIMATE_QUESTION)
                .isEqualTo(EXPECTED_ANSWER);
    }

    @Test
    public void test_kotlin_artificial_companion_object() {
        assertThat(ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION)
                .isEqualTo(EXPECTED_ANSWER);
    }

    @Test
    public void test_kotlin_artificial_named_object() {
        assertThat(ArtificialObjectDeclarations.NamedObject.NAMED_ANSWER_TO_THE_ULTIMATE_QUESTION)
                .isEqualTo(EXPECTED_ANSWER);
    }

    @Test
    public void test_kotlin_compaion_function() {
        assertThat(ArtificialObjectDeclarations.Companion.companionFunction())
                .isEqualTo(EXPECTED_ANSWER);
    }
}
