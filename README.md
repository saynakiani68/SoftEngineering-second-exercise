# Software Engineering - Interfaces Exercise

This project is an exercise about interfaces, sorting algorithms, and object-oriented programming in Java.

## Classes

The project contains the following classes:

### Person

The `Person` class stores:

- Name
- Surname

It also contains a method to print the person's name and surname.

Persons are sorted first by **surname** and, when two persons have the same surname, by **name**.

### Rectangle

The `Rectangle` class stores:

- Width
- Height

It contains a `getArea()` method that calculates the area:

Area = width × height

Rectangles are sorted according to their **area**.

### Sortable

`Sortable` is an interface used by both `Person` and `Rectangle`.

It contains the method:

```java
boolean isGreaterThan(Sortable other);
