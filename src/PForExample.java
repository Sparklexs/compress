import me.lemire.compression.*;

import java.util.*;

public class PForExample {
    public static void main(String[] args) {
        final int N = 1333333;
        int[] data = new int[N];
        // initialize the data (most will be small
        for(int k = 0; k < N; k+=1) data[k] = 3;
        // throw some larger values
        for(int k = 0; k < N; k+=5) data[k] = 100;
        for(int k = 0; k < N; k+=533) data[k] = 10000;
        int[] compressed = new int [N+1024];// could need more
        IntegerCODEC codec =  new 
           Composition(
                    new Simple9(),
                    new VariableByte());
        // compressing
        IntWrapper inputoffset = new IntWrapper(0);
        IntWrapper outputoffset = new IntWrapper(0);
        codec.compress(data,inputoffset,data.length,compressed,outputoffset);
        System.out.println("compressed unsorted integers from "+data.length*4/1024+"KB to "+outputoffset.intValue()*4/1024+"KB");
        // we can repack the data: (optional)
        compressed = Arrays.copyOf(compressed,outputoffset.intValue());

        int[] recovered = new int[N];
        IntWrapper recoffset = new IntWrapper(0);
        codec.uncompress(compressed,new IntWrapper(0),compressed.length,recovered,recoffset);
        if(Arrays.equals(data,recovered)) 
          System.out.println("data is recovered without loss");
        else
          throw new RuntimeException("bug"); // could use assert
        System.out.println();
    }
   
}