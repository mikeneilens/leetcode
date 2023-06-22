import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "when next char is x and ScanStatus is (length=0, current=empty) the new ScanStatus ia (length=1,current='x') "{
        updateScanStatus(ScanStatus(0),'x') shouldBe ScanStatus (1, mutableSetOf('x'))
    }
    "when next char is x and ScanStatus is (length=3, current='w') the new ScanStatus is (length=3,current='wx') "{
        updateScanStatus(ScanStatus(3, mutableSetOf('w')),'x') shouldBe ScanStatus (3,mutableSetOf('w','x'))
    }
    "when next char is x and ScanStatus is (length=3, current='stw') the new ScanStatus is (length=4,current='stwx')"{
        updateScanStatus(ScanStatus(3,mutableSetOf('s','t','w')),'x') shouldBe
                ScanStatus (4,mutableSetOf('s','t','w','x'))
    }
    "when next char is x and status is ScanStatus(length=3, current='stx') new ScanStatus is (length=3,current='x') "{
        updateScanStatus(ScanStatus(3,mutableSetOf('s','t','x')),'x') shouldBe ScanStatus (3,mutableSetOf('x'))
    }
    "when next char is x and status is ScanStatus(length=3, current='xts') new ScanStatus is (length=3,current='x') "{
        updateScanStatus(ScanStatus(3,mutableSetOf('x','t','s')),'x') shouldBe ScanStatus (3,mutableSetOf('x'))
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
})