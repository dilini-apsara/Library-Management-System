package lk.self.book_store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "reg_number")
    private String regNumber;
    @Column(name = "book_name",nullable = false)
    private String bookName;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private Integer copies;
}
