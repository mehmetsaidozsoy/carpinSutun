import java.io.*;

public class carpinSutun {
    
public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());
    for(int i=1;i<=10;i++){
        int n=N*i;
        System.out.println(N+" x "+i+" = "+n);
    }

    bufferedReader.close();
}
}