import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({

    "characters to search in string abcde with range 1-3 are bc" {
        SearchStatus("abcde",1,3).charactersToSearch() shouldBe "bc"
    }
    "abcdecd with range 1-5 contains a duplicate" {
        SearchStatus("abcdecd",1,5).rangeContainsADuplicate() shouldBe true
    }
    "index of duplicate in string abcdecd with range 1-5 is 1 which is position 1 after the start" {
        SearchStatus("abcdecd",1,5).indexOfDuplicate() shouldBe 1
    }

    "When Input: s = a length of longest substring is 1" {
        lengthOfLongestSubstring("a") shouldBe 1
    }
    "When Input: s = abcabcbb length of longest substring is 3" {
        lengthOfLongestSubstring("abcabcbb") shouldBe 3
    }
    "When Input: s = bbbbb length of longest substring is 1" {
        lengthOfLongestSubstring("bbbbb") shouldBe 1
    }
    "When Input: s = pwwkew length of longest substring is 3" {
        lengthOfLongestSubstring("pwwkew") shouldBe 3
    }
    "When Input: s = abcdefaghib length of longest substring is 9" {
        lengthOfLongestSubstring("abcdefaghib") shouldBe 9
    }
})