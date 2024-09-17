import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BookListComponent} from "./book-list/book-list.component";
import {SaveNewBookComponent} from "./save-new-book/save-new-book.component";
import {UpdateBookComponent} from "./update-book/update-book.component";

const routes: Routes = [
  {
    path:"bookstore",
    component:BookListComponent
  },
  {path:"save",
  component:SaveNewBookComponent
  },
  {
    path:":regnu",
    component:UpdateBookComponent
  },
  {
    path:":regnu",
  },
  {
    path:"",
    redirectTo:"bookstore",
    pathMatch:'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
