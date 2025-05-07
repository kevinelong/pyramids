
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Level2 {
    String solve(int n){
        ArrayList<String> output = new ArrayList<>();
        //lines
        for(int i = 0; i < n; i++){
            //spaces n - i - 1
            int spacesNeeded = n - i - 1;
            for(int s=0;s<spacesNeeded; s++){
                output.add(" ");
            }

            //hashes i + 1
            int hashesNeeded = i + 1;
            for(int h = 0; h < hashesNeeded; h++){
                output.add("#");
            }
            output.add("\n");
        }
        return String.join("", output);
//        return """
//   # 4 - 0 - 1 == 3
//  ## 4 - 1 - 1 == 2
// ### 4 - 2 - 1 == 1
//#### 4 - 3 - 1 == 0
//                """;
    }

    @Test
    void test(){
        String expected = "   #\n  ##\n ###\n####\n";
        String result = solve(4);
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void test2(){
        String expected = "    #\n   ##\n  ###\n ####\n#####\n";
        String result = solve(5);
        System.out.println(result);
        assertEquals(expected, result);
    }
}
