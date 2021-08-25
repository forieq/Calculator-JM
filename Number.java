public class Number {

  enum Type {
    ARABIC,
    ROMAN
  }

  int value;
  Type type;

  public Number() {
  }

  public Number(String v) {
    if (Arabic.isArabic(v)) {
      value = Arabic.toInt(v);
      type = Type.ARABIC;
      return;
    }
    if (Roman.isRoman(v)) {
      value = Roman.toInt(v);
      type = Type.ROMAN;
      return;
    }
    throw new IllegalArgumentException("Unsupported number.");
  }

  public Number(int n, Type t) {
    if (t == Type.ROMAN && n < 1) {
      throw new ArithmeticException("Roman numbers must be positive.");
    }
    value = n;
    type = t;
  }

  static void checkSameType(Number n1, Number n2) {
    if (n1.type != n2.type) {
      throw new UnsupportedOperationException("Numbers must be of the same type.");
    }
  }

  public String getNumber() {
    if (type == Type.ARABIC) {
      return Arabic.toArabic(value);
    }
    if (type == Type.ROMAN) {
      return Roman.toRoman(value);
    }
    throw new IllegalArgumentException("Number of unknown type.");
  }


  public Number add(Number n) {
      checkSameType(this, n);
      return new Number(value + n.value, type);
  }

  public Number subtract(Number n) {
    checkSameType(this, n);
    return new Number(value - n.value, type);
  }

  public Number multiply(Number n) {
    checkSameType(this, n);
    return new Number(value * n.value, type);
  }

  public Number divide(Number n) {
    checkSameType(this, n);
    return new Number(value / n.value, type);
  }
}
