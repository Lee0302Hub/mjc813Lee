//@ -78,3 +78,66 @@ let _age = 3;
//let 1age = 4;
//let 1age = 4;

import readline from "readline";

class Exam0414 {
    makeLotto() {
        // 난수로 6개의 숫자를 발행하되, 중복 안됨, 오름차순 정렬
        //Math.random(); // 0.00000 ~ 0.9999999 * 45
        // => 0.45050 ~ 44.7546 + 1 => 1 ~ 45
        let arrLotto1 = [];
        for ( let i = 0; i < 6; i++ ) {
            let nRd = Math.floor( Math.random() * 45 ) + 1;
            // nRd 에는 1~45 까지의 난수가 생성된다.
            if ( !this.existNumber(nRd, arrLotto1) ) {
                // 중복된 값이 없을 경우
                arrLotto1.push(nRd);
            } else {
                // 중복된 값이 있을 경우
                i--;    // loop 를 한번 더 실행해야 한다.
            }
        }
        arrLotto1.sort( (a,b) => { return a - b });  // 숫자배열을 오름차순으로 정렬
        console.log(`makeLotto1 : ${arrLotto1}`);

        let arrLotto2 = [];
        while( arrLotto2.length < 6 ) { // 배열의 길이가 6보다 작으면 실행
            let nRd = Math.floor( Math.random() * 45 ) + 1; // 난수 발생
            if ( !this.existNumber(nRd, arrLotto2) ) {
                // 중복된 값이 없을 경우
                arrLotto2.push(nRd);
            }
        }
        arrLotto2.sort( (a,b) => { return a - b });  // 숫자배열을 오름차순으로 정렬
        console.log(`makeLotto2 : ${arrLotto2}`);
    }

    existNumber(number, array) {
//        let result = array.some( function(item) {   // 배열 모든 원소를 각각 함수 문장으로 비교한다. 하나라도 true 이면 true 를 리턴한다.
//            return item === number;
//        }); // array 배열에서 number === item 이 같은 원소 있으면 true 리턴
//        return result;

        for( let i = 0; i < array.length; i++ ) {
            // 배열 모든 원소를 if 절로 비교한다.
            if ( number === array[i] ) {
                // 같은 값이 존재하면 바로 return true 시킨다.
                return true;
            }
        }
        return false;   // 모든 원소를 비교했을때 같은 값이 없으면 return false
    }

    pdfExam10() {
        let i ;
        for(i = 0; i < 5; i++) {
            process.stdout.write(" ");
            if(i === 3) {
                process.stdout.write("*");
            }
        }
        for(i = 0; i < 5; i++) {
            if(i & 2 == 0) {

            }
        }
     }

    pdfExam12() {
    }

    pdfExam13() {
    }

    pdfExam16() {
    }

    pdfExam17() {
        const readline = require('readline');
        const r1 = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });


        r1.question('유주 키 : ', (height) =>{
  //     height = parseInt(readLine(""));

        if(height < 150) {
            console.log("Yes");
        } else {
            console.log("No");
        }
        });
    }

    pdfExam18() {

    }

}
class Exam25 {
maps = new Map();

inputFunc() {
    let names = prompt("이름을 공백으로 구분하여 입력하세요.");
    let score = prompt("점수를 공백으로 구분하여 입력하세요.");
    let arrName = names.split(" ");
    let arrScore = score.split(" ");

    if (arrName.length != arrScore.length) {
        alert("두개 배열의 길이가 다릅니다. 다시 시작하세요.");
        return false;   // 함수가 false 를 리턴한다.
    }
    this.maps.set(arrName[0], Number(arrScore[0])); // Number 는 문자열을 숫자로 변경
    this.maps.set(arrName[1], Number(arrScore[1]));
    console.log(this.maps);
    return true;    // 함수가 true 를 리턴한다.
}

outputFunc() {
    let strOutput = "{";
    for( let item of this.maps ) {
        console.log(item);
        strOutput += `'${item[0]}': ${item[1]}, `
    }
    strOutput = strOutput.substring(0 , strOutput.length - 2);
    // 문자열의 길이에서 -2 시킨 길이의 문자열로 다시 저장. "abcd" => "ab"
    strOutput += "}";
    console.log(strOutput);
}
}

let exam = new Exam27();
if ( exam.inputFunc() ) {   // inputFunc() 를 실행하고 리턴값이 true 이면
    exam.outputFunc();  // outputFunc() 를 실행한다.
}

class Exam41 {
    const r1 = readline.createInterface({
        input: process.stdin();
    });

}

let exam0414 = new Exam0414();
exam0414.makeLotto();
//exam0414.pdfExam17();
exam0414.pdfExam10();