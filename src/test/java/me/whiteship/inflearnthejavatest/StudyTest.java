package me.whiteship.inflearnthejavatest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

// DisplayNameGeneration 우선순위 낮음.
@DisplayNameGeneration(ReplaceUnderscores.class)
class StudyTest {
  @Test
  @DisplayName("스터디 만들기 😎")
  void create_new_study(){
    assertTimeout(Duration.ofMillis(100), () -> {
      new Study(10);
      Thread.sleep(100);
    });
    
  }


  @Test
  void create_new_study_again(){
    System.out.println("create1");
  }

  // 모든 테스트들이 실행하기 전에 단 한번만 실행, 반드시 스태틱 사용, private사용 불가, 리턴 있으면 안됌.
  @BeforeAll
  static void beforeAll(){
    System.out.println("before All");
  }

  // 모든 테스트가 실행된 이후 단 한번만 실행, 반드시 스태틱 사용, private사용 불가, 리턴 있으면 안됌.
  @AfterAll
  static void afterAll(){
    System.out.println("after all");
  }


  // 각각의 테스트를 실행하기 전에 실행된다.
  @BeforeEach
  void beforeEach(){
    System.out.println("before each");
  }

  // 각각의 테스트를 실행한 이후에 실행된다.
  @AfterEach
  void afterEach(){
    System.out.println("after each");
  }
}