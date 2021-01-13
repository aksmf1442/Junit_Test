package me.whiteship.inflearnthejavatest;

// command+shift+t하면 바로 테스트생성
public class Study {

  private StudyStatus status;

  private int limit;

  public Study(int limit) {
    if (limit < 0){
      throw new IllegalArgumentException("limit은 0보다 커야한다.");
    }
    this.limit = limit;
  }

  public Enum getStatus() {
    return this.status;
  }

  public int getLimit() {
    return limit;
  }
}
