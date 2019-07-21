package com.thecodeslinger

import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JButton

class ArtificialObjectExpressions {

    fun anonymousObjects() {
        // Create a local object and reference its values.
        val qna = object {
            val question : String = "The ultimate question of life, universe and everything"
            val answer = ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION
        }

        println("The answer to ${qna.question} is ${qna.answer}")


        // Add listeners to a Swing gui widget.
        val guiWidget = JButton()

        // Implement single-method interface as lambda, just like in Java.
        guiWidget.addActionListener { e -> }

        // Create an anonymous object that implements MouseListener.
        guiWidget.addMouseListener(object : MouseListener {
            override fun mouseReleased(e: MouseEvent?) {}
            override fun mouseExited(e: MouseEvent?) {}
            override fun mousePressed(e: MouseEvent?) {}
            override fun mouseClicked(e: MouseEvent) {}
            override fun mouseEntered(e: MouseEvent) {}
        })
    }

    fun publicObjectReturned() = object {
        val question : String = "The ultimate question of life, universe and everything"
        val answer = ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION
    }

    fun publicObjectReturned2() : Any {
        val obj = object {
            val question: String = "The ultimate question of life, universe and everything"
            val answer = ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION
        }
        // Do something useful
        return obj
    }

    private fun privateObjectReturned() = object {
        val question : String = "The ultimate question of life, universe and everything"
        val answer = ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION
    }

    private fun privateObjectReturned2() : Any {
        val obj = object {
            val question : String = "The ultimate question of life, universe and everything"
            val answer = ArtificialObjectDeclarations.THE_ANSWER_TO_THE_ULTIMATE_QUESTION
        }
        // Do something private useful.
        return obj
    }

    fun returnedObjectUser() {
        // Not working, because the type is Any in this case.
        val publicReturn = publicObjectReturned()
        // println("Question ${publicReturn.question}")
        // println("Answer ${publicReturn.answer}")

        // Not working, for the same reason.
        val publicReturn2 = publicObjectReturned2()
        // println("Question ${publicReturn2.question}")
        // println("Answer ${publicReturn2.answer}")

        // Working.
        val privateReturn = privateObjectReturned()
        println("Question ${privateReturn.question}")
        println("Answer ${privateReturn.answer}")

        // Not working, because the return type is explicitly Any.
        val privateReturn2 = privateObjectReturned2()
        // println("Question ${privateReturn2.question}")
        // println("Answer ${privateReturn2.answer}")
    }
}