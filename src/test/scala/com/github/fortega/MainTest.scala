package com.github.fortega

import org.scalatest.flatspec.AnyFlatSpec

class MainTest extends AnyFlatSpec {
    "Main" should "contains message" in {
        assert(!Main.message.isEmpty)
    }

}