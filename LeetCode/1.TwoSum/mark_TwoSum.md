# 풀이 방법

numbers의 배열의 값이 target 값과 동일한 인덱스 두 개를 추출하라는 뜻으로 생각하시면 됩니다.

입력 예시
```java
int[] numbers = {2, 7, 11, 15};
int target = 9;
```

```java
public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2]; 
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
}

/*
 * i = 0,
 * if (map 에 '7' 키값이 없으므로 false) 생략
 * map.put(2, 0);
 * 
 * i = 1,
 * if (map 에 '2' 키값이 있으므로 true) {
 *  result[1] = 1;
 *  result[0] = map.get(9-7) == map.get(2) == 0;
 *  return result;
 * }
 * 
 * result = [0, 1];
 * */
```
```
numbers[0] + numbers[1] = 9 이고
target 의 값과 동일하므로 numbers의 0, 1 인덱스가 추출됩니다.
따라서, [0, 1] 으로 추출할 수 있습니다.
```


 