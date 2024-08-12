document.addEventListener('DOMContentLoaded', () => {
    const questionContainer = document.getElementById('question-container');
    const optionsContainer = document.getElementById('options-container');
    const nextBtn = document.getElementById('next-btn');
    const prevBtn = document.getElementById('prev-btn');
    const scoreContainer = document.getElementById('score-container');

    let currentQuestionIndex = 0;
    let score = 0;

    const questions = [
        {
            "question": "Which tag is used to create a hyperlink in HTML?",
            "options": ["<link>", "<a>", "<href>", "<hyperlink>"],
            "answer": 1
        },
        {
            "question": "What does CSS stand for?",
            "options": ["Cascading Style Sheets", "Computer Style Sheets", "Creative Style Sheets", "Cascading System Sheets"],
            "answer": 0
        },
        {
            "question": "Which of the following is not a JavaScript data type?",
            "options": ["String", "Boolean", "Number", "Float"],
            "answer": 3
        },
        {
            "question": "Which attribute is used to provide an alternative text for an image in HTML?",
            "options": ["title", "alt", "src", "href"],
            "answer": 1
        },
        {
            "question": "Which symbol is used for comments in JavaScript?",
            "options": ["//", "/* */", "#", "<!-- -->"],
            "answer": 0
        },
        {
            "question": "How do you select an element with the class 'example' in CSS?",
            "options": [".example", "#example", "example", "*example"],
            "answer": 0
        },
        {
            "question": "Which method is used to add an element at the end of an array in JavaScript?",
            "options": ["push()", "pop()", "shift()", "unshift()"],
            "answer": 0
        },
        {
            "question": "Which HTML tag is used to define an internal style sheet?",
            "options": ["<style>", "<script>", "<css>", "<link>"],
            "answer": 0
        }
    ];
    

    function loadQuestion() {
        const question = questions[currentQuestionIndex];
        questionContainer.textContent = question.question;
        optionsContainer.innerHTML = '';
        
        question.options.forEach((option, index) => {
            const button = document.createElement('button');
            button.textContent = option;
            button.onclick = () => checkAnswer(index);
            optionsContainer.appendChild(button);
        });

        updateButtons();
    }

    function checkAnswer(selectedIndex) {
        if (questions[currentQuestionIndex].answer === selectedIndex) {
            score += 10;
        }
        scoreContainer.textContent = `Score: ${score}`;
        nextBtn.disabled = false;
    }

    function updateButtons() {
        prevBtn.style.display = currentQuestionIndex === 0 ? 'none' : 'inline-block';
        nextBtn.textContent = currentQuestionIndex === questions.length - 1 ? 'Finish' : 'Next';
    }

    nextBtn.addEventListener('click', () => {
        if (currentQuestionIndex < questions.length - 1) {
            currentQuestionIndex++;
            loadQuestion();
        } else {
            alert('Quiz Finished! Your final score is ' + score);
        }
    });

    prevBtn.addEventListener('click', () => {
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--;
            loadQuestion();
        }
    });

    loadQuestion();
});
