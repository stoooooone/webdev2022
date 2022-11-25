// console.log("5");

fetch('/proxy/daum')
    .then(res => res.json())
        .then(data => {
            let wrapper = document.querySelector('#wrapper');
            let ul = document.createElement('ul');
            let list = data.keywordList[0].subContents.map(item => `<li>${item.title}</li>`);
            ul.innerHTML = list.join('');
            wrapper.append(ul);
        });

axios.get('/proxy/daum')
    .then(res => res.data.keyworkList[0].subContents)
        .then(list => {
            let wrapper = document.querySelector('#axios');
            let ul = document.createElement('ul');
            let str = list.map(item => `<li>${item.title}</li>`);
            ul.innerHTML = str.join('');
            wrapper.append(ul);
        })