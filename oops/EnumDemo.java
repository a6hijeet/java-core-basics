enum Status {
   Pending(100), Failed(404), Running, Success(200);
   private int price;

   Status() {
    this.price = 50;
   }
   Status(int i){
    this.price = i;
   }

   public int getPrice(){
    return this.price;
   }

}

public class EnumDemo {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(Status.values());
        for (Status s1 : Status.values()) {
            System.out.println(s1 + " " + s1.getPrice());
        }
    }
}
