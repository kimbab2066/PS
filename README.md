# 백준 문제 풀이
  1. 단계별 문제
  2. 삼성 SW 역량 테스트 기출 문제
# 프로그래머스 문제 풀이
  1. 1단계
  2. 2단계
  
# 코딩 테스트 대비 주요 알고리즘 코드
## 최대 공약수, 최소 공배수
유클리드 호제법(Euclidean algorithm)으로 재귀함수를 만들어 최대공약수와 최소공배수를 구한다.

```java
static int GCD(int a, int b) {
  if (b == 0) return a;
    return GCD(b, a % b);
}
static int GCD2(int a, int b){
  while(b != 0){
    int d = a % b;
    a = b;
    b = d;
  }
  return a;
}
static int LCD(int a, int b{
  return a * b / GCD(a, a % b);
}
```
## 동적 프로그래밍(Dynamic Programming)
