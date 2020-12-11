var a = ['', 'one ', 'two ', 'three ', 'four ', 'five ', 'six ', 'seven ', 'eight ', 'nine ', 'ten ', 'eleven ', 'twelve ', 'thirteen ', 'fourteen ', 'fifteen ', 'sixteen ', 'seventeen ', 'eighteen ', 'nineteen '];
var b = ['', '', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety'];

function inWords(num) {
    if ((num = num.toString()).length > 9) return 'overflow';
    n = ('00000' + num).substr(-5).match(/^(\d{2})(\d{1})(\d{2})$/);
    //console.log(n);
    if (!n) return; var str = '';
    str += (n[1] != 0) ? (a[Number(n[1])] || b[n[1][0]] + ' ' + a[n[1][1]]) + 'thousand ' : '';
    str += (n[2] != 0) ? (a[Number(n[2])] || b[n[2][0]] + ' ' + a[n[2][1]]) + 'hundred ' : '';
    str += (n[3] != 0) ? ((str != '') ? 'and ' : '') + (a[Number(n[3])] || b[n[3][0]] + ' ' + a[n[3][1]]) : '';
    //console.log(str);
    return str;
}

var i;
var wordsArray = new Array(1000);
for (i = 1; i <= 1000; i++) {
    wordsArray[i] = inWords(i);
}
var sumCharacters = 0;
wordsArray.forEach(element => {
    var singleElement = element.replace(/\s+/g, '');
    console.log(singleElement);
    console.log(singleElement.length);
    sumCharacters = sumCharacters + singleElement.length;});

console.log("sumCharacters " + sumCharacters);

