package p1.p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob11021 {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("resources/p1/p1/Prob11021.txt"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int test_case = Integer.parseInt(br.readLine());

    for(int it =1; it<=test_case;it++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      bw.write("Case #" + it +": " + (a+b) + "\n");
    }
    bw.flush();
    br.close();
  }
}

/*

https://www.acmicpc.net/problem/11021

A+B - 7 성공
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	268773	132112	114054	49.066%
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

예제 입력 1 
5
1 1
2 3
3 4
9 8
5 2
예제 출력 1 
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
출처
문제를 만든 사람: baekjoon
빠진 조건을 찾은 사람: djm03178
비슷한 문제
1000번. A+B
1001번. A-B
1008번. A/B
2558번. A+B - 2
10950번. A+B - 3
10951번. A+B - 4
10952번. A+B - 5
10953번. A+B - 6
10998번. A×B
11022번. A+B - 8
15740번. A+B - 9
15792번. A/B - 2
알고리즘 분류
수학
구현
사칙연산
메모


 */