import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaveNewBookComponent } from './save-new-book.component';

describe('SaveNewBookComponent', () => {
  let component: SaveNewBookComponent;
  let fixture: ComponentFixture<SaveNewBookComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SaveNewBookComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SaveNewBookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
