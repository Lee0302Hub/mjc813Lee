let exam = "Javascript strings are primitive and immutable: All string methods produce a new string without altering the original string.";
let examSplit = exam.split(" ");
console.log(examSplit);
let exam1 = exam;
let exam2 = exam1.toUpperCase();

let modifiedExam = "";
for (let i = 0; i < exam.length; i++) {
    // exam2의 길이가 exam보다 짧으면 문제가 생길 수 있으므로 조건을 추가할 수 있습니다.
    if (exam2.charAt(i) >= exam.charAt(i)) {
        modifiedExam += exam.charAt(i).toLowerCase();
    } else if (exam2.charAt(i) < exam.charAt(i)) {
        modifiedExam += exam.charAt(i).toUpperCase();
    } else {
        modifiedExam += exam.charAt(i);
    }
}
console.log(modifiedExam);
let exam3 ="";
exam1.replace("strings", exam3 = "string");
console.log(exam3);

