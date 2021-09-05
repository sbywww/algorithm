const input = require('fs').readFileSync(__dirname + '/10998.txt').toString().split(" ");
const result = Number(input[0]) + Number(input[1]);
console.log(result);