package bai2;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        String PATH_NUMBER="src/bai2/number.txt";
        String PATH_RESULT="src/bai2/result.txt";
        List<Integer> numbers=readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue=findMax(numbers);
        readAndWriteFile.witeFile(PATH_RESULT,maxValue);
    }
}
