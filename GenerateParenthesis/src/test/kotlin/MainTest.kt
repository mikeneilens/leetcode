import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "inserting a after 0 into abc gives axyz" {
        "xyz".toList().insertAfter('a',0) shouldBe listOf('a','x','y','z')
    }
    "inserting a after 1 into abc gives xayz" {
        "xyz".toList().insertAfter('a',1) shouldBe listOf('x','a','y','z')
    }
    "inserting a after 2 into abc gives xyaz" {
        "xyz".toList().insertAfter('a',2) shouldBe listOf('x','y','a','z')
    }
    "inserting a after 3 into abc gives xyza" {
        "xyz".toList().insertAfter('a',3) shouldBe listOf('x','y','z','a')
    }
    "addBrace to Set('()' witn n = 2 should return set of '(())', '(),()' )" {
        addBraces(2, setOf("()")) shouldBe setOf("(())","()()")
    }
    "addBrace to Set('()' witn n = 3 should return set of '((()))','(()())','(())()','()(())','()()()' )" {
        addBraces(3, setOf("()")) shouldBe setOf("((()))","(()())","(())()","()(())","()()()")
    }
    "when n=0 generate an empty set" {
        generateParenthesis(0) shouldBe emptySet()
    }
    "when n=1 generate paranthesis of ()" {
        generateParenthesis(1) shouldBe setOf("()")
    }
    "when n=2 generate paranthesis of '(())', '(),()' " {
        generateParenthesis(2) shouldBe setOf("(())","()()")
    }
    "when n=3 generate paranthesis of '((()))','(()())','(())()','()(())','()()()' " {
        generateParenthesis(3) shouldBe setOf("((()))","(()())","(())()","()(())","()()()")
    }

})