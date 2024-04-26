package oops.day5.task1

object LibraryManagement {

    private val books : MutableList<Book> = mutableListOf()
    private val booksList : HashSet<String> = HashSet()
    private val authorList : HashSet<String> = HashSet()
    private val categoryList : HashSet<String> = HashSet()

    fun addBookIntoDb(type : Admin ,book: Book) {
        books.add(book)
        booksList.add(book.title)
        authorList.add(book.author)
        categoryList.add(book.category)
        println("Book added")
    }

    fun showAllBooksAvailable(type: Admin){
        for (book in books) {
            println(book.title)
        }
    }

    fun removeBookFromDb(type: Admin, book: Book) {
        books.remove(book)
        booksList.remove(book.title)
        authorList.remove(book.author)
        categoryList.remove(book.category)
        println("Book Removed")
    }

    fun bookIssued(book : String) {
        booksList.remove(book)
    }

    private fun isBookPresent(bookName : String): Boolean {
        return booksList.contains(bookName)
    }

    private fun isAuthorPresent(authorName : String) : Boolean {
        return authorList.contains(authorName)
    }

    private fun isCategoryPresent(category : String) : Boolean {
        return categoryList.contains(category)
    }

    fun searchBookByTitle(title: String): Boolean {
        if (isBookPresent(title)) {
            println("Yes, Book is Present")
            return true
        }
        println("Book not available right now")
        return false
    }

    fun searchBookByAuthor(author: String): Boolean {
        if (isAuthorPresent(author)) {
            println("Yes, Book of this author is Present")
            return true
        }
        println("Author's book not available right now")
        return false

    }

    fun searchBookByCategory(category: String): Boolean {
        if (isCategoryPresent(category)) {
            println("Yes, Book of this category is Present")
            return true
        }
        println("This category's Book not available right now")
        return false
    }
}