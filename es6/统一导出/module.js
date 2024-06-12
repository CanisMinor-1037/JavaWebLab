const PI = 3.14;
const PI2 = 3.14;

function sum(a, b) {
    return a + b;
}

class Person{

    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    hello() {
        console.log(`Hello, ${this.name}`)
    }
}

export {PI, sum, Person}