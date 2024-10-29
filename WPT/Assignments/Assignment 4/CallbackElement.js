function forEachElement(arr, callback) {
    for (let i = 0; i < arr.length; i++) {
      callback(arr[i], i);
    }
  }
  
  // Function to be called on button click
  function processArray() {
    const array = [1, 2, 3, 4];
    const resultContainer = document.getElementById("result");
  
    // Clear previous results
    resultContainer.innerHTML = "";
  
    // Use forEachElement with an anonymous function as callback
    forEachElement(array, function(element, index) {
      const listItem = document.createElement("li");
      listItem.textContent = `Index ${index}: ${element * 2}`;
      resultContainer.appendChild(listItem);
    });
  }
  