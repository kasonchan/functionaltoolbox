## Collections

- Create a list of integer

```scala
    (1 to n).toList
```

- Create a map collection. `Map` lets us associate a value with each element of 
the collection, and index with integers counting from `0`.

```scala
    Map(0 -> Identity..., 1 -> Identity..., ...)
```

- Create a set collection. `Set` ensures at most one of each object determined 
by `==` will be contained in the set at any one time.

```scala
    Set(...)
```

--------------------------------------------------------------------------------

## Higher-order functions

### `map`

- `map` takes a function and a sequence and applies that function to every element in the sequence, producing a new sequence

```scala
    sequence map (_ operation)
    sequence map (x => function(x))
    sequence map { case(key, value) => function(value)}
```

### `flatmap`

- `flatmap` takes a function returning a list of elements as its right operand, applies the function to each list element and returns the concatenation of all function results. 

```scala
    sequence flatmap (_ operation)
```

### `foreach`

- `foreach` takes a procedure as right operand, applies to each list element.

```scala
    sequence foreach (procedure)
```

### `filter`

- `filter` takes a predicate and a sequence, and returns the sequence of elements that satisfy that predicate. Predicates returns `true` or `false`.

```scala
    sequence filter (predicate)
    sequence filter { case(key, value) => predicate(value) }
```

### `partition`

- `partition` takes a predicate and a sequence, and returns the sequence of elements that satisfy that predicate.

```scala
    sequence partition (predicate)
```

### `takeWhile`

- `takeWhile` takes a predicate as their right operand, takes the longest prefix of list that satisfy predicate.

```scala
    sequence takeWhile predicate
```

### `dropWhile`

- `dropWhile` takes a predicate as their right operand, removes the longest prefix from list that satisfy predicate.

```scala
    sequence dropWhile predicate
```

### `span`

- `span` combines takeWhile and dropWhile in one operation and it avoids traversing the list twice.

```scala
    sequence span predicate
```

### `find`

- `find` takes a predicate and a sequence, and returns the first element satisfying a given predicate. Return Some(x) if predicate is true, otherwise return None.

```scala
    sequence find (predicate)
```

### `zip`

- `zip` takes two sequences and forms a list of pairs.

```scala
    sequence zip sequence
    sequence zip (Stream from 1)
    sequence zipWithIndex // Index start with 0
    (sequence, sequence) zipped map (function)
```

### `unzip`

- `unzip` take any list of tuples and changes back to a tuple of lists.

```scala
    (tuple sequence) unzip
```

### `fold`

- `fold` takes a binary function, a starting value called accumulator and a sequence to fold up.

```scala
    sequence fold (accumulator) (function)
    sequence foldLeft (accumulator) (function)
    (accumulator /: sequence) (function)
    sequence foldRight (accumulator) (function)
    (sequence :\ accumulator) (function)
```

--------------------------------------------------------------------------------

## Composition

### `compose`

Two functions `g` and `f` compose: `h = g·f` which is shorthand for 
`h(x) = g(f(x))` in algebra. 

```scala
    val f: Int => String
    val g: String => Float
    val h: Int => Float = g compose f
```

```scala
    val fg = f _ compose g _
    val fg1 = fg("Hello")
    println(fg1) // f(g[Hello])
```

```scala
    val ma = square _ compose add _
    val ma1 = ma(3)
    println(ma1) // = 3 + 3 = 6 = 6 * 6 = 36
```

### `andThen`

`andThen` is like compose, but calls the first function and then the second, 
`g(f(x))`.

```scala
    val gf = f _ andThen g _
    val gf1 = gf("World")
    println(gf1) // g[f(World)]
```

```scala
    val am = square _ andThen add _
    val am1 = am(3)
    println(am1) // = 3 * 3 = 9 = 9 + 9 = 18
```

Note that composition functions can only take one parameter.
