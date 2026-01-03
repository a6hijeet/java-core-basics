package interfaces;

interface Computer {
  void code();
}

class Desktop implements Computer {
  public void code() {
    System.out.println("Code in desktop");
  }
}

class Laptop implements Computer {
  public void code() {
    System.out.println("Code in laptop");
  }
}

class Developer {
  public void develop(Computer comp) {
    comp.code();
  }
}

public class InterfaceReference {
  public static void main(String[] args) {
    Computer d = new Desktop();
    Computer l = new Laptop();
  
    Developer dev = new Developer();
    dev.develop(d);
    dev.develop(l);
  }
}
