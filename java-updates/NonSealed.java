
// Give permission to extend class A
sealed class A permits B,C {

}

// When extending sealed class the subclass must be
// final
// sealed
// non-sealed
non-sealed class B extends A {

}

final class C extends A {

}

// The class NonSealed cannot extend the class A
// as it is not a permitted subtype of A
// But can extend class B as its non-sealed class
public class NonSealed extends B {
  
}
