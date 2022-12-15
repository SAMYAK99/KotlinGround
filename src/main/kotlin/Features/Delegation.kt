package Features

// Lazy Loading : Jab tk call nhi karoge tab tak use bhi hoga (memory efficient)

class Delegation {

    // Memory effecient | used for heavy memory operations
    // Initialize the value to l only when it is used otherwise don't initialize it
    // lazy can be used only with val
    val l : Int by lazy { 5 }
}