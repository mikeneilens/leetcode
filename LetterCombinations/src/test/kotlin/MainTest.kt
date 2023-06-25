import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec ({

    "An empty string produces an empty list" {
        letterCombinations("") shouldBe emptyList()
    }
    "'1' produces as an empty list" {
        letterCombinations("1") shouldBe emptyList()
    }
    "'2' produces ['a','b','c']" {
        letterCombinations("2") shouldBe listOf("a", "b", "c")
    }
    "'23' produces ['ad','ae','af','bd','be','bf','cd','ce','cf',]" {
        letterCombinations("23") shouldBe listOf("ad","ae","af","bd","be","bf","cd","ce","cf")
    }
})