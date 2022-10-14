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
static int LCM(int a, int b{
  return a * b / GCD(a, a % b);
}
```
## 동적 프로그래밍(Dynamic Programming)
**동적 프로그래밍은** **큰 문제의 해답에 작은 문제의 해답이 포함**되어 있고, 이를 재귀호출 알고리즘으로

구현하면 **지나친 중복이 발생하는 경우**에 이 **재귀적 중복을 해결하는 방법**을 뜻한다.

**최장 공통 부분 순서(LCS)**

**최장 공통 부분 순서 길이(재귀호출)**
```java
LCS(m,n){
  if(m = 0 or n = 0) then return 0;
  else if(xₘ = yₙ) then return LCS(m-1, n-1) + 1;
  else return max(LCS(m-1, n), LCS(m, n-1));
}

```
**최장 공통 부분 순서 길이(동적 프로그래밍)**
```java
LCS(m,n){
  for i <- 0 to m
    C[i,0] <- 0;
  for j <- 0 to n
    C[0,j] <- 0;
  for i <- 1 to m //1번 loop
    for j <- 1 to n
      if (xᵢ = yᵣ) then C[i,j] <- C[i-1,j-1]+1;//yᵣ = y의 j를 의미
      else C[i,j] <- max{C[i-1,j], C[i,j-1]};
  return C[m,n];
}
```

## 이진 탐색(Binary Search)
```java
static void binarySearch(int start, int end, int target, int[] arr) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				arr[mid] = 0;
			} else if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (end + start) / 2;
		}
	}// end of bS
```
