import { Component } from '@angular/core';
import { Flight } from '../../models/flight.model';
import { FlightService } from '../../services/flight.service';



@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrl: './add-flight.component.css'
})
export class AddFlightComponent {
flight:Flight = {
  iataCountryCode: '',
  name: ''
};
submitted = false;
 

constructor(private flightService: FlightService) {}

saveFlight():void {
  const data = {
    iataCountryCode: this.flight.iataCountryCode,
    name: this.flight.name
  };
  console.log(data);
  this.flightService.create(data).subscribe({
    next: (res) => {
      console.log(res);
      console.log('Name:', this.flight.name);
      console.log('IATA Country Code:', this.flight.iataCountryCode);
      this.submitted = true;
    },
    error: (e) => console.error(e)
  });

}
newFlight():void {
    this.submitted = false;
    this.flight = {
      iataCountryCode: '',
      name: '',
     
    };
  }


}


