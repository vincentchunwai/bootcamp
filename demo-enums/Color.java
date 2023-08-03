public enum Color {
  RED("#FF0000"),
  GREEN("#00FF00"),
  BLUE("#0000FF"),
  ;
  String code;

  private Color(String code){
    this.code = code;
  }

  public String getColorCode(){
    return this.code;
  }
}
