import React, { Component } from 'react';
import './App.css';

class App extends Component {
  state = {
    isLoading: true,
    books: []
  };
  async componentDidMount() {
    const response = await fetch('/api/books');
    const body = await response.json();
    this.setState({books: body._embedded.books, isLoading: false});
  }

  render() {
    const {books, isLoading} = this.state;
    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div className="App">
        <header className="App-header">
          <div className="App-intro">
            <h2>Book List</h2>
            {books.map(book =>
              <div key={book.id}>
                {book.name} - {book.author}
              </div>
            )}
          </div>
        </header>
      </div>
    );
  }
}
export default App;