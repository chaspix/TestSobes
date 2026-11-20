import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

 class HhGearGamesTest {
     private final HhGearGames hhGearGames = new HhGearGames();
     private static int max = Integer.MAX_VALUE;
     private static int min = Integer.MIN_VALUE;
     static Stream<Arguments> cases() {
         return Stream.of(
                 Arguments.of(new int[]{1, 1, 2, 2, 3},            new int[]{1, 2, 3}),
                 Arguments.of(new int[]{1, 1, 2, 2, 3, 3, 6},      new int[]{1, 2, 3, 6}),
                 Arguments.of(new int[]{0, 0, 1, 1, 0},            new int[]{0, 1, 0}),
                 Arguments.of(new int[]{-1, -1, 0, 0, -1},         new int[]{-1, 0, -1}),
                 Arguments.of(new int[]{5, 5, 5, 5},               new int[]{5}),
                 Arguments.of(new int[]{1, 1},                     new int[]{1}),
                 Arguments.of(new int[]{7},                        new int[]{7}),
                 Arguments.of(new int[]{1, 2, 3},                  new int[]{1, 2, 3}),
                 Arguments.of(new int[]{min, min, max},
                         new int[]{min, max})
         );
     }


     @ParameterizedTest
     @MethodSource("cases")
     void hhTaskTestRemoveDuplicates(int[] input, int[] exp){
         assertArrayEquals(exp, hhGearGames.hhTask(input));
     }

     @Test
     void hhTaskTestEmptyArray(){
         assertArrayEquals(new int[0], hhGearGames.hhTask(new int[0]));
     }

     @Test
     void hhTaskTestReturnsNewArray(){
         int[] input = {1, 2, 3};
         assertNotSame(input, hhGearGames.hhTask(input));
     }

}
