// 用对象module接收module.js成员
// import * as module from './module.js'

// console.log(module.default(1, 2));

import {default as add} from './module.js'

console.log(add(1, 2));