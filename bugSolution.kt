fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }.toMutableList()
    println(newList) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toMutableSet()
    println(newSet) // Output: [1, 2]
    
    //Alternative approach using a copy
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listCopy = list2.toMutableList()
    listCopy.removeIf { it > 2 }
    println(listCopy) //Output: [1,2]
    
    
} 