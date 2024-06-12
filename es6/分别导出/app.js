// 用对象module接收module.js成员
import * as module from './module.js'

console.log(module.PI);
console.log(module.PI2);
console.log(module.sum(1, 2));

let person = new module.Person('Alice', 10)
console.log(person)