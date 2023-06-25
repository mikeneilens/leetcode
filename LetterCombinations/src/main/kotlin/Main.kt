
val numberMap = mapOf(
    '1' to "",
    '2' to "abc",
    '3' to "def",
    '4' to "ghi",
    '5' to "jkl",
    '6' to "mno",
    '7' to "pqrs",
    '8' to "tuv",
    '9' to "wxyz",
)

fun Map<Char,String>.toStrings(number:Char) = getValue(number).map(Char::toString)

fun letterCombinations(digits: String): List<String> = digits.fold(emptyList(),::addLetters)

fun addLetters(listOfStrings:List<String>, number:Char) =
    if (listOfStrings.isEmpty()) numberMap.toStrings(number)
    else listOfStrings.flatMap { it.updateStringWithLettersForNumber(number)}

fun String.updateStringWithLettersForNumber(number: Char) = numberMap.toStrings(number).map{ this + it}