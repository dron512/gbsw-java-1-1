public class Report extends Document{
  public Report(String title) {
    super(title);
  }
  public void printSummary(){
    System.out.println("요약 = "+title);
  }
}
