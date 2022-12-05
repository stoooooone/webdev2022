(function () {
    const ball = document.querySelector('.ball');
    const moveBall = (e) => {
        ball.style.top = e.clientY + 'px';
        ball.style.left = e.clientX + 'px';
    }
    const init = () => {
        addEventListener('click', moveBall);
    }
    addEventListener('DOMContentLoaded', init);


    // function handler(e) {
    //     circle.style.position = 'absolute';
    //     circle.style.top = e.clientY + 'px';
    //     circle.style.left = e.clientY + 'px';
    // }
    // addEventListener('click', handler);



})()