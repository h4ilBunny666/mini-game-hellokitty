 document.addEventListener('DOMContentLoaded', () => {
    //opção de cartas
     const cards = [
        {
            name:'Hello Kitty',
            img:'cartas/hello kitty 1.jpg'
        },
        {
            name:'Kuromi',
            img:'cartas/kuromi 2.jpg'
        },
        {
            name:'Pompompurin',
            img:'cartas/pompompurim 3.jpg'
        },
        {
            name:'My Melody',
            img:'cartas/my melody 4.jpg'
        },
        {
            name:'Pochacco',
            img:'cartas/pochacco 5.jpg'
        },
        {
            name:'Happy Holiday',
            img:'cartas/holiday 6.jpg'
        },
        {
            name:'Carta Frente',
            img:'cartas/carta frente.jpg'
        },
        {
            name:'Carta Verso',
            img:'cartas/carta final.jpg'
        },
        {
            name:'Hello Kitty',
            img:'cartas/hello kitty 1.jpg'
        },
        {
            name:'Kuromi',
            img:'cartas/kuromi 2.jpg'
        },
        {
            name:'Pompompurin',
            img:'cartas/pompompurim 3.jpg'
        },
        {
            name:'My Melody',
            img:'cartas/my melody 4.jpg'
        },
        {
            name:'Pochacco',
            img:'cartas/pochacco 5.jpg'
        },
        {
            name:'Happy Holiday',
            img:'cartas/holiday 6.jpg'
        },
        {
            name:'Carta Frente',
            img:'cartas/carta frente.jpg'
        },
        {
            name:'Carta Verso',
            img:'cartas/carta final.jpg'
        }
    ]

    //embaralhar todas as cartas
    cards.sort(() => 0.5 - Math.random())

    //carregar elementos htmll no script
    const board = document.querySelector('.board')
    const resultView = document.querySelector('#result')
    let cardsChosen = []; //cartas escolhidas
    let cardsChosenId = []; //id das cartas escolhidas 
    let cardsWon = []; //cartas combinadas

    //criar o quadro de cartas
    function createBoard () {
        for (let i = 0; i < cards.length;  i++) {
            const card = document.createElement('img');
            card.setAttribute('src', 'cartas/carta frente.jpg');
            card.setAttribute('data-id', i);
            card.addEventListener('click', flipCard)
            board.appendChild(card);
    }
    }
    function flipCard(){
       let cardId = this.getAttribute('data-id');
       cardsChosen.push(cards[cardId].name);
       cardsChosenId.push(cardId);
       this.setAttribute('scrc', cards[cardId].img);
    });
