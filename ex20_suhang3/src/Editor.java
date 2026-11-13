public class Editor {
  private Report report;
  public Editor(Report report) {
    this.report = report;
  }
  public void review(){
    report.printSummary();
  }
}
