# DesignPatterns_chapter-3
Decorator design pattern -
Attach additional responsibilities to an object dynamically
Decorators provide a flexible alternative to subclassing for extending functionality

Object Oriented Principles:
- Classes should be open for extension but closed for modification

Key things:
- Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our design
- In our designs we should allow behavior to be extended without the need to modify existing code
- Composition and delegation can often be used to add new behavior at runtime
- The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components
- Decorator classes mirror the type of the components they decorate
(In fact, they are the same type as the components they decorate, either through inheritance or interface implementation)
- You can wrap a component with any number of decorators
- Decorators are typically transparent to the client of the component, that is, unless the client is relying on the component's concrete type.
- Decorators can result in many small objects in our design, and overuse can be complex
