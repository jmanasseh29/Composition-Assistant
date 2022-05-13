const redButton = document.querySelector('#redButton') as HTMLButtonElement
const orangeButton = document.querySelector('#orangeButton') as HTMLButtonElement
const greenButton = document.querySelector('#greenButton') as HTMLButtonElement
const blueButton = document.querySelector('#blueButton') as HTMLButtonElement
const purpleButton = document.querySelector('#purpleButton') as HTMLButtonElement

const assistant = document.querySelector('#assistant') as HTMLElement
const chords = document.querySelector('#chords') as HTMLElement
const logo = document.querySelector('#logo') as HTMLElement
const enter = document.querySelector('#enter') as HTMLButtonElement

const genre = document.querySelector('#genre') as HTMLSelectElement
const key = document.querySelector('#key') as HTMLSelectElement

const chordDropdown1 = document.querySelector('#dropdown1') as HTMLSelectElement
const chordDropdown2 = document.querySelector('#dropdown2') as HTMLSelectElement
const chordDropdown3 = document.querySelector('#dropdown3') as HTMLSelectElement
const chordDropdown4 = document.querySelector('#dropdown4') as HTMLSelectElement

let currentColor = '#8000FF'

const pop_options = `
<option value="C">C</option>
<option value="D">D</option>
<option value="E">E</option>
<option value="F">F</option>
<option value="G">G</option>
<option value="A">A</option>
<option value="B">B</option>
`

const jazz_options = `
<option value="C">C</option>
<option value="Db">Db</option>
<option value="D">D</option>
<option value="Eb">Eb</option>
<option value="E">E</option>
<option value="F">F</option>
<option value="Gb">Gb</option>
<option value="G">G</option>
<option value="Ab">Ab</option>
<option value="A">A</option>
<option value="Bb">Bb</option>
<option value="B">B</option>
`

const C_options = `
<option value="Cmaj7">Cmaj7</option>
<option value="Dmin7">Dmin7</option>
<option value="Emin7">Emin7</option>
<option value="Fmaj7">Fmaj7</option>
<option value="G7">G7</option>
<option value="Amin7">Amin7</option>
<option value="Bmin7b5">Bmin7b5</option>
`

const Db_options = `
<option value="Dbmaj7">Dbmaj7</option>
<option value="Ebmin7">Ebmin7</option>
<option value="Fmin7">Fmin7</option>
<option value="Gbmaj7">Gbmaj7</option>
<option value="Ab7">Ab7</option>
<option value="Bbmin7">Bbmin7</option>
<option value="Cmin7b5">Cmin7b5</option>
`

const D_options = `
<option value="Dmaj7">Dmaj7</option>
<option value="Emin7">Emin7</option>
<option value="F#min7">F#min7</option>
<option value="Gmaj7">Gmaj7</option>
<option value="A7">A7</option>
<option value="Bmin7">Bmin7</option>
<option value="C#min7b5">C#min7b5</option>
`

const Eb_options = `
<option value="Ebmaj7">Ebmaj7</option>
<option value="Fmin7">Fmin7</option>
<option value="Gmin7">Gmin7</option>
<option value="Abmaj7">Abmaj7</option>
<option value="Bb7">Bb7</option>
<option value="Cmin7">Cmin7</option>
<option value="Dmin7b5">Dmin7b5</option>
`

const E_options = `
<option value="Emaj7">Emaj7</option>
<option value="F#min7">F#min7</option>
<option value="G#min7">G#min7</option>
<option value="Amaj7">Amaj7</option>
<option value="B7">B7</option>
<option value="C#min7">C#min7</option>
<option value="D#min7b5">D#min7b5</option>
`

const F_options = `
<option value="Fmaj7">Fmaj7</option>
<option value="Gmin7">Gmin7</option>
<option value="Amin7">Amin7</option>
<option value="Bbmaj7">Bbmaj7</option>
<option value="C7">C7</option>
<option value="Dmin7">Dmin7</option>
<option value="Emin7b5">Emin7b5</option>
`

const Gb_options = `
<option value="Gbmaj7">Gbmaj7</option>
<option value="Abmin7">Abmin7</option>
<option value="Bbmin7">Bbmin7</option>
<option value="Cmaj7">Cmaj7</option>
<option value="Db7">Db7</option>
<option value="Ebmin7">Ebmin7</option>
<option value="Fmin7b5">Fmin7b5</option>
`

const G_options = `
<option value="Gmaj7">Gmaj7</option>
<option value="Amin7">Amin7</option>
<option value="Bmin7">Bmin7</option>
<option value="Cmaj7">Cmaj7</option>
<option value="D7">D7</option>
<option value="Emin7">Emin7</option>
<option value="F#min7b5">F#min7b5</option>
`

const Ab_options = `
<option value="Abmaj7">Abmaj7</option>
<option value="Bbmin7">Bbmin7</option>
<option value="Cmin7">Cmin7</option>
<option value="Dbmaj7">Dbmaj7</option>
<option value="Eb7">Eb7</option>
<option value="Fmin7">Fmin7</option>
<option value="Gmin7b5">Gmin7b5</option>
`

const A_options = `
<option value="Amaj7">Amaj7</option>
<option value="Bmin7">Bmin7</option>
<option value="C#min7">C#min7</option>
<option value="Dmaj7">Dmaj7</option>
<option value="E7">E7</option>
<option value="F#min7">F#min7</option>
<option value="G#min7b5">G#min7b5</option>
`

const Bb_options = `
<option value="Bbmaj7">Bbmaj7</option>
<option value="Cmin7">Cmin7</option>
<option value="Dmin7">Dmin7</option>
<option value="Ebmaj7">Ebmaj7</option>
<option value="F7">F7</option>
<option value="Gmin7">Gmin7</option>
<option value="Amin7b5">Amin7b5</option>
`

const B_options = `
<option value="Bmaj7">Bmaj7</option>
<option value="C#min7">C#min7</option>
<option value="D#min7">D#min7</option>
<option value="Emaj7">Emaj7</option>
<option value="F#7">F#7</option>
<option value="G#min7">G#min7</option>
<option value="A#min7b5">A#min7b5</option>
`

type RecsRequestData = {
    genre: string
    key: string
    chord1: string
    chord2: string
    chord3: string
    chord4: string
}

type Recs = {
    recs: string[]
}

redButton.addEventListener("click", ()=>changeColor('#FF0049'))
orangeButton.addEventListener("click", ()=>changeColor('#FCC400'))
greenButton.addEventListener("click", ()=>changeColor('#00F090'))
blueButton.addEventListener("click", ()=>changeColor('#00C3FF'))
purpleButton.addEventListener("click", ()=>changeColor('#8000FF'))

genre.addEventListener("change", changeKeyOptions)
key.addEventListener("change", changeChordOptions)

enter.addEventListener("click", postAndUpdate)

function changeKeyOptions() {
    if (genre.value === "Pop") {
        key.innerHTML = pop_options
        changeChordOptions()
    } else if (genre.value === "Jazz") {
        key.innerHTML = jazz_options
        changeChordOptions()
    } else {
        console.log("Error: Invalid Genre")
    }
}

function changeDropDowns(new_options: string) {
    chords.innerHTML = `
        <label class="chordDropDownLabel" for="dropdown1">Chord 1</label>
        <select style="background: ${currentColor}" class="chordDropDownStyle" id="dropdown1" name="dropdown"> <!-- MAIN COLOR -->
            ${new_options}
        </select>
        <label class="chordDropDownLabel" for="dropdown2">Chord 2</label>
        <select style="background: ${currentColor}" class="chordDropDownStyle" id="dropdown2" name="dropdown"> <!-- MAIN COLOR -->
            ${new_options}
        </select>
        <label class="chordDropDownLabel" for="dropdown3">Chord 3</label>
        <select style="background: ${currentColor}" class="chordDropDownStyle" id="dropdown3" name="dropdown"> <!-- MAIN COLOR -->
            ${new_options}
        </select>
        <label class="chordDropDownLabel" for="dropdown4">Chord 4</label>
        <select style="background: ${currentColor}" class="chordDropDownStyle" id="dropdown4" name="dropdown"> <!-- MAIN COLOR -->
            ${new_options}
        </select>
    `
}

function changeChordOptions() {
    if (key.value === "C") {
        changeDropDowns(C_options)
    } else if (key.value === "Db") {
        changeDropDowns(Db_options)
    } else if (key.value === "D") {
        changeDropDowns(D_options)
    } else if (key.value === "Eb") {
        changeDropDowns(Eb_options)
    } else if (key.value === "E") {
        changeDropDowns(E_options)
    } else if (key.value === "F") {
        changeDropDowns(F_options)
    } else if (key.value === "Gb") {
        changeDropDowns(Gb_options)
    } else if (key.value === "G") {
        changeDropDowns(G_options)
    } else if (key.value === "Ab") {
        changeDropDowns(Ab_options)
    } else if (key.value === "A") {
        changeDropDowns(A_options)
    } else if (key.value === "Bb") {
        changeDropDowns(Bb_options)
    } else if (key.value === "B") {
        changeDropDowns(B_options)
    } else {
        console.log("Error: Invalid Key")
    }
}

function changeColor(color: string) {
    currentColor = color
    assistant.innerHTML = `<span style="color: ${color}" class="headerStyle_2"> Assistant </span>`
    changeChordOptions()
    logo.innerHTML = `
    <span style="background: ${color === '#FF0049' ? '#FFD8E6' : color === '#FCC400' ? '#FFF3CA' : color === '#00F090' ? '#BBFAE1' : color === '#8000FF' ? '#F2E4FF' : '#C7F2FF'}" class="logoBG">
       <img width="90" src=${color === '#FF0049' ? 'LogoRed.png' : color === '#FCC400' ? 'LogoOrange.png' : color === '#00F090' ? 'LogoGreen.png' : color === '#8000FF' ? 'LogoPurple.png' : 'LogoBlue.png'} alt=""/>
    </span>`
    enter.innerHTML = `
    <button style="background: ${color === '#FF0049' ? '#FFD8E6' : color === '#FCC400' ? '#FFF3CA' : color === '#00F090' ? '#BBFAE1' : color === '#8000FF' ? '#F2E4FF' : '#C7F2FF'}" class="buttonStyle" id="enterButton">Enter</button>
    `
}

function postAndUpdate() {

    const chordDropdown1 = document.querySelector('#dropdown1') as HTMLSelectElement
    const chordDropdown2 = document.querySelector('#dropdown2') as HTMLSelectElement
    const chordDropdown3 = document.querySelector('#dropdown3') as HTMLSelectElement
    const chordDropdown4 = document.querySelector('#dropdown4') as HTMLSelectElement
    const genre = document.querySelector('#genre') as HTMLSelectElement
    const key = document.querySelector('#key') as HTMLSelectElement

    const postParameters: RecsRequestData = {
        genre: genre.value,
        key: key.value,
        chord1: chordDropdown1.value,
        chord2: chordDropdown2.value,
        chord3: chordDropdown3.value,
        chord4: chordDropdown4.value
    }

    fetch('http://localhost:4567/recommendations', {
        method: 'post',
        body: JSON.stringify({
            genre: postParameters.genre,
            key: postParameters.key,
            chord1: postParameters.chord1,
            chord2: postParameters.chord2,
            chord3: postParameters.chord3,
            chord4: postParameters.chord4
        }),
        headers: {
            'Content-Type': 'application/json; charset=UTF-8',
            "Access-Control-Allow-Origin": "*"
        }
    })
        .then((response) => response.json())
        .then((data: Recs) => {
            // render data.recs onscreen
        });

}