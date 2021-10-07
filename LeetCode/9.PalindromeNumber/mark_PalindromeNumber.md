# 풀이 방법

앞에서부터 읽으나 뒤에서부터 읽으나 동일한 수인 것을 찾아라

입력 예시
```java
  x = 121
```

```java
public boolean isPalindrome(int x) {
    if (x < 0) return false;
    
    int target = x;
    int result = 0;
    while (x != 0) {
        result = result * 10 + x % 10;
        x = x / 10;
    }
    
    return result == target;
}

```
```
target = 입력된 수
result = 수를 거꾸로 변경하기

x가 121일 경우
x % 10 을 하게되면 일의 자리를 구할 수 있다.

121 % 10 => 1
result = 0 * 10 + 121 % 10
result = 1

x = 121 / 10
x = 12

12 % 10 => 2
result = 1 * 10 + 12 % 10
result = 12

x = 12 / 10
x = 1

1 % 10 = 1
result = 12 * 10 + 1 % 10
result = 121

target == result 같으면 true를 반환
```


 