import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "With Input: [], Output: []" {
        groupAnagrams(listOf()) shouldBe listOf()
    }
    "With Input: [''], Output: [['']]" {
        groupAnagrams(listOf("")) shouldBe listOf(listOf(""))
    }
    "With Input: ['a'], Output: [['a']]" {
        groupAnagrams(listOf("a")) shouldBe listOf(listOf("a"))
    }
    "With Input:['eat','tea','tan','ate','nat','bat'], Output:[['bat'],['nat','tan'],['ate','eat','tea']] " {
        val input = listOf("eat","tea","tan","ate","nat","bat")
        val expectedOutput = listOf(
            listOf("bat"),
            listOf("nat","tan"),
            listOf("ate","eat","tea")
        )
        groupAnagrams(input).toSet() shouldBe expectedOutput.toSet()
    }

})