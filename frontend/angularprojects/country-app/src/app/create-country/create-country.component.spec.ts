// create-country.component.spec.ts

import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { CreateCountryComponent } from './create-country.component';

describe('CreateCountryComponent', () => {
  let component: CreateCountryComponent;
  let fixture: ComponentFixture<CreateCountryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreateCountryComponent],
      imports: [FormsModule]
    }).compileComponents();

    fixture = TestBed.createComponent(CreateCountryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
