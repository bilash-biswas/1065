var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var a = [];
var i,s = 0;
for(i = 0;i < 5;i++){
    a.push(parseInt(lines.shift()));
}
for(i = 0;i < 5;i++){
    if (a[i] % 2 === 0) {
    s++;
  }
}
console.log(s + ' valores pares');
