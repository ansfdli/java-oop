package testing.oop.data;

public class Category {

  private String id;

  private boolean expensive;

  // getter
  public String getId() {
    return id;
  }

  //setter
  public void setId(String id) {
    if(id != null) {
      this.id = id;
    }
  }

  public boolean isExpensive() {
    return expensive;
  }

  public void setExpensive(boolean expensive) {
    this.expensive = expensive;
  }
}
