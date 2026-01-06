
// Give permission to extend class A
sealed class A permits B,C {

}

// When extending sealed class the subclass must be
// final
// sealed
// non-sealed
final class B extends A {

}

final class C extends A {

}

// Compile error
// The class Sealed cannot extend the class A as it is not a permitted subtype of A
public class Sealed extends A {
  
}
