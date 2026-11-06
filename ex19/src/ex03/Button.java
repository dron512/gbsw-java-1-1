package ex03;
interface OnClickListener{
  void onClick();
}
public class Button {
  OnClickListener onClickListener;
  public void setOnClickListener(
          OnClickListener onClickListener
          ) {
    this.onClickListener = onClickListener;
  }
  void touch(){
    onClickListener.onClick();
  }
}
