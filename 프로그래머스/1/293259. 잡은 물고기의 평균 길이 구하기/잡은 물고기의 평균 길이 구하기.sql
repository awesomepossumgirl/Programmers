-- 코드를 작성해주세요
SELECT ROUND(
    AVG(
        CASE 
            WHEN LENGTH IS NULL THEN 10  -- NULL 값인 경우 10으로 처리
            WHEN LENGTH <= 10 THEN 10   -- 10 이하일 경우 10으로 처리
            ELSE LENGTH                 -- 그 외의 경우에는 원래 LENGTH 사용
        END
    ), 2) AS AVERAGE_LENGTH
FROM FISH_INFO

/*WHERE LENGTH IS NOT NULL: NULL 값을 필터링하여 평균 계산에 영향을 미치지 않도록 합니다
근데 어차피 집계함수에서 NULL 값은 제외되서 상관 없음
그럼 뭐가 문제일까
일단 결과가 35로 정수값이 나옴*

아 NULL을 제외하면 안된다...

물고기 길이가 10cm 이하면 NULL이라 했는데
이것들도 10 으로 잡고 집계에 포함시켜 줘야 하기 때문에 ...ㅎㅎ


그럼 그냥 간단하게 10cm 이하는 10이라고 CASE 조건 안 줘도 코드 더 짧게 쓸 수 있다 
SELECT ROUND(AVG(IFNULL(LENGTH, 10)),2) AS AVERAGE_LENGTH FROM FISH_INFO
하면 되는건가?

그리고 언제는 case 구문에서 end as 써줘야 되고 언제는 alias 안 써도 되나
FROM 절에 서브쿼리 쓸 때만 써 주면 되겠지?
*/