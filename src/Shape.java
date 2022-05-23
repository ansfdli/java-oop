class Shape {

  int getCorner(){
    return 0;
  }
}

class Rectangle extends Shape {
  int getCorner() {
    return 4;
  }

  // super keyword or get field from method overriding
  int getParentCorner(){
    return super.getCorner();
  }
}
