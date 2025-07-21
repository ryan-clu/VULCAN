const maxValue = (arrNums) => {
  let maxVal = -Infinity;

  for (let num of arrNums) {
    if (num >= maxVal) {
      maxVal = num;
    }
  }

  console.log('This is maxVal returned, ' + maxVal);
  return maxVal;
};

maxValue([4, 7, 2, 8, 10, 9]); // -> 10
maxValue([10, 5, 40, 40.3]); // -> 40.3
maxValue([-5, -2, -1, -11]); // -> -1
maxValue([42]); // -> 42
maxValue([1000, 8]); // -> 1000
maxValue([1000, 8, 9000]); // -> 9000
maxValue([2, 5, 1, 1, 4]); // -> 5