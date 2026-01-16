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
- [List Interface](#list-interface) 
    - [Common List Methods](#common-list-methods)
    - [Array vs List](#array-vs-list)
- [ArrayList](#arraylist) 
    - [Create an ArrayList](#create-an-arraylist)
    - [Add Elements](#add-elements)
    - [Access an Element](#access-an-element)
    - [Change an Element](#change-an-element)
    - [Remove an Element](#remove-an-element)
    - [ArrayList Size](#arraylist-size)
    - [Sort an ArrayList](#sort-an-arraylist)
    - [The `var` Keyword](#the-var-keyword)
    - [The List Interface](#the-list-interface)
- [LinkedList](#linkedlist) 
- [Set Interface](#set-interface) 
    - [Common Set Methods](#common-set-methods)
    - [List vs Set](#list-vs-set)
- [HashSet](#hashset)
- [TreeSet](#treeset)
- [LinkedHashSet](#linkedhashset)
- [Map Interface](#map-interface) 
    - [Common Map Methods](#common-map-methods)
    - [List vs Set vs Map](#list-vs-set-vs-map)
- [HashMap](#hashmap)
- [TreeMap](#treemap)
- [LinkedHashMap](#linkedhashmap) 




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




## List Interface

The `List` interface is part of the Java Collections Framework and represents an ordered collection of elements.

You can access elements by their index, add duplicates, and maintain the insertion order.

Since List is an interface, you cannot create a List object directly.

Instead, you use a class that implements the `List` interface, such as:
- `ArrayList` - like a resizable array with fast random access
- `LinkedList` - like a train of cars you can easily attach or remove

### Common List Methods

| Method | Description |
|------|-------------|
| `add()` | Adds an element to the end of the list |
| `get()` | Returns the element at the specified position |
| `set()` | Replaces the element at the specified position |
| `remove()` | Removes the element at the specified position |
| `size()` | Returns the number of elements in the list |

### Array vs List

| Array | List |
|------|------|
| Fixed size | Dynamic size |
| Faster performance for raw data | More flexible and feature-rich |
| Not part of Collections Framework | Part of the Collections Framework |




## ArrayList

An `ArrayList` is like a resizable array

It is part of the java.util package and implements the List interface.

The difference between a built-in array and an `ArrayList` in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

### Create an ArrayList

```java
import java.util.ArrayList;

ArrayList<String> cars = new ArrayList<String>(); 
```

> Now you can use methods like `add()`, `get()`, `set()`, and `remove()` to manage your list of elements.

### Add Elements

To add elements to an ArrayList, use the `add()` method

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
    
        System.out.println(cars);
  }
}
```

### Access an Element

To access an element in the `ArrayList`, use the `get()` method and refer to the index number

```java
cars.get(0);  // Get the first element
```

### Change an Element

To modify an element, use the `set()` method and refer to the index number

```java
cars.set(0, "Opel");
```

### Remove an Element

To remove an element, use the `remove()` method and refer to the index number

```java
cars.remove(0);
```

To remove all the elements in the `ArrayList`, use the `clear()` method

```java
cars.clear();
```

### ArrayList Size

To find out how many elements an `ArrayList` have, use the `size()` method

```java
cars.size();
```

### Sort an ArrayList

Another useful class in the `java.util` package is the `Collections` class, which include the `sort()` method for sorting lists alphabetically or numerically

**Code**: [./src/module15/ArrayListDS.java](./src/module15/ArrayListDS.java)

### The var Keyword

you can use the `var` keyword to declare an `ArrayList` variable without writing the type twice. The compiler figures out the type from the value you assign

This makes code shorter, **but many developers still use the full type for clarity**

```java
// Without var
ArrayList<String> cars = new ArrayList<String>();

// With var
var cars = new ArrayList<String>();
```

### The List Interface

> **Note**: Sometimes you will see both `List` and `ArrayList` in Java code, like this:

```java
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
```

This means the variable (cars) is declared as a `List` (the interface), but it stores an `ArrayList` object (the actual list). Since `ArrayList` implements the `List` interface, this is possible.




## LinkedList
> Will update...




## Set Interface

The `Set` interface is part of the Java Collections Framework and is used to store a collection of unique elements.

Unlike a `List`, a `Set` does not allow duplicates, and it does not preserve the order of elements (unless you're using `TreeSet` or `LinkedHashSet`).

Common classes that implement Set:
- `HashSet` - fast and unordered
- `TreeSet` - sorted set
- `LinkedHashSet` - ordered by insertion
 
### Common Set Methods

| Method | Description |
|------|-------------|
| `add()` | Adds an element if it's not already in the set |
| `remove()` | Removes the element from the set |
| `contains()` | Checks if the set contains the element |
| `size()` | Returns the number of elements |
| `clear()` | Removes all elements |


### List vs Set

| List | Set |
|------|-----|
| Allows duplicates | Does not allow duplicates |
| Maintains order | Does not guarantee order |
| Access by index | No index-based access |




## HashSet
> Will update...




## TreeSet
> Will update...




## LinkedHashSet
> Will update...




## Map Interface

The `Map` interface is a part of the Java Collections Framework and is used to store **key-value pairs**. Each key must be unique, but values can be duplicated.

A `Map` is useful when you want to associate a key (like a name or ID) with a value (like an age or description).

Common classes that implement Map:
- `HashMap` - fast and unordered
- `TreeMap` - sorted by key
- `LinkedHashMap` - ordered by insertion

### Common Map Methods

| Method | Description |
|------|-------------|
| `put()` | Adds or updates a key-value pair |
| `get()` | Returns the value for a given key |
| `remove()` | Removes the key and its value |
| `containsKey()` | Checks if the map contains the key |
| `keySet()` | Returns a set of all keys |

### List vs Set vs Map

| Feature | List | Set | Map |
|-------|------|-----|-----|
| Duplicates allowed? | Yes | No | Keys: No, Values: Yes |
| Stores key-value pairs? | No | No | Yes |
| Maintains order? | Yes | No (unless using TreeSet or LinkedHashSet) | No (unless using TreeMap or LinkedHashMap) |




## HashMap
> Will update...




## TreeMap
> Will update...




## LinkedHashMap
> Will update...