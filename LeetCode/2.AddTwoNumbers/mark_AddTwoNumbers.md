# 풀이 방법

해당 l1, l2의 값을 역순으로 변경 후 더한 값을 출력해라.

입력 예시
```java
  int[] l1 = {2, 4, 3};
  int[] l2 = {5, 6, 4};
```

```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    int sum = 0, p = 0;
    ListNode result, temp = new ListNode(0);
    result = temp;
    while (l1 != null || l2 != null || sum != 0) {
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
    
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
    
        p = sum % 10;
        sum /= 10;
        temp.next = new ListNode(p);
        temp = temp.next;
    }

    return result.next;
}

```
```
sum: 값을 더한 변수
p: 10의 자리 이상일 경우 나머지의 값의 표현
result: 최종 결과 ListNode
temp: 다음 ListNode를 쌓기 위해 필요한 임시 ListNode

l1 = 2, l2 = 5 일 때,
1. sum = 2, l1 = 4
2. sum = 7, l2 = 6 
3. p = 7, sum = 0
4. temp.val = 0, temp.next = new ListNode(7)
5. temp.val = 7, temp.next = null

l1 = 4, l2 = 6 일 때,
1. sum = 2, l1 = 4
2. sum = 7, l2 = 6 
3. p = 0, sum = 1
4. temp.val = 7, temp.next = new ListNode(0)
5. temp.val = 0, temp.next = null

l1 = 3, l2 = 4 일 때,
1. sum = 4, l1 = null
2. sum = 8, l2 = null
3. p = 8, sum = 0
4. temp.val = 0, temp.next = new ListNode(8)
5. temp.val = 8, temp.next = null


result ListNode를 표현하면
'ㄴ' 하나의 ListNode 객체
result
ㄴ 0
   ㄴ 7
      ㄴ 0
         ㄴ 8
```


 