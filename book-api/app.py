#!/bin/python3

from flask import Flask, jsonify, request

app = Flask(__name__)

books = [
	{"id": 1, "title": "Nineteen Eighty-Four", "author": "George Orwell"},
	{"id": 2, "title": "Lord of the Rings", "author": "JRR Tolkien"},
]


# The endpoints
@app.route("/books", methods=["GET"])
def get_books():
	return jsonify(books)


# The main program to start the Flask app
if __name__ == '__main__':
	app.run(port=5000)
