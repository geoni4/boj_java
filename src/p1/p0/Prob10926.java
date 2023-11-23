package p1.p0;

import java.util.Scanner;

public class Prob10926 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();

    System.out.println(id+"??!");
  }
}

/*

https://www.acmicpc.net/problem/10926

??! 성공
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	223219	111822	97523	50.778%
문제
준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.

입력
첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.

출력
첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.

예제 입력 1 
joonas
예제 출력 1 
joonas??!
예제 입력 2 
baekjoon
예제 출력 2 
baekjoon??!
출처
문제를 만든 사람: baekjoon
알고리즘 분류
구현
메모

 */