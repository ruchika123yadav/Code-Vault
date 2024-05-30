
const express = require('express'); // Importing the Express module
const { v4: uuidv4 } = require('uuid');
const path = require('path'); // Importing the Path module for handling file and directory paths
const methodOverride = require('method-override');

const app = express(); // Creating an instance of Express
const port = 3000; // Setting the port number to 3000

// Middleware to parse URL-encoded data and JSON data from incoming requests
app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use(methodOverride('_method'));

// Setting the view engine to EJS for rendering HTML templates
app.set("view engine", 'ejs');
app.set("views", path.join(__dirname, 'views'));

// Serving static files from the 'public' directory
app.use(express.static(path.join(__dirname, 'public')));

// Starting the server and listening on the specified port
app.listen(port, () => {
    console.log(`Connected to port: ${port}`); // Logging a message to the console once the server is running
});

// Sample posts data with unique IDs
let posts = [
    {
        username: "Ruchika Yadav",
        content: "I'm a hardworking girl",
        id: uuidv4()
    },
    {
        username: "Om Yadav",
        content: "I'm a Cool boy",
        id: uuidv4()
    },
    {
        username: "Shanu Yadav",
        content: "I'm an Enthusiastic person",
        id: uuidv4()
    }
];

// Route to render all posts
app.get('/posts', (req, res) => {
    res.render('index', { posts });
});

// Route to render the "New Post" form
app.get('/posts/new', (req, res) => {
    res.render('newPost'); // Corrected from app.render to res.render
});

// Route to handle the creation of a new post
app.post('/posts', (req, res) => {
    let { username, content } = req.body;//post request beheji haii to body me to jo data dala hoga whi aya hoga
    let newId = uuidv4(); // Generate a new ID
    posts.push({ username, content, id: newId });
    res.redirect('/posts');
});

// Route to handle displaying a single post by ID
app.get('/posts/:id', (req, res) => {
    let { id } = req.params;
    let post = posts.find((p) => id === p.id);
    console.log(id);
    if (post) {
        res.render('individualPost', { post });
    } else {
        res.status(404).send('Post not found');
    }
});


// PATCH REQUEST TO UPDATE THE POST
app.patch('/posts/:id', (req, res) => {
    let { id } = req.params;
    let post = posts.find((p) => id === p.id);
    let newContent = req.body.content;
    post.content = newContent;
    console.log(post);
    res.redirect('/posts');

})

//EDITING THE POST
app.get('/posts/:id/edit', (req, res) => {
    let { id } = req.params;
    let post = posts.find((p) => id === p.id);

    console.log(post)
    res.render('editPost.ejs', { post });
})

//  DELETE THE POST
app.delete('/posts/:id', (req, res) => {
    let { id } = req.params;
    let post = posts.find((p) => id === p.id);
    posts=posts.filter((p)=> id!==p.id);
    res.redirect('/posts');
 
})