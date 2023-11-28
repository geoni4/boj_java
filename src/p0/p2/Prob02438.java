package p0.p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class Prob02438 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("resources/p0/p2/Prob02438.txt"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for(int it = 0; it < N; it++){
      for(int j = 0; j <= it; j++){
        bw.write('*');
      }
      bw.write('\n');
    }
    bw.flush();
  }
}
