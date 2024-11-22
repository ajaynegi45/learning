async function addBooks(books) {
    const url = "https://libraryapi.up.railway.app/addBook";

    for (const book of books) {
        try {
            // Prepare the book data in the specified format
            const bookData = {
                bookName: book.bookName,
                authorName: book.authorName,
                bookPrice: book.bookPrice,
                stockQuantity: book.stockQuantity
            };

            const response = await fetch(url, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(bookData),
            });

            if (!response.ok) {
                throw new Error(`Error: ${response.statusText}`);
            }

            const data = await response.json();
            console.log("Book added successfully:", data);
        } catch (error) {
            console.error("Failed to add book:", error);
        }
    }
}


function getRandomOddNumber(min, max) {
    let num;
    do {
        num = Math.floor(Math.random() * (max - min + 1)) + min;
    } while (num % 2 === 0); // Ensure it's odd
    return num;
}

const famousCodingBooks = [
    { bookName: "Java Programming: An Introduction to Computer Science", authorName: "Walter Savitch" },
    { bookName: "Introduction to Computer Science in Java", authorName: "Robert Sedgewick and Kevin Wayne" },
];
const booksArray = famousCodingBooks.map(book => ({
    bookName: book.bookName,
    authorName: book.authorName,
    bookPrice: getRandomOddNumber(150, 800), 
    stockQuantity: getRandomOddNumber(1, 80)
}));


addBooks(booksArray);
