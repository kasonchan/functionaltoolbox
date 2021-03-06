# Functional toolbox

The repository is dedicated for recording what I learnt in functional 
programming in Scala with 
[SBT](http://www.scala-sbt.org/download.html) and [Akka](http://akka.io/). 
It will be used as a toolbox (notes) for me when I need some references 
such as code snippets, basic project set up, templates, etc.

## Table of Contents ##

- [Classes](Classes/Classes.md)
  - [`abstract` modifier](Classes/Classes.md#abstract-sealed-and-extends)
  - [`sealed` modifier](Classes/Classes.md#abstract-sealed-and-extends)
  - [`extends` keyword](Classes/Classes.md#abstract-sealed-and-extends)
  - [`require` keyword](Classes/Classes.md#require-override-and-tostring)
  - [`override` modifier](Classes/Classes.md#require-override-and-tostring)
  - [`toString` function](Classes/Classes.md#require-override-and-tostring)
  - [`apply` function](Classes/Classes.md#apply-and-unapply)
  - [`unapply` function](Classes/Classes.md#apply-and-unapply)
- [Pattern matching](Classes/Classes.md)
  - [```_*```](Classes/Classes.md#specify-last-element-in-sequence)
  - [Variable binding](Classes/Classes.md#variable-binding)
  - [Pattern in `for` expression](Classes/Classes.md#in-for-expression)
  - [User `getOrElse` for `Option` result](Classes/Classes.md#use-getorelse-for-option)
  - [Deconstruct with patterns in variable definitions](Classes/Classes.md#deconstruct-pattern)
  - [`@unchecked` annotation](Classes/Classes.md#unchecked-annotation)
- [Collections](HigherOrderFunctions/Functions.md#collections)
  - [Create a list of integer](HigherOrderFunctions/Functions.md#collections)
  - [Create a map collection](HigherOrderFunctions/Functions.md#collections)
  - [Create a set collection](HigherOrderFunctions/Functions.md#collections)
- [Higher-order functions](HigherOrderFunctions/Functions.md#higher-order-functions)
  - [`map`](HigherOrderFunctions/Functions.md#map)
  - [`flatmap`](HigherOrderFunctions/Functions.md#flatmap)
  - [`foreach`](HigherOrderFunctions/Functions.md#foreach)
  - [`filter`](HigherOrderFunctions/Functions.md#filter) 
  - [`partition`](HigherOrderFunctions/Functions.md#partition) 
  - [`takeWhile`](HigherOrderFunctions/Functions.md#takewhile) 
  - [`dropWhile`](HigherOrderFunctions/Functions.md#dropwhile) 
  - [`span`](HigherOrderFunctions/Functions.md#span) 
  - [`find`](HigherOrderFunctions/Functions.md#find) 
  - [`zip`](HigherOrderFunctions/Functions.md#zip) 
  - [`unzip`](HigherOrderFunctions/Functions.md#unzip) 
  - [`fold`](HigherOrderFunctions/Functions.md#fold) 
- [Composition](HigherOrderFunctions/Functions.md#composition)
  - [`compose`](HigherOrderFunctions/Functions.md#compose)
  - [`andThen`](HigherOrderFunctions/Functions.md#andThen)
- [Patterns](Patterns/Patterns.md)
  - [Replace object-oriented patterns](Patterns/Patterns.md#replace-object-oriented-patterns)
    - [Replace functional interface](Patterns/Patterns.md#replace-functional-interface)
    - [Replace state-carrying functional interface](Patterns/Patterns.md#replace-state-carrying-functional-interface)
    - [Replace command](Patterns/Patterns.md#replace-command)
    - [Replace builder for immutable object](Patterns/Patterns.md#replace-builder-for-immutable-object)
    - [Replace iterator](Patterns/Patterns.md#replace-iterator)
    - [Replace template](Patterns/Patterns.md#replace-template)
    - [Replace strategy](Patterns/Patterns.md#replace-strategy)
    - [Replace null object](Patterns/Patterns.md#replace-null-object)
    - [Replace decorator](Patterns/Patterns.md#replace-decorator)
    - [Replace visitor](Patterns/Patterns.md#replace-visitor)
    - [Rplace dependency injection](Patterns/Patterns.md#replace-dependency-injection)
  - [Functional patterns](FunctionalPatterns/Patterns.md#functional-patterns)
    - [Filter-Map-Reduce](FunctionalPatterns/Patterns.md#Filter-Map-Reduce)
    - [Chain of operations](FunctionalPatterns/Patterns.md#chain-of-operations)
    - [Function builder](FunctionalPatterns/Patterns.md#function-builder)
    - [Memoization](FunctionalPatterns/Patterns.md#memoization)
- [Swing](Swing/Swing.md)
- [Play](Play/Play.md)

[References](References/References.md)

