const baseButton = document.getElementById("baseBtn");
const otherButton = document.getElementById("otherBtn");
const makeButton = document.getElementById("makeBtn");
const startButton = document.getElementById("startBtn");

const baseText = document.getElementById("base");
const otherText = document.getElementById("other");

var baseList = new Array(0);
var otherList = new Array(0);

var baseIndex = 0;
var otherIndex = 0;
let baseTimeId;
let otherTimeId;

function displayBaseText(list) {
    if (list.length === 0) {
        return;
    }

    if (list.length <= baseIndex) {
        baseIndex = 0;
    }

    baseText.textContent = list[baseIndex];
    baseIndex = baseIndex + 1;

    baseTimeId = setTimeout(displayBaseText, 10, list);
}

baseButton.addEventListener('click', ()=> {
    startButton.disabled = true;
    baseButton.disabled = true;
    makeButton.disabled = true;
    clearTimeout(baseTimeId);
});

function displayOtherText(list) {
    if (list.length === 0) {
        return;
    }

    if (list.length <= otherIndex) {
        otherIndex = 0;
    }

    otherText.textContent = list[otherIndex];
    otherIndex = otherIndex + 1;

    otherTimeId = setTimeout(displayOtherText, 10, list);
}


otherButton.addEventListener('click', ()=> {
    startButton.disabled = true;
    otherButton.disabled = true;
    makeButton.disabled = true;
    clearTimeout(otherTimeId);
});

startButton.addEventListener('click', ()=> {
    startButton.disabled = true;
    baseButton.disabled = false;
    otherButton.disabled = false;
    makeButton.disabled = true;
    displayBaseText(baseList);
    displayOtherText(otherList);
});

