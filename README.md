# Learn Java




This Repository only contains **Java Data Structures**.

| Topics      | Modules        | Links |
|------------|----------------|-------|
| Java Basics | Modules 1–10   | [Click](https://github.com/Saumyajeet-Varma/Learn-Java) |
| Java OOP    | Modules 11–14  | [Click](https://github.com/Saumyajeet-Varma/Learn-Java-OOP) |
| Java DS     | Modules 0-0  | [Click](https://github.com/Saumyajeet-Varma/Learn-Java-DataStructures) |




# Java Data Structures



## Table of Contents

- [Data Structures](#data-structures)
- [The Collections Framework](#the-collections-framework)
    - [Core Interfaces in the Collections Framework](#core-interfaces-in-the-collections-framework)
    - [Overview of Classes](#overview-of-classes)




## Data Structures

Data structures are ways to store and organize data so you can use it efficiently.

Java includes many other data structures as well, in the `java.util` package. Each is used to handle data in different ways.

Some of the most common are:
- `ArrayList`
- `HashSet`
- `HashMap`




## The Collections Framework

Before we explore `ArrayList`, `HashSet`, `HashMap`, and other data structures in more detail, it's important to understand that all of these are part of something bigger - the **Java Collections Framework**.

The Java Collections Framework provides a set of **interfaces** (like `List`, `Set`, and `Map`) and a set of **classes** (`ArrayList`, `HashSet`, `HashMap`, etc.) that implement those interfaces

All of these are part of the `java.util` package.

> Think of the Collections Framework as a toolbox. Interfaces like `List` define what tools can do, and classes like `ArrayList` are the actual tools that do the work.

### Core Interfaces in the Collections Framework

| Interface | Common Classes | Description |
|---------|----------------|-------------|
| List | `ArrayList`, `LinkedList` | Ordered collection that allows duplicates |
| Set | `HashSet`, `TreeSet`, `LinkedHashSet` | Collection of unique elements |
| Map | `HashMap`, `TreeMap`, `LinkedHashMap` | Stores key-value pairs with unique keys |


### Overview of Classes

| Interface | Class | Description |
|---------|-------|-------------|
| `List` | `ArrayList` | Resizable array that maintains order and allows duplicates |
| `List` | `LinkedList` | List with fast insert and remove operations |
| `Set` | `HashSet` | Unordered collection of unique elements |
| `Set` | `TreeSet` | Sorted set of unique elements (natural order) |
| `Set` | `LinkedHashSet` | Maintains the order in which elements were inserted |
| `Map` | `HashMap` | Stores key/value pairs with no specific order |
| `Map` | `TreeMap` | Sorted map based on the natural order of keys |
| `Map` | `LinkedHashMap` | Maintains the order in which keys were inserted |

> Use `List` classes when you care about order, you may have duplicates, and want to access elements by index. <br> Use `Set` classes when you need to store unique values only. <br> Use `Map` classes when you need to store pairs of keys and values, like a name and its phone number.