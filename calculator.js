let display = document.getElementById('display');
let calculation = '';

function appendToDisplay(value) {
  if (value === '.' && calculation.includes('.')) {
    return;
  }

  calculation += value;
  display.value = calculation;
}

function clearDisplay() {
  calculation = '';
  display.value = '';
}

function calculateResult() {
  try {
    const result = eval(calculation);
    display.value = result;
    calculation = result.toString();
  } catch (error) {
    display.value = 'Error';
  }
}
