(function () {

    function getSession(hours) {
        return hours > 11 ? 'PM' : 'AM';
    }

    function sessionHours(hours) {
        return hours > 12 ? hours - 12 : hours;
    }

    // const res = '${hours > 12 ? hours-12 : hours}:${minutes}:${seconds} ${session}';

    setInterval(clock, 1000);

    function padding(s, n = 2) {
        const prefix = '0000000000000000';
        const news = prefix + s;

        return news.substring(news.length - n, news.length);
        // return s.toString().length > 2? '0' + s : s;
    }

    function clock() {
        let d = new Date(); /*Date가 객체가 안되네..*/
        const hours = d.getHours();
        const minutes = d.getMinutes();
        const seconds = d.getSeconds();
        const session = getSession(hours);
        document.querySelector('#clock').innerHTML = `${padding(sessionHours(hours))}:${minutes}:${seconds} ${session}`;
    }


})();