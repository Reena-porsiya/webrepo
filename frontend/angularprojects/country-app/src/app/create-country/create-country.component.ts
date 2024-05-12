import { Component } from '@angular/core';

@Component({
  selector: 'app-create-country',
  templateUrl: './create-country.component.html',
  styleUrls: ['./create-country.component.css']
})
export class CreateCountryComponent {
  country: any = {};

  onSubmit() {
    console.log('Form submitted:', this.country);
    // Perform any action with the submitted data
  }
}
