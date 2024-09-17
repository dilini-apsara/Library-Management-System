import {Component, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";
import {Books} from "../books";
import {BooksService} from "../books.service";
import {ActivatedRoute, Router} from "@angular/router";


@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrl: './update-book.component.css'
})
export class UpdateBookComponent implements OnInit {
  regnu: String | undefined = '';
  books: Books = new Books();

  constructor(private bookService: BooksService,
              private route: ActivatedRoute,
              private router: Router) {
  }


  updateBook(frmModel: NgForm) {
    this.books = frmModel.value;
    console.log(this.regnu);
    this.bookService.updateBook(frmModel.value, this.regnu)
      .subscribe(data => {

        this.gotoBookList();
      })
  }

  ngOnInit(): void {
    this.regnu = this.route.snapshot.params['regnu'];
    this.bookService.getBookByRegNumber(this.regnu)
      .subscribe(data => {
        this.books = data
        this.books.regNumber=data.regNumber;
      }, error => console.log(error));
  }

  gotoBookList() {
    this.router.navigate(['/bookstore'])
  }

}
