import math

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        return "Error: Division by zero"
    return x / y

def power(x, y):
    return x ** y

def sqrt(x):
    if x < 0:
        return "Error: Square root of a negative number"
    return math.sqrt(x)

def logarithm(x, base=10):
    if x <= 0:
        return "Error: Logarithm of a non-positive number"
    return math.log(x, base)

def factorial(x):
    if x < 0:
        return "Error: Factorial of a negative number"
    return math.factorial(x)

def calculator():
    print("Welcome to the Expert Calculator!")
    print("Select an operation:")
    print("1. Add")
    print("2. Subtract")
    print("3. Multiply")
    print("4. Divide")
    print("5. Power")
    print("6. Square Root")
    print("7. Logarithm")
    print("8. Factorial")
    print("9. Exit")

    while True:
        choice = input("\nEnter your choice (1-9): ")

        if choice == '9':
            print("Exiting the calculator. Goodbye!")
            break

        if choice in ('1', '2', '3', '4', '5'):
            num1 = float(input("Enter first number: "))
            num2 = float(input("Enter second number: "))

            if choice == '1':
                print("Result:", add(num1, num2))
            elif choice == '2':
                print("Result:", subtract(num1, num2))
            elif choice == '3':
                print("Result:", multiply(num1, num2))
            elif choice == '4':
                print("Result:", divide(num1, num2))
            elif choice == '5':
                print("Result:", power(num1, num2))

        elif choice == '6':
            num = float(input("Enter number: "))
            print("Result:", sqrt(num))

        elif choice == '7':
            num = float(input("Enter number: "))
            base = float(input("Enter logarithm base (default is 10): ") or 10)
            print("Result:", logarithm(num, base))

        elif choice == '8':
            num = int(input("Enter a non-negative integer: "))
            print("Result:", factorial(num))

        else:
            print("Invalid input, please select a number between 1 and 12.")

if __name__ == "__main__":
    calculator()
