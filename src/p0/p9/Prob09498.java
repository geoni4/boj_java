package p0.p9;

import java.util.Scanner;

public class Prob09498 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();
    char result = 'F';

    if( score <= 100 && score >=90){
      result = 'A';
    } else if(score <= 89 && score >= 80){
      result = 'B';
    } else if(score <= 79 && score >= 70){
      result = 'C';
    } else if(score <= 69 && score >= 60){
      result = 'D';
    } else{
      result = 'F';
    }
    System.out.println(result);
  }
}
/*

https://www.acmicpc.net/problem/9498

시험 성적 성공
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	369299	201539	169778	54.889%
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

예제 입력 1 
100
예제 출력 1 
A
출처
문제를 만든 사람: baekjoon
알고리즘 분류
구현
메모


 */