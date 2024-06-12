// 用对象module接收module.js成员
import {PI as pi, PI, sum, Person} from './module.js'

console.log(PI);
console.log(pi);
console.log(sum(1, 2));

let person = new Person('Alice', 10)
console.log(person)