// console.log('hello')
// alert(1)


// let, const 사용
let let1 = 1;
let let2 = 3;
let1 = 5;
let2 = 'a';
//let let1 = 'abc';     재선언은 불가능

let a2 = "3";
let b2 = a2 + "abc";
console.log(b2)
let c2 = 3 * a2;
console.log(c2)
// let boolean1 = !!let(a);

if (!0) {
    alert('False');
}


const b3 = new Boolean(false);

if (b3) {
    console.log('b3는 true. 객체입니다');
}


// 함수 선언식
function a() {
    console.log(1);
}

// 함수 표현식
const b = a;
const c = () => {
    console.log(2);
}

// 함수 축약형
class AClass {
    fn() {
        console.log(3);
    }
}

// 즉시 실행  IIFE
(function() {
    console.log('즉시실행');
})()


if (true) {
    var globala = 1;
}

a();
b();
c();
