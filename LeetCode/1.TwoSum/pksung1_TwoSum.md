# TwoSum

> Keyword: HashMap


nums 배열에서 두 수가 무조건 target값이 된다.

그 두 수의 index값을 찾는 문제.

HashMap 자료구조로 다른 코드의 비해 99.69% 빠른 방법으로 해결가능


모든 nums값을 순회하며 기억되었던 hashmap에 값이 있는경우, 기억한 index와 순회중인 index를 넘기면 된다.

```js
if (hashmap[target - currentNumber] === undefined) {
    hashmap[currentNumber] = currentIndex
} else {
    return [hashmap[target - currentNumber], currentIndex]
}
```