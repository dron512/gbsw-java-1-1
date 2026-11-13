public class Document {
  protected String title;
  public Document(String title) {
    this.title = title;
  }
  public void showData(){
    System.out.println("제목 = "+ title);
  }
}