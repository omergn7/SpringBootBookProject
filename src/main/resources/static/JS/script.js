document.addEventListener('DOMContentLoaded', function () {
    showBooks();
});



    document.addEventListener('DOMContentLoaded', function() {
    const userDropdown = document.getElementById('userDropdown');
    const userSubMenu = document.getElementById('userSubMenu');

    userDropdown.addEventListener('click', function(e) {
    e.preventDefault();
    userSubMenu.classList.toggle('show');
});

    // Menü dışında bir yere tıklandığında menüyü kapatma
    window.addEventListener('click', function(e) {
    if (!userDropdown.contains(e.target) && !userSubMenu.contains(e.target)) {
    userSubMenu.classList.remove('show');
}
});
});



// API'den kitapları çek
fetch('/api/kitaplar')
    .then(response => response.json())
    .then(books => {
        const container = document.getElementById("book-container");

        books.forEach(book => {

            const card = document.createElement("section");
            card.className = "card card-blue";
            card.innerHTML = `
                <a href="#" class="card-link" data-kitap-id="${book.kitapId}"> <!-- Kitap detay sayfasına yönlendirir -->
                    <div class="product-image">
                        <img src="${book.kitapImageUrl}" alt="${book.kitapAdi}" draggable="false" />
                    </div>

                    <div class="product-info">
                        <h2>${book.kitapAdi}</h2>
                        <p>${book.yazarAdi}</p>
                        <div class="price">${book.kitapFiyat} ₺</div>
                    </div>
                    <div class="btn">
                        <button class="buy-btn">Satın Al</button>
                        <button class="fav">
                            <svg class="svg" id="i-star" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 32 32" stroke="#000" stroke-linecap="round" stroke-linejoin="round" stroke-width="2">
                                <path d="M16 2 L20 12 30 12 22 19 25 30 16 23 7 30 10 19 2 12 12 12 Z" />
                            </svg>
                        </button>
                    </div>
                </a>
            `;
            container.appendChild(card);
        });

        // Kartlara tıklanma olayı ekle
        document.querySelectorAll('.card-link').forEach(card => {
            card.addEventListener('click', function (event) {
                event.preventDefault(); // Varsayılan bağlantı tıklama olayını durdur
                const kitapId = this.getAttribute('data-kitap-id');
                window.location.href = `/book-details/${kitapId}`;
            });
        });
    })
    .catch(error => console.error('Error fetching books:', error));


let slideIndex = 0;
showSlides(slideIndex);

function changeSlide(n) {
    showSlides(slideIndex += n);
}

function showSlides(n) {
    let slides = document.getElementsByClassName("slide");

    if (n >= slides.length) {
        slideIndex = 0;
    }
    if (n < 0) {
        slideIndex = slides.length - 1;
    }

    for (let i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }

    slides[slideIndex].style.display = "block";
}

// Otomatik slayt geçişi
setInterval(() => {
    changeSlide(1);
}, 5000); // 5 saniyede bir slayt değişimi

function showBooks() {
    fetch('/books')
        .then(response => response.json())
        .then(books => {
            const bookList = document.getElementById('books');
            bookList.innerHTML = '';

            books.forEach(book => {
                const bookItem = document.createElement('div');
                bookItem.classList.add('book-item');

                const bookImg = document.createElement('img');
                bookImg.src = book.image;
                bookItem.appendChild(bookImg);

                const bookTitle = document.createElement('h3');
                bookTitle.textContent = book.title;
                bookItem.appendChild(bookTitle);

                const bookDesc = document.createElement('p');
                bookDesc.textContent = book.description;
                bookItem.appendChild(bookDesc);

                bookList.appendChild(bookItem);
            });
        })
        .catch(error => console.error('Hata:', error));
}

// Sürükleme ile slayt geçişi
const slider = document.querySelector('.slider');
let startX;
let isDragging = false;

slider.addEventListener('mousedown', startDrag);
slider.addEventListener('mousemove', duringDrag);
slider.addEventListener('mouseup', endDrag);
slider.addEventListener('mouseleave', endDrag);

slider.addEventListener('touchstart', startDrag);
slider.addEventListener('touchmove', duringDrag);
slider.addEventListener('touchend', endDrag);

function startDrag(e) {
    isDragging = true;
    startX = e.type.includes('mouse') ? e.pageX : e.touches[0].clientX;
}

function duringDrag(e) {
    if (!isDragging) return;

    const currentX = e.type.includes('mouse') ? e.pageX : e.touches[0].clientX;
    const diffX = startX - currentX;

    if (Math.abs(diffX) > 50) {
        if (diffX > 0) {
            changeSlide(1); // Sağa kaydırma
        } else {
            changeSlide(-1); // Sola kaydırma
        }
        isDragging = false; // Bir kaydırma işlemi sonrasında tekrar sürükleme bekle
    }

}

function endDrag() {
    isDragging = false;
}




