# 풀이방법

## 문제
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

요약하자면, 32비트 int형이 주어졌을 때 역순으로 출력하기

## 예시
```java
Input: x = 123
Output: 321

Input: x = -123
Output: -321

Input: x = 120
Output: 21

Input: x = 0
Output: 0
```

## 답안
```java
public static int reverse(int x) {
    long result = 0;

    while (x != 0) {
        result = (result * 10) + (x % 10);
        x /= 10;
    }

    if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
        return 0;
    } else {
        return (int) result;
    }
}
```

## 풀이
```
1. long result = 0;
result를 int로 할 경우, int가 받을 수 있는 최대 값을 넘길 때, 
0을 반환할 수 가 없어서 long으로 선언 후, 형변환 작업을 하도록 했다.

2. result = (result * 10) + (x % 10);
result에 있던 기존 값에 10을 곱한뒤,
x를 10으로 나눈 나머지가 항상 1의 자리로 오도록 했다.

3. x /= 10;
x를 계속 나눠, 0이 아닐 때 까지 반복.

4. if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
값이 int의 최대값보다 크거나 / 최소값보다 작으면 0을 반환.
```

## 느낀점
```
문제를 잘 해독하지 않고 result 선언을 long 타입으로 하지 않아서 계속 오버플로가 발생해 애를 먹었다.
int가 가지는 최대값과 최솟값을 구할 때도 애를 먹었는데 찾아보니 Integer 클래스에서 제공하는 MIN.VALUE, MAX.VALUE가 있다는 것을 처음알았다.
```

