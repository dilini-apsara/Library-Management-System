import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Books} from "./books";

@Injectable({
  providedIn: 'root'
})
export class BooksService {

private baseUrl="http://localhost:8080/api/v1/bookstore";
  constructor(private httpClient: HttpClient) {}

    getBookslist():Observable<Books[]>{
      return this.httpClient.get<Books[]>(`${this.baseUrl}`);
    }

    saveBook(book:Books):Observable<Object>{
    return this.httpClient.post(`${this.baseUrl}`+"/save",book);
    }

  getBookByRegNumber(regnu: String | undefined):Observable<Books>{
    return this.httpClient.get<Books>(`${this.baseUrl}/${regnu}`)
    }

  updateBook(book: Books, regnu: String | undefined):Observable<Books>{
    return  this.httpClient.patch<Books>(`${this.baseUrl}/${regnu}`,Books);

    }

  // deleteBook(regnu: String | undefined):Observable<Object>{
  //   return  this.httpClient.delete(`${this.baseUrl}/${regnu}`);
  //   }

}
