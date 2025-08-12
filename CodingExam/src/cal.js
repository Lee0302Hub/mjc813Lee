let num = "";
let rightNum = "";
let op = "";
let result = "";
function checkWhere(num) {
    if(Number(leftNum) == 0) {
        leftNum += number.toString();
    } else {
        rightNum += number.toString();
    }
}
function btn1() {
    checkWhere(1);
}
function btn2() {
    checkWhere(2);
}
function btn3() {
    checkWhere(3);
}
function btn4() {
    checkWhere(4);
}
function btn5() {
    checkWhere(5);
}
function btn6() {
    checkWhere(6);
}
function btn7() {
    checkWhere(7);
}
function btn8() {
    checkWhere(8);
}
function btn9() {
    checkWhere(9);
}
function btnAdd() {
    op = "+";
}
function btnSub() {
    op = "-";
}
function btnDiv() {
    op = "/";
}
function btnMul() {
    op = "*";
}
function btnEqu() {
    switch(op) {
        case "+" :result = (Number(leftNum) + Number(rightNum)).toString(); break;
        case "-" :result = (Number(leftNum) - Number(rightNum)).toString(); break;
        case "/" :result = (Number(leftNum) / Number(rightNum)).toString(); break;
        case "*" :result = (Number(leftNum) * Number(rightNum)).toString(); break;
    }
    document.getElementById("outDiv").innerText = result;
}

class Car {
    name = ""; //최근 자바스크립트의 클래스에서는 let을 쓰지 않음
    constructor(a) {
        this.name = a;
    }
    start() {
        this.name = "Fiat";
    }
}
car = new Car("피아트");