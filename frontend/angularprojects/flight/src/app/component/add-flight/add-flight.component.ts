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
submitted: boolean = false;
error: boolean = false;

constructor(private flightService: FlightService) {}

saveFlight(): void {
  this.flightService.create(this.flight).subscribe({
    next: () => {
      this.submitted = true;
      this.error = false;
      this.flight = { iataCountryCode: '', name: '' }; 
    },
    error: () => {
      this.submitted = true;
      this.error = false;
    }
  });
}

newFlight(): void {
  this.submitted = false;
  this.error = false;
  this.flight = { iataCountryCode: '', name: '' }; 
}
}