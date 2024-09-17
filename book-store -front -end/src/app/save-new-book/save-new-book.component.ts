import { Component } from '@angular/core';
import {NgForm} from "@angular/forms";
import {Books} from "../books";
import {BooksService} from "../books.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-save-new-book',
  templateUrl: './save-new-book.component.html',
  styleUrl: './save-new-book.component.css'
})
export class SaveNewBookComponent {

  books:Books={
    regNumber:'',
    bookName:'',
    author:'',
    copies:0
  }

  constructor(private bookService:BooksService, private router:Router) {
  }
  saveBook(frmModel:NgForm){
    frmModel.control.markAllAsTouched();
    if(frmModel.invalid){
      alert("Invalid");
    }else {
      this.bookService.saveBook(frmModel.value).subscribe(()=>{
        this.books=frmModel.value;
        this.gotoBookList();
        alert("Successfully saved !");
      },
        error => {
        alert("Book is already saved");
        console.log(error)
        });

      frmModel.resetForm();
    }
  }

  gotoBookList(){
    this.router.navigate(['/bookstore'])
  }

  protected readonly Books = Books;
}
