package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class FieldServiceTest {

  private FieldService fieldService = new FieldService();

  @Test
  void field() {
    log.info("main start");
//    Runnable userA = () -> {
//      fieldService.logic("userA");
//    }
  }

}
