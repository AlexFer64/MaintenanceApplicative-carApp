import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class contains unit tests for the Driver class.
 */
public class DriverTest {

    /** The driver instance used in the tests. */
    private Driver adult;

    private Driver child;

    /**
     * Sets up the driver instance before each test.
     */
    @BeforeEach
    public void setUp() {
        adult = new Driver("John", 20);
        child = new Driver("Kevin", 9);
    }

    @AfterEach
    public void tearDown(){
        adult = null;
        child = null;
    }

    /**
     * Tests if the driver is considered an adult.
     */
    @Test
    public void test_is_adult_when_driver_is_an_adult() {
        //GIVEN
        boolean result;
        //WHEN
        result = adult.isAdult();

        //THEN
        assertThat(result).isTrue();
    }

    /**
     * Tests starting the car.
     *
     * <p>How to assert that the startCar method was called?</p>
     */
    @Test
    public void test_start_car() {
        Car car = new Car("Sedan", "Blue");
        adult.startCar();
        // How to assert that the startCar method was called?
    }

    /**
     * Tests stopping the car.
     *
     * <p>How to assert that the stopCar method was called?</p>
     */
    @Test
    public void test_stop_car() {
        Car car = new Car("Sedan", "Blue");
        adult.stopCar();
        // How to assert that the stopCar method was called?
    }

    /**
     * Tests changing the speed of the car.
     */
    @Test
    public void test_change_speed() {
        Car car = new Car("Sedan", "Blue");
        adult.changeSpeed(car, 80);
        assertThat(car.getSpeed()).isEqualTo(10);
    }
}
