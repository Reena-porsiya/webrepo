// create-country.component.ts
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Country } from './country.model';
import { CountryService } from '../country.service';

@Component({
  selector: 'app-create-country',
  templateUrl: './create-country.component.html',
  styleUrls: ['./create-country.component.css']
})
export class CreateCountryComponent implements OnInit {
  countryForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private countryService: CountryService) {
    this.countryForm = this.formBuilder.group({
      iataCountryCode: ['', Validators.required],
      name: ['', Validators.required]
    });
  }

  ngOnInit(): void {
  }

  onSubmit() {
    if (this.countryForm.valid) {
      const newCountry: Country = {
        iataCountryCode: this.countryForm.value.iataCountryCode,
        name: this.countryForm.value.name
      };
      this.countryService.createCountry(newCountry);
      this.countryForm.reset();
    }
  }
}
