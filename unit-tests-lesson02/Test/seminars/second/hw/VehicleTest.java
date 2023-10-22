package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Pegeuot", "406", 2005);
        motorcycle = new Motorcycle("Kawasaki", "Vector", 2016);
    }

    @Test
    void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testFourWheelCar() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    void testTwoWheelMotorcycle() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    void testCarSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    void testCarParkModeAfterTestDrive() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    void testMotorcycleParkModeAfterTestDrive() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}