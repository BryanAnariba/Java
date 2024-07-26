package classes;

public class Subject {
  private int code;
  private String subjectName;
  private int credits;
  
  public Subject() {}

  public Subject(int code, String subjectName, int credits) {
    this.code = code;
    this.subjectName = subjectName;
    this.credits = credits;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  @Override
  public String toString() {
    return "Subject{" + "code=" + code + ", subjectName=" + subjectName + ", credits=" + credits + '}';
  }
}
