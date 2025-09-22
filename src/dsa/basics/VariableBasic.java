package dsa.basics;

import java.util.Arrays;

public class VariableBasic {

    // ===== 1) Class-level members =====
    // A constant (value never changes). By convention: UPPER_SNAKE_CASE.
    public static final double PI = 3.141592653589793;

    // An instance (object) variable: gets default value when an object is created.
    // (For int it's 0, for boolean it's false, for reference types it's null)
    private int counter; // default 0

    public static void main(String[] args) {
        // ===== 2) Local variables =====
        // Must be initialized before use.
        int age = 23;                         // declaration + initialization
        long worldPopulation = 8_123_456_789L; // 'L' for long literal, underscores for readability
        float price = 199.99F;                 // 'F' for float literal
        double interestRate = 7.25;            // double is default for decimals
        char grade = 'A';                      // single quotes for char
        boolean isJavaFun = true;

        System.out.println("age = " + age);
        System.out.println("worldPopulation = " + worldPopulation);
        System.out.println("price = " + price);
        System.out.println("interestRate = " + interestRate);
        System.out.println("grade = " + grade);
        System.out.println("isJavaFun = " + isJavaFun);

        // ===== 3) Numeric literals =====
        int decimal = 26;          // base 10
        int binary  = 0b11010;     // base 2 (prefix 0b)
        int hex     = 0x1A;        // base 16 (prefix 0x)
        System.out.println("Same number three ways: " + decimal + ", " + binary + ", " + hex);

        // ===== 4) Strings (reference type) =====
        String name = "Ravi";                     // String is a class (immutable)
        String message = "Hello\nWorld";          // \n = newline, \" = quote, \\ = backslash
        System.out.println("name = " + name);
        System.out.println("message = ");
        System.out.println(message);

        // Equality: '==' compares references, '.equals()' compares contents
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("s1 == s2? " + (s1 == s2));           // often false
        System.out.println("s1.equals(s2)? " + s1.equals(s2));   // true

        // ===== 5) Type conversion (casting) =====
        // Widening (safe, automatic)
        double widened = age;              // int -> double
        System.out.println("widened = " + widened);

        // Narrowing (may lose data, requires explicit cast)
        int narrowed = (int) interestRate; // 7.25 -> 7
        System.out.println("narrowed = " + narrowed);

        // Converting String <-> number
        int parsed = Integer.parseInt("123");
        String asString = String.valueOf(456);
        System.out.println("parsed = " + parsed + ", asString = " + asString);

        // ===== 6) final (local constant) =====
        final int DAYS_IN_WEEK = 7; // cannot reassign later
        System.out.println("DAYS_IN_WEEK = " + DAYS_IN_WEEK);

        // ===== 7) var (Java 10+) - local type inference =====
        // Use only if your project JDK is 10 or higher.
        // var infers the type from the initializer; it still becomes a *real* static type at compile time.
        var total = 5 + 7;            // inferred as int
        var greeting = "Hi there!";   // inferred as String
        System.out.println("total = " + total + ", greeting = " + greeting);

        // ===== 8) Arrays =====
        int[] nums = {1, 2, 3};
        nums[0] = 99;                 // zero-based index
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("length = " + nums.length);

        // ===== 9) Scope (where a variable is visible) =====
        int outer = 10;
        if (outer > 0) {
            int blockVar = 42; // exists only inside this block
            System.out.println("blockVar = " + blockVar);
        }
        // System.out.println(blockVar); // ❌ compile error: blockVar not visible here

        // ===== 10) Shadowing example =====
        int counter = 5; // shadows the instance variable 'counter' inside main
        System.out.println("local counter = " + counter);
        // To access the class's instance field, create an object:
        VariableBasic demo = new VariableBasic();
        System.out.println("instance counter (default) = " + demo.counter);

        // ===== 11) Wrappers and auto(boxing/unboxing) =====
        Integer boxed = age;      // autoboxing: int -> Integer
        int unboxed = boxed;      // unboxing: Integer -> int
        System.out.println("boxed = " + boxed + ", unboxed = " + unboxed);

        // ===== 12) Common pitfalls =====
        // (a) Integer division
        System.out.println("5 / 2 = " + (5 / 2));     // 2 (int division truncates)
        System.out.println("5 / 2.0 = " + (5 / 2.0)); // 2.5 (double division)

        // (b) Overflow
        int big = 2_000_000_000;
        int overflow = big * 2;           // exceeds int range -> wraps around
        long safe   = 2_000_000_000L * 2; // use long to avoid overflow
        System.out.println("overflow (int) = " + overflow + ", safe (long) = " + safe);

        // (c) Null references
        String maybeNull = null;
        System.out.println("maybeNull is null? " + (maybeNull == null));
        // System.out.println(maybeNull.length()); // ❌ NullPointerException if uncommented
    }
}
