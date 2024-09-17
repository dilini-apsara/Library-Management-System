package lk.self.book_store.service;

import lk.self.book_store.dto.request.BookDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    void saveBook(BookDTO book);
    void updateBook(BookDTO book);
    void deleteBook(String regNumber);
    BookDTO getBook(String regNumber);
    List<BookDTO> findBooks(String query);
}
