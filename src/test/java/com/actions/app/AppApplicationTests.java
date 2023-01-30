package com.actions.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

  @Test
  @DisplayName("테스트엔티티 테스트")
  void contextLoads() {
      Car car = mock(Car.class);
      when(car.getName()).thenReturn("자동차");
      when(car.getSpeed()).thenReturn(10);

      Car newCar = new Car();

      assertEquals(car.getName(), newCar.getName());
      assertEquals(car.getSpeed(), newCar.getSpeed());
  }

}
