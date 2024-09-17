package lk.self.book_store.repository;

import lk.self.book_store.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Book, String> {

    // Select * from Book where reg_number like q1 or book_name like q2 or author like q3
   List<Book> findBookByRegNumberOrBookNameOrAuthorLike(String q1, String q2, String q3);
}
