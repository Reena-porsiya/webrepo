import { Component } from '@angular/core';
import { Country } from "../country";
import { CountryService } from '../country.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-create-country',
  templateUrl: './create-country.component.html',
  styleUrls: ['./create-country.component.css']
})
export class CreateCountryComponent {
  country: Country;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private countryService: CountryService) {
    this.country = new Country();
  }

  onSubmit() {
    
    this.countryService.save(this.country).subscribe((response: any)=>{
      alert(response);
      console.log(response)
  },
  result => this.gotoCountryList());
}

  gotoCountryList() {
    this.router.navigate(['/country']);
  }

}
