"use strict";
const redButton = document.querySelector('#redButton');
const orangeButton = document.querySelector('#orangeButton');
const greenButton = document.querySelector('#greenButton');
const blueButton = document.querySelector('#blueButton');
const purpleButton = document.querySelector('#purpleButton');
const assistant = document.querySelector('#assistant');
const chords = document.querySelector('#chords');
const logo = document.querySelector('#logo');
const enter = document.querySelector('#enter');
redButton.addEventListener("click", () => changeColor('#FF0049'));
orangeButton.addEventListener("click", () => changeColor('#FCC400'));
greenButton.addEventListener("click", () => changeColor('#00F090'));
blueButton.addEventListener("click", () => changeColor('#00C3FF'));
purpleButton.addEventListener("click", () => changeColor('#8000FF'));
function changeColor(color) {
    assistant.innerHTML = `<span style="color: ${color}" class="headerStyle_2"> Assistant </span>`;
    chords.innerHTML = `
    <label class="chordDropDownLabel" for="dropdown1">Chord 1</label>
<select style="background: ${color}" class="chordDropDownStyle" id="dropdown1" name="dropdown"> <!-- MAIN COLOR -->
    <option value="Option 1">Option 1</option>
    <option value="Option 2">Option 2</option>
</select>
<label class="chordDropDownLabel" for="dropdown2">Chord 2</label>
<select style="background: ${color}" class="chordDropDownStyle" id="dropdown2" name="dropdown"> <!-- MAIN COLOR -->
    <option value="Option 1">Option 1</option>
    <option value="Option 2">Option 2</option>
</select>
<label class="chordDropDownLabel" for="dropdown3">Chord 3</label>
<select style="background: ${color}" class="chordDropDownStyle" id="dropdown3" name="dropdown"> <!-- MAIN COLOR -->
    <option value="Option 1">Option 1</option>
    <option value="Option 2">Option 2</option>
</select>
<label class="chordDropDownLabel" for="dropdown4">Chord 4</label>
<select style="background: ${color}" class="chordDropDownStyle" id="dropdown4" name="dropdown"> <!-- MAIN COLOR -->
    <option value="Option 1">Option 1</option>
    <option value="Option 2">Option 2</option>
</select>
</div>
    `;
    logo.innerHTML = `
    <span style="background: ${color === '#FF0049' ? '#FFD8E6' : color === '#FCC400' ? '#FFF3CA' : color === '#00F090' ? '#BBFAE1' : color === '#8000FF' ? '#F2E4FF' : '#C7F2FF'}" class="logoBG">
       <img width="90" src=${color === '#FF0049' ? 'LogoRed.png' : color === '#FCC400' ? 'LogoOrange.png' : color === '#00F090' ? 'LogoGreen.png' : color === '#8000FF' ? 'LogoPurple.png' : 'LogoBlue.png'}/>
    </span>`;
    enter.innerHTML = `
    <button style="background: ${color === '#FF0049' ? '#FFD8E6' : color === '#FCC400' ? '#FFF3CA' : color === '#00F090' ? '#BBFAE1' : color === '#8000FF' ? '#F2E4FF' : '#C7F2FF'}" class="buttonStyle" id="enterButton">Enter</button>
    `;
}
