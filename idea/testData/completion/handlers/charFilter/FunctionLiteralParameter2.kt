fun foo(p: (String) -> Unit){}

fun bar() {
    foo { (p<caret> }
}

// INVOCATION_COUNT: 0
// ELEMENT: *
// CHAR: ':'
