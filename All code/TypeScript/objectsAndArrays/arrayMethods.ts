var levels: number[] = [20, 30, 12, 30, 100, 20];

console.log(levels.toString());
console.log(levels.join(" "));
console.log(levels.slice(3));
console.log(levels.toString());

levels.splice(2, 3, 88, 99);
console.log(levels.toString());

levels.push(10, 20, 30);
console.log(levels.toString());
console.log(levels.pop());