## Programming Language

- Java, C++, Python, JavaScript

## Algorithm Site

- **baekjoon**: https://www.acmicpc.net/
- **programmers**: https://programmers.co.kr/learn/challenges
- **hackerrank**: https://www.hackerrank.com/
- **leetcode**: https://leetcode.com/
- **codeground**: https://www.codeground.org/about
- **synap**: http://euler.synap.co.kr/
- **topcoder**: https://www.topcoder.com/
- **algospot**: https://algospot.com/judge/problem/list/
- **swexpertacademy**: https://www.swexpertacademy.com/main/main.do
- **geeksforgeeks**: https://www.geeksforgeeks.org/
- **codeforces**: http://codeforces.com

## Folder Structure

- 폴더 구조는 다음과 같다.
  - 사이트 폴더 - 문제 폴더 - 소스코드 및 풀이방법 파일
    - 예) `baekjoon `폴더 -> `1000` 폴더 -> `mark_1000.java` , `mark_1000.md`
  - 사이트 폴더: 누구나 사이트를 알아볼 수 있게 영어로 작성한다.
    - 예) `baekjoon`, `programmers`, `codeground`
  - 문제 폴더: 숫자를 우선적으로 작성, 숫자가 없다면 영어로 작성한다.
    - `1000`, `1234`
  - 소스코드: 자신의 `이름` 혹은 `아이디` 뒤에 `.확장자명`으로 작성한다.
    - `mark_1000.java`, `mark_1000.java`, `mark_1000.cpp`
  - 풀이방법: 자신의 `이름` 혹은 `아이디` 뒤에 `.풀이방법.md` 로 작성한다.
    - `mark_1000.md`

## Commit Rule

- Commit Rule은 다음을 참고한다
  - 브런치 생성: `자기이름(혹은 아이디)_사이트_문제번호`
    - 예) `mark_baekjoon_1000`를 브런치 이름으로 한다.
  - `commit message`는 자유롭게 한다.

## Java

- IntelliJ 으로 진행 방법
  1. 문제번호 Directory 생성
  2. File -> Project Structure
  3. 해당 Directory를 Source 폴더로 변경
  4. 해당 Source 폴더안에 Java Class 생성
  5. 알고리즘 진행

## Node.js

JavaScript로 알고리즘을 진행 할 경우 Node.js 방식으로 진행한다.

Node.js 설치가 되어있어야하고 설치가 되지 않았다면 [Node.js](https://nodejs.org/ko/) 설치 후 진행하기 바란다.

- vsc 으로 진행 방법

  1. node_modules가 필요하기 때문에 맨 처음 clone을 받으면 npm install을 한다.
  2. 문제번호 Directory 생성
  3. Directory 안에 입력.txt을 만든다.
  4. JavaScript 파일을 만들고 알고리즘 진행
  5. 입력 받는 방법은 다음과 같이 사용하면 된다. (`/baekjoon/10998/mark_10998.js 참고`)

     ```javascript
     const input = require("fs")
       .readFileSync(__dirname + "/input.txt")
       .toString()
       .split(" ");
     const result = Number(input[0]) + Number(input[1]);
     ```

  6. 백준 사이트에서 제출할 때는 `readFileSync(__dirname + '/input.txt')` 해당 부분을 `readFileSync('/dev/stdin')` 바꾸면 된다.

## 참고

- [알고리즘 공부법](https://gmlwjd9405.github.io/2018/05/14/how-to-study-algorithms.html)
- [TheCopiens/algorithm-study](https://github.com/TheCopiens/algorithm-study)
- [epicarts/algorithm-study](https://github.com/epicarts/algorithm-study)
- [WeareSoft/algorithm-study](https://github.com/WeareSoft/algorithm-study)
