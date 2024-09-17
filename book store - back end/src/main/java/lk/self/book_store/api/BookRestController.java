package lk.self.book_store.api;

import lk.self.book_store.dto.request.BookDTO;
import lk.self.book_store.service.BookService;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookstore")
@CrossOrigin(origins = "http://localhost:4200")
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/save",consumes = "application/json")
    public void saveBook(@RequestBody BookDTO bookDto) {
        bookService.saveBook(bookDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/{regnu}",consumes = "application/json" )
    public void updateBook(@RequestBody BookDTO bookDto, @PathVariable String regnu) {
        bookDto.setRegNumber(regnu);
        bookService.updateBook(bookDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{regnu}",consumes = "application/json")
    public void removeBook(@PathVariable String regnu) {
        bookService.deleteBook(regnu);
    }

    @GetMapping("/{regnu}")
    public BookDTO getBook(@PathVariable String regnu) {
        return bookService.getBook(regnu);
    }

    @GetMapping
    public List<BookDTO> findBooks(@RequestParam(name = "q",required = false) String query) {
       if (query == null) query="";
       return bookService.findBooks(query);
    }
}
