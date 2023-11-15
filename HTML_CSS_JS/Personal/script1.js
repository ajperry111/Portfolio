function moveElement(direction) {
    var plane = document.querySelector('.plane');
    var topPos = parseInt(plane.style.top);
    var leftPos = parseInt(plane.style.left);

    switch (direction) {
      case 'ArrowUp':
        plane.style.top = topPos - 10 + 'px';
        break;
      case 'ArrowDown':
        plane.style.top = topPos + 10 + 'px';
        break;
      case 'ArrowLeft':
        plane.style.left = leftPos - 10 + 'px';
        break;
      case 'ArrowRight':
        plane.style.left = leftPos + 10 + 'px';
        break;
    }
  }

  // Event listener for keydown event
  document.addEventListener('keydown', function(event) {
    moveElement(event.key);
  });







