// Helper Function
const count = (word) => {
  const freqHashMap = {};

  for (let char of word) {
    if (!(char in freqHashMap)) {
      freqHashMap[char] = 0;
    }
    freqHashMap[char] += 1;
  }

  return freqHashMap;
};

// Driver Function
const mostFreqChar = (word) => {
  const charFreqs = count(word);
  let theMostFreqChar = '';
  let currMaxCharFreq = 0;
  
  for (let letter of word) {
    let letterFreq = charFreqs[letter];

    if (letterFreq > currMaxCharFreq) {
      currMaxCharFreq = letterFreq;
      theMostFreqChar = letter;
    }
  }

  console.log("The most frequent is... " + theMostFreqChar);
  return theMostFreqChar;
}

mostFreqChar("bookeeper"); // -> 'e'
mostFreqChar("david"); // -> 'd'
mostFreqChar("mississippi"); // -> 'i'
mostFreqChar("eleventennine"); // -> 'e'

// O(2n) T, O(n) S
