//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String example1 = """
                #
                ##
                ###
                ####
                """;

        System.out.println("'" + example1 + "'");

        String result = getPyramid(4);
        System.out.println("'" + result + "'");

        assert result.trim().equals(example1.trim()); //ignore whitespace on each end

        //another test, but with not output
        assert getPyramid(2).trim().equals("""
                #
                ##
                """.trim()); //ignore whitespace on each end
        assert getPyramid(3).trim().equals("""
                #
                ##
                ###
                """.trim()); //ignore whitespace on each end

    }
    static String getPyramid(int n){
        String output = "";
        for(int i=0; i < n; i++){
            for(int j = 0; j < (i + 1); j++){
                output += "#";
            }
            output += "\n";
        }
        return output;
        //lines 1,2,3
        //quantity chars follows line number - going up to it
    }
}
/*
LEVEL 2:
   #
  ##
 ###
####
LEVEL 3:
   #
  ###
 #####
#######
LEVEL 4:
   # #
  ## ##
 ### ###
#### ####
 */