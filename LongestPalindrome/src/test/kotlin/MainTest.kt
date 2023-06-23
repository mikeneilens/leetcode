import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "with 'aba' the longest palindrome with its middle at position 0,0 is 'a'" {
        "aba".longest(0..0) shouldBe "a"
    }
    "with 'aba' the longest palindrome with its middle at position 1,1 is 'aba'" {
        "aba".longest(1..1) shouldBe "aba"
    }
    "with 'xabay' the longest palindrome with its middle at position 2,2 is 'aba'" {
        "xabay".longest(2..2) shouldBe "aba"
    }
    "with 'xabbay' the longest palindrome with its middle at position 2,3 is 'abba'" {
        "xabbay".longest(2..3) shouldBe "abba"
    }

    "with 'babad' longest palnddrome is bab" {
        longestPalindrome("babad") shouldBe "bab"
    }
    "with 'cbbd' longest palnddrome is bb" {
        longestPalindrome("cbbd") shouldBe "bb"
    }
    "test with large palindrome data" {
        longestPalindrome(largePalindrome) shouldBe "asilive\n" +
                "doninemeninterpretninemeninod\n" +
                "evilisa"
    }
})