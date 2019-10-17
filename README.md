# Sudoku Issues 

### Move this file to a name package. 

The default unnamed package should not be used.

### Make value a static final constant or non-public and provide accessors if needed.

Public class variable fields do not respect the encapsulation principle and has three main disadvantages:

- Additional behavior such as validation cannot be added.
- The internal representation is exposed, and cannot be changed afterwards.
- Member values are subject to change from anywhere in the code and may not meet the programmer's assumptions.

By using private attributes and accessor methods (set and get), unauthorized modifications are prevented.

### Replace this use of System.out or System.err by a logger.

When logging a message there are several important requirements which must be fulfilled:

- The user must be able to easily retrieve the logs
- The format of all logged message must be uniform to allow the user to easily read the log
- Logged data must actually be recorded
- Sensitive data must only be logged securely

If a program directly writes to the standard outputs, there is absolutely no way to comply with those requirements. That's why defining and using a dedicated logger is highly recommended.

### Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation.

There are several reasons for a method not to have a method body:

- It is an unintentional omission, and should be fixed to prevent an unexpected behavior in production.
- It is not yet, or never will be, supported. In this case an UnsupportedOperationException should be thrown.
- The method is an intentionally-blank override. In this case a nested comment should explain the reason for the blank override.

### Make sure that reading the standard input is safe here.

Reading Standard Input is security-sensitive. It is common for attackers to craft inputs enabling them to exploit software vulnerabilities. Thus any data read from the standard input (stdin) can be dangerous and should be validated.

### Rename this field "solved\_board" to match the regular expression '^[a-z][a-zA-Z0-9]\*$'.

Sharing some naming conventions is a key point to make it possible for a team to efficiently collaborate. This rule allows to check that field names match a provided regular expression.

### Remove this unused private "generateBoard" method.

Unused "private" methods should be removed. 

**private** methods that are never executed are dead code: unnecessary, inoperative code that should be removed. Cleaning out dead code decreases the size of the maintained codebase, making it easier to understand the program and preventing bugs from being introduced.

### Replace the type specification in this constructor call with the diamond operator ("<>").

Java 7 introduced the diamond operator (<>) to reduce the verbosity of generics code. For instance, instead of having to declare a List's type in both its declaration and its constructor, you can now simplify the constructor declaration with <>, and the compiler will infer the type.

### Refactor this method to reduce its Cognitive Complexity from 21 to the 15 allowed.

Cognitive Complexity is a measure of how hard the control flow of a method is to understand. Methods with high Cognitive Complexity will be difficult to maintain.

### This branch can not be reached because the condition duplicates a previous condition in the same sequence of "if/else if" statements

A chain of if/else if statements is evaluated from top to bottom. At most, only one branch will be executed: the first one with a condition that evaluates to true.

Therefore, duplicating a condition automatically leads to dead code. Usually, this is due to a copy/paste error. At best, it's simply dead code and at worst, it's a bug that is likely to induce further bugs as the code is maintained, and obviously it could lead to unexpected behavior. 

### Remove this unnecessary cast to "int".

Unnecessary casting expressions make the code harder to read and understand.

### Make sure that using this pseudorandom number generator is safe here.

Using pseudorandom number generators (PRNGs) is security-sensitive. When software generates predictable values in a context requiring unpredictability, it may be possible for an attacker to guess the next value that will be generated, and use this guess to impersonate another user or access sensitive information.

Use "java.util.Random.nextInt()" instead.

###  Remove this unused method parameter "X".

Unused parameters are misleading. Whatever the values passed to such parameters, the behavior will be the same.

### Remove this silly call to "Math.floor"

Certain math operations are just silly and should not be performed because their results are predictable.

In particular, anyValue % 1 is silly because it will always return 0.

Casting a non-floating-point value to floating-point and then passing it to Math.round, Math.ceil, or Math.floor is silly because the result will always be the original value.

These operations are silly with any constant value: Math.abs, Math.ceil, Math.floor, Math.rint, Math.round.

### Cast one of the operands of this division operation to a "double".

Math operands should be cast before assignment

When arithmetic is performed on integers, the result will always be an integer. You can assign that result to a long, double, or float with automatic type conversion, but having started as an int or long, the result will likely not be what you expect.

For instance, if the result of int division is assigned to a floating-point variable, precision will have been lost before the assignment. Likewise, if the result of multiplication is assigned to a long, it may have already overflowed before the assignment.

In either case, the result will not be what was expected. Instead, at least one operand should be cast or promoted to the final type before the operation takes place.

### Remove the literal "true" boolean value.

Boolean literals should not be redundant

Redundant Boolean literals should be removed from expressions to improve readability.
