import java.util.Arrays;

public class HhGearGames {
    int[] hhTask(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int[] result = new int[array.length];
        int count = 1;
        result[0] = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] != result[count - 1]){
                result[count++] = array[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

}
