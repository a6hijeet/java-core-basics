class Post {
  String title;
  int likes;
  static String category;

  static {
    category = "Story";
    System.out.println("Static block created");
  }

  public Post() {
    title = "Demo post";
    likes = 100;
  }

  public void getData() {
    System.out.println(title + " " + likes + " " + category);
  }

  public static void print(Post p) {
    System.out.println(p.title + " " + p.likes + " " + category);
  }
}


public class StaticDemo {
  
  public static void main(String[] args) {
    Post p1 = new Post();
    p1.title = "Post 1";
    p1.likes = 10;
    Post.category = "Post";

    p1.getData();
    Post p2 = new Post();
    p2.title = "Post 2";
    p2.likes = 20;

    p2.getData();

    Post.print(p1);

  }
}
