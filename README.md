# NullPointerExceptionGenerator - Application to Demonstrate NullPointerException

## Description
The **NullPointerExceptionGenerator** application demonstrates how a `NullPointerException` can be generated in Java. It defines a method that intentionally causes a `NullPointerException` by attempting to call a method on a null object. The **Main** class invokes this method and catches the exception in a try-catch block, printing relevant information about the exception, including its stack trace and the result of calling `toString()` on the exception object.

## How the Program Works

### **NullPointerExceptionGenerator** Class:
- The `generateNullPointerException` method creates a null string and attempts to call the `length()` method on it, which causes a `NullPointerException` because `null` does not reference any object.

### **Main** Class:
- The program calls `generateNullPointerException` inside a try block.
- If a `NullPointerException` occurs, it is caught in the catch block, where:
    - A message `"Wystąpił wyjątek: NullPointerException"` is printed to indicate that the exception occurred.
    - The `printStackTrace()` method is called on the exception object to display the stack trace.
    - The `toString()` method is called on the exception object to print its string representation.

## How to Run the Application
1. Clone the repository to your computer:
   ```bash
   git clone https://github.com/your-repository.git
