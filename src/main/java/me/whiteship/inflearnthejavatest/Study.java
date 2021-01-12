package me.whiteship.inflearnthejavatest;

// command+shift+t하면 바로 테스트생성
public class Study {

  private StudyStatus status = StudyStatus.DRAFT;

  public Enum getstatus() {
    return this.status;
  }
}
