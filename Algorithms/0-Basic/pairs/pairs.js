const pairs = (arr) => {
  let resultsArr = [];

  for (let i = 0; i < arr.length; i += 1) {
    for (let j = i + 1; j < arr.length; j += 1) {
        resultsArr.push([arr[i], arr[j]]);
    }
  }

  console.log("This is resultsArr returned, " + resultsArr);
  return resultsArr;
};

pairs(["a", "b", "c"]);
pairs(["a", "b", "c", "d"]);
pairs(["cherry", "cranberry", "banana", "blueberry", "lime", "papaya"]);

/* Approach
- Utilize nested traditional loops.
- Will grab each pair "in-order" and add to a results array.
*/

/* Complexity Analysis
Time: O(n^2)
Space: O(n^2)
*/
