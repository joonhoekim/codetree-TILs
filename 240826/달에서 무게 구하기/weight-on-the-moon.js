let earthWeight = 13;
let convertRatio = 0.165.toFixed(6)
let moonWeight = (earthWeight * convertRatio).toFixed(6);

console.log(`${earthWeight} * ${convertRatio} = ${moonWeight}`)