const longestWord = (sentence) => {
    let biggestWord = "";
    let sentenceArr = sentence.split(" ");

    for (let word of sentenceArr) {
        if (word.length >= biggestWord.length) {
            biggestWord = word;
        }
    }

    console.log("This is longestWord returned, " + biggestWord);
    return biggestWord;
};

longestWord("what a wonderful world"); // -> 'wonderful'
longestWord("have a nice day"); // -> 'nice'
longestWord("the quick brown fox jumped over the lazy dog"); // -> 'jumped'
longestWord("who did eat the ham"); // -> 'ham'
longestWord("potato"); // -> 'potato'

/*
Complexity Analysis: O(n) T, O(n) S
Time grows with size of sentence, space is used for making array and it grows with size of sentence
*/ 