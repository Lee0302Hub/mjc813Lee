// Update 202503월강의.txt
// 2d64862
// doc\202503월강의.txt
//
// @@ -386,8 +386,8 @@ https://www.w3schools.com/js/js_string_methods.asp
// 에서 string 단어가 있는 배열의 요소를 찾기
//
// - ["Javascript", "strings", "are", ....]
// 알파벳 순서로 요소를 오름차순으로 정렬하기 a, b, . -> A, B, .
// 숫자배열 정렬 : points.sort(function(a, b){return a - b});
// 알파벳 순서로 요소를 오름차순으로 정렬하기 A, B, .-> a, b, .
// 숫자배열 정렬 : points.sort(function(a, b){return a - b});
//
// 문자열배열 정렬 : const fruits = ["Banana", "Orange", "Apple", "Mango"];
// fruits.sort();
// 문자열배열 정렬 : const fruits = ["Banana", "Orange", "Apple", "Mango"];
// fruits.sort();

// let dan = 1; let i = 1;
// Arr.forEach(function(item) {
//     console.log(`${i++}단 : ${item}`);
    //임의 변수 item에 Arr의 첫번째 배열 값을 넣고 console.log로 출력하고 다시 올라가 그다음 배열 인덱스에 있는 값을 item에 넣어 출력을 반복
//});
// @ -391,3 +391,10 @@ https://www.w3schools.com/js/js_string_methods.asp
//
// 문자열배열 정렬 : const fruits = ["Banana", "Orange", "Apple", "Mango"];
// fruits.sort();
//
// - [36, 122, 79, 8, "무궁화", 391, "words", 509, 20192
//     , "B", 321, 473, 73, "france", "Korea", 24, 99]
// console.log() => 출력
// 1. 위 배열을 오름차순으로 정렬해서 출력하세요.
// 2. 가장 큰 값을 출력 하세요
// 3. 짝수인 요소만 배열로 출력하세요
Arr = [36, 122, 79, 8, "무궁화", 391, "words", 509, 20192, "B", 321, 473, 73, "france", "Korea", 24, 99];
Arr.sort((a,b) => (a-b));
console.log(Arr);
console.log(Arr.reverse()[0]);
let Arr2 = function() {for(let i = 0; i < Arr.length; i++){Arr[Arr/2];}}
console.log(Arr2);