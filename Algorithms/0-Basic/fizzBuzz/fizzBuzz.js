const fizzBuzz = (n) => {
  const fbArr = [];

  for (let i = 1; i <= n; i += 1) {
    if (i % 5 === 0 && i % 3 === 0) {
      fbArr.push("fizzbuzz");
    } else if (i % 5 === 0) {
      fbArr.push("buzz");
    } else if (i % 3 === 0) {
      fbArr.push("fizz");
    } else {
      fbArr.push(i);
    }
  }

  console.log("This is fbArr returned, " + fbArr);
  return fbArr;
};

fizzBuzz(11);
fizzBuzz(2); 
fizzBuzz(16);