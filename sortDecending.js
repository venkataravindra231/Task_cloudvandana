function sortDescending(arr) {
    arr.sort(function(a, b) {
      return b - a;
    });
  }
  let numbers = [5, 2, 9, 1, 5, 6];
  sortDescending(numbers);
  console.log(numbers); 
  