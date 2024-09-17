import {Component} from '@angular/core';
import {Books} from "../books";
import {BooksService} from "../books.service";
import {Router} from "@angular/router";


@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrl: './book-list.component.css'
})
export class BookListComponent {

  books: Books[] = [];


  constructor(private BooksService: BooksService,
              private router: Router) {

  }

  ngOnInit(): void {
    this.getBooks();

    // this.books=[{
    //   "regNumber":"B011",
    //   "bookName":"MadolDuwa",
    //   "author":"Martin Wikramasinghe",
    //   "copies":12
    // }];
  }

  private getBooks() {
    this.BooksService.getBookslist().subscribe(data => {
      this.books = data;
    })
  }

  updateBook(regnu: String | undefined) {
    console.log(regnu)
    this.router.navigate([regnu]);
  }

  // deleteBook(regnu: String | undefined) {
  //   this.BooksService.deleteBook(regnu).subscribe(data => {
  //     this.getBooks();
  //     console.log(regnu);
  //   });
  // }
}
