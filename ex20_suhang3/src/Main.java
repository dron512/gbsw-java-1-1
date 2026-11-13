public class Main {

  public static void main(String[] args) {
    // title은 문서라고 지정하고
    // 생성자 호출해서 Report 객체를 생성하세요

    // 상속관계 호출
    Report report = new Report("문서");
    report.showData();
//    report.printSummary();

    // 연관관계 호출
    Editor editor = new Editor(report);
    editor.review();

    // 의존 관계 호출
    ArchiveDesk archiveDesk = new ArchiveDesk();
    archiveDesk.register(report);





  }
}
