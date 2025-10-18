// Helper Function
const charFreqHM = (word) => {
  let freqHashMap = {};

  for (let char of word) {
    if (!(char in freqHashMap)) {
      freqHashMap[char] = 0;
    }

    freqHashMap[char] += 1;
  }

  return freqHashMap;
};

// Main Driver Function
const anagrams = (word1, word2) => {
  let charFreqWord1 = charFreqHM(word1);

  for (let char of word2) {
    if (!(char in charFreqWord1)) {
      console.log("False");
      return false;
    }

    charFreqWord1[char] -= 1;
  }

  for (let key in charFreqWord1) {
    if (charFreqWord1[key] !== 0) {
      console.log("False");
      return false;
    }
  }

  console.log("True");
  return true;
};

anagrams("restful", "fluster"); // -> true
anagrams("cats", "tocs"); // -> false
anagrams("monkeyswrite", "newyorktimes"); // -> true
anagrams("elbow", "below"); // -> true

// JAVASCRIPT - O(2n+m) T, O(n) S

/* Approach (JavaScript)
- Create a helper function that takes a word string as an input,
processes the word and generates a HashMap of the frequency 
of each char/letter of the word.
- First word is processed and respective HashMaps is generated.
Loop over second word and check if first word HashMap firstly has
each char as a key, if it doesn't - early return false, if it does
subtract 1 from freq count.
- Lastly loop over first word HashMap and see if frequencies for chars
are equal to 0. If yes, return true.
*/
