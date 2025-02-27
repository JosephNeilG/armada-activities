// Task 1: Create and Use an Object
let book = {
    title: "Isang Kaibigan",
    author: "Sara Duterte",
    pages: 25,
    isRead: false
}

console.log(book.title);
console.log(book.author);
console.log(book.pages);
console.log(book.isRead);

console.log(book["title"]);
console.log(book["author"]);
console.log(book["pages"]);
console.log(book["isRead"]);

book.isRead = true;
book.genre = "Children's Fiction"
console.log(book);

// Task 2: Create and Modify an Array of Objects
let movies = [
    {
        title: "Inception",
        director: "Christopher Nolan",
        year: 2010
    },
    {
        title: "Parasite",
        director: " Bong Joon-ho",
        year: 2019
    },
    {
        title: "The Godfather",
        director: "Francis Ford Coppola",
        year: 1972
    }
]

console.log(movies[1].title);
let newObj = {
    title: "Interstellar",
    director: "Christopher Nolan",
    year: 2014
}
movies.push(newObj);
movies[0].year = 2023;

console.log(movies);

// Task 3: Combine Objects and Arrays
let student = {
    name: "Joseph Neil F. Gapuz",
    age: 22,
    subjects: ["HTML", "CSS", "JavaScript"]
}

console.log(student.subjects[0]);
student.subjects.push("Responsive Web Design"),
console.log(student);

// Task 4: Challenge Task (Optional)
let recipe = {
    name: "Fruit Salad",
    ingredients: [
        {
            name: "Apple",
            quantity: "1 piece"
        },
        {
            name: "Banana",
            quantity: "1 piece"
        },
        {
            name: "Milk",
            quantity: "1/2 cup"
        }
    ],
    isVegetarian: true
}

let newIngredientObj = {
    name: "Honey",
    quantity: "1 tbsp"
}

recipe.ingredients.push(newIngredientObj);
console.log(recipe.ingredients[1].name);
console.log(recipe);