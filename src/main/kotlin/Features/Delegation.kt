package Features

class Delegation {

    // Memory effecient | used for heavy memory operations
    // Initialize the value to l only when it is used otherwise don't initialize it
    // lazy can be used only with val
    val l : Int by lazy { 5 }
}