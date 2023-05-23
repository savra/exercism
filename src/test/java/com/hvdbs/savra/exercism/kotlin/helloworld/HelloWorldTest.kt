package com.hvdbs.savra.exercism.kotlin.helloworld

import hello
import org.junit.Assert.assertEquals
import org.junit.Test

class HelloWorldTest {

    @Test
    fun helloWorldTest() {
        assertEquals("Hello, World!", hello())
    }

}
