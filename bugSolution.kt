```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.mapIndexedTo(mutableList) { index, value -> value * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10] // Correct!
    
    //Alternative using forEachIndexed
    val mutableList2 = mutableListOf(1, 2, 3, 4, 5)
    mutableList2.forEachIndexed { index, value -> mutableList2[index] = value * 2}
    println(mutableList2) // Output: [2, 4, 6, 8, 10] // Correct!
}
```