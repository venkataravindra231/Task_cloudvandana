document.getElementById("surveyForm").addEventListener("submit", function(event) {
    event.preventDefault();
    alert("Successfully submitted");
});

document.getElementById("reset").addEventListener("click", function() {
    document.getElementById("surveyForm").reset();
});