(function () {
    const circle = document.querySelector()     /*여기 놓침..*/
    function handler(e) {
        circle.style.position = 'absolute';
        circle.style.top = e.clientY + 'px';
        circle.style.left = e.clientY + 'px';
    }

    addEventListener('click', handler);



})()