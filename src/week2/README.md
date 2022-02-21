# 정렬 알고리즘
### 1. [O(n2)의 시간복잡도](https://bangu4.tistory.com/206?category=1056717)

버블정렬, 선택정렬, 삽입정렬 3가지가 존재한다. 한줄로 특징을 줄여보자면

버블정렬은 서로 붙은애들끼리 자리 바꾸기,

선택정렬은 비교할 애들중 최소값 찾기 ,

삽입정렬은 그냥 연결리스트일때 하나씩 연결해주기 라고 말할수 있을것 같다.

### 2. [O(n logn)의 시간복잡도](https://bangu4.tistory.com/207?category=1056717)
퀵소트, 힙 소트, 머지소트  3가지가 존재한다.

모두 다 트리의 개념이 들어간 정렬 알고리즘이며,

퀵소트와 머지소트는 분할 정복 알고리즘이라고도 분류한다.

퀵소트 피봇을 기준으로 작은값은 앞으로, 큰 값은 뒤로 재귀적으로 분할정복 정렬

힙 소트 힙을 이용한 정렬,  머지소트 분할 병합 정복이다.

### 3. 자바의 정렬 ([배열정렬](https://bangu4.tistory.com/287?category=1003336), [객체 정렬](https://bangu4.tistory.com/288?category=1003336))
다양한 정렬 알고리즘이 존재하지만, 문제를 풀때 사용하는 방법은 아니다.

기본적으로 각 자료형이 제공하는 Sort 메소드와 배열과 클래스의 사용자 정렬을 위한

Comparable, Comparator의 인터페이스를 구현하는 방법을 익히고 익숙해지는것이 중요하다.



+ ✅ 1	2750	 수 정렬하기
+ ✅ 2	2751	 수 정렬하기 2
+ ✅ 3	10989	 수 정렬하기 3
+ ✅ 4	2108	 통계학
+ ✅ 5	1427	 소트인사이드
+ ✅ 6	11650	 좌표 정렬하기
+ ✅ 7	11651	 좌표 정렬하기 2
+ ✅ 8	1181	 단어 정렬
+ ✅ 9	10814	 나이순 정렬
+ ✅ 10	18870	 좌표 압축