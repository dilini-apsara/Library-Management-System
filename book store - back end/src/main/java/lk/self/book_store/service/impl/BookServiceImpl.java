package lk.self.book_store.service.impl;

import jakarta.transaction.Transactional;
import lk.self.book_store.dto.request.BookDTO;
import lk.self.book_store.entity.Book;
import lk.self.book_store.repository.BookRepository;
import lk.self.book_store.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;


    public BookServiceImpl(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void saveBook(BookDTO dto) {
        // Book bookEntity = new Book("id",dto.getBookName(), dto.getAuthor(), dto.getCopies());
        //bookRepository.save(bookEntity);
        // System.out.println("saved " + bookEntity);
        // return "saved"+ bookEntity;

        if (bookRepository.existsById(dto.getRegNumber()))
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    "Book reg number" + dto.getRegNumber() + " already exists");
        bookRepository.save(modelMapper.map(dto, Book.class));
    }

    @Override
    public void updateBook(BookDTO book) {
        if (!bookRepository.existsById(book.getRegNumber()))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "The book " + book.getRegNumber() + " does not exist");
        bookRepository.save(modelMapper.map(book,Book.class));
    }

    @Override
    public void deleteBook(String regNumber) {
        if(!bookRepository.existsById(regNumber))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "The book" + regNumber + "does not exist");
        bookRepository.deleteById(regNumber);
    }

    @Override
    public BookDTO getBook(String regNumber) {
        return bookRepository.findById(regNumber)
                .map(book -> modelMapper.map(book, BookDTO.class))
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "The book" + regNumber + "does not exist"));
    }

    @Override
    public List<BookDTO> findBooks(String query) {
        query="%"+query+"%";
        return bookRepository.findBookByRegNumberOrBookNameOrAuthorLike(query,query,query)
                .stream()
                .map(book -> modelMapper.map(book,BookDTO.class))
                .collect(Collectors.toList());
    }
}
