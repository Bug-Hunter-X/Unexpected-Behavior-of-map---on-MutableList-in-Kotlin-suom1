# Kotlin's `map()` Function and Mutable Lists

This example demonstrates a common point of confusion for Kotlin developers transitioning from languages with more mutable data structures.  The `map()` function in Kotlin, when used on a `MutableList`, *does not* modify the original list.  It returns a *new* list containing the transformed elements.

The code in `bug.kt` illustrates this behavior. While the transformation is performed correctly, the original `mutableList` remains unchanged.  The solution demonstrates the proper way to achieve in-place modification using `mapIndexedTo()`.